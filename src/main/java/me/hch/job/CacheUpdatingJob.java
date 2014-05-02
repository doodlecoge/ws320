package me.hch.job;

import me.hch.Ws320Exception;
import me.hch.bean.*;
import me.hch.model.*;
import me.hch.service.client.HisClientFactory;
import me.hch.service.client.HisClientIface;
import me.hch.util.Config;
import me.hch.util.FileUtils;
import me.hch.util.TimeUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huaiwang on 14-4-30.
 */
public class CacheUpdatingJob extends Thread {
    private static final Logger log = LoggerFactory.getLogger(CacheUpdatingJob.class);
    public static Config conf = Config.getInstance("cache.properties");
    public static final CacheUpdatingJob ins = new CacheUpdatingJob();
    private String cacheFolder = null;
    private String backupFolder = null;


    private static final String dpt_info = "-dpt-info-";
    private static final String doc_info = "-doc-info-";
    private static final String dpt_work = "-dpt-work-";
    private static final String doc_work = "-doc-work-";


    private static final String dptInfoTagName = "DepartInfo";
    private static final String docInfoTagName = "";
    private static final String dptWorkTagName = "";
    private static final String docWorkTagName = "";

    private Map<String, Field> DepartInfoFields;
    private Map<String, Field> DoctorInfoFields;
    private Map<String, Field> DepartWorkFields;
    private Map<String, Field> DoctorWorkFields;

    {
        /* cache & backup folder */
        String cache_folder = conf.getString("cache_folder");
        this.cacheFolder = prepareFolder(cache_folder).getAbsolutePath();

        String backup_folder = conf.getString("backup_folder");
        this.backupFolder = prepareFolder(cache_folder).getAbsolutePath();


        /* fields mapping */
        DepartInfoFields = new HashMap<String, Field>();
        Field[] fields = DepartInfo.class.getFields();
        for (Field field : fields) {
            String name = field.getName();
            DepartInfoFields.put(name, field);
        }


        DoctorInfoFields = new HashMap<String, Field>();
        fields = DoctorInfo.class.getFields();
        for (Field field : fields) {
            String name = field.getName();
            DoctorInfoFields.put(name, field);
        }


        DepartWorkFields = new HashMap<String, Field>();
        fields = DepartWork.class.getFields();
        for (Field field : fields) {
            String name = field.getName();
            DepartWorkFields.put(name, field);
        }

        DoctorWorkFields = new HashMap<String, Field>();
        fields = DoctorWork.class.getFields();
        for (Field field : fields) {
            String name = field.getName();
            DoctorWorkFields.put(name, field);
        }
    }

    private CacheUpdatingJob() {

    }


    public static CacheUpdatingJob getInstance() {
        return ins;
    }

    private static boolean stop = false;

    private File prepareFolder(String baseFolder) {
        File file = new File(baseFolder);

        if (file.isAbsolute()) {
            if (!FileUtils.ancestorExists(file)) {
                throw new Ws320Exception("path not exists:" + baseFolder);
            }

            if (!file.exists()) {
                file.mkdirs();
            }
        }
        // if the cache_folder is not an absolute path,
        // we assume it is a direct child folder under web root.
        else {
            Pattern ptn = Pattern.compile("[0-9a-zA-Z_\\-]+");
            Matcher matcher = ptn.matcher(baseFolder);
            if (!matcher.matches()) {
                throw new Ws320Exception("name of cache_folder incorrect");
            }
            String webroot = System.getProperty("webapp.root");
            if (webroot == null) {
                throw new Ws320Exception("system property webapp.root not specified");
            }
            file = new File(webroot + "/" + baseFolder);
            file.mkdir();
        }

        return file;
    }

    public void downloadHisData(String hospitalId) {
        String ts = TimeUtils.getTimeStamp("yyyy-MM-dd");

        prepareCacheSubFolder(ts);
        backupCache(ts, hospitalId);

        HisClientIface hisClient = HisClientFactory.getHisClient(hospitalId);

        FileUtils fu = FileUtils.getInstance(cacheFolder + File.separator + ts);
        String rst = null;
        String sss = null;


        sss = TimeUtils.getTimeStamp("yyyy-MM-dd-hh-mm-ss");
        rst = hisClient.getDepartInfo(hospitalId);
        fu.saveAs(hospitalId + dpt_info + sss + ".xml", rst);


        sss = TimeUtils.getTimeStamp("yyyy-MM-dd-hh-mm-ss");
        rst = hisClient.getDoctorInfo(hospitalId);
        fu.saveAs(hospitalId + doc_info + sss + ".xml", rst);

        sss = TimeUtils.getTimeStamp("yyyy-MM-dd-hh-mm-ss");
        rst = hisClient.getDepartWorkSchedule(hospitalId);
        fu.saveAs(hospitalId + dpt_work + sss + ".xml", rst);

        sss = TimeUtils.getTimeStamp("yyyy-MM-dd-hh-mm-ss");
        rst = hisClient.getDoctorWorkSchedule(hospitalId);
        fu.saveAs(hospitalId + doc_work + sss + ".xml", rst);
    }

    public void loadCacheFromFile(String hospitalId) {
        String ts = TimeUtils.getTimeStamp("yyyy-MM-dd");
        List<DepartInfo> departInfos = loadHisData(ts, hospitalId, DepartInfo.class, DepartInfoFields);
        List<DoctorInfo> doctorInfos = loadHisData(ts, hospitalId, DoctorInfo.class, DoctorInfoFields);
        List<DepartWork> departWorks = loadHisData(ts, hospitalId, DepartWork.class, DepartWorkFields);
        List<DoctorWork> doctorWorks = loadHisData(ts, hospitalId, DoctorWork.class, DoctorWorkFields);
    }

    /* although singleton, we still want it to be synchronized */
    public synchronized void populateCache(
            String hospitalId,
            List<DepartInfo> departInfos,
            List<DoctorInfo> doctorInfos,
            List<DepartWork> departWorks,
            List<DoctorWork> doctorWorks
    ) {

        MemoryCache cache = MemoryCache.getInstance();
        String hospName = cache.getNameById(hospitalId);

        NameIdMapper mapper = NameIdMapper.getInstance();
        mapper.clearHospital(hospName);
        mapper.addHospital(hospName, hospitalId);

        // <dpt id><docId> => doctor schedules
        Map<String, List<Schedule>> docSchedules = new HashMap<String, List<Schedule>>();
        for (DoctorWork a : doctorWorks) {
            Schedule schedule = new Schedule();

//            "workDate",
//            "workType",
//            "workStatus",
//            "expertFee"

            schedule.setWorkDate(TimeUtils.stringToXMLGregorianCalendar(a.WorkDate, "yyyy-MM-dd"));
            schedule.setWorkType(a.WorkType);
            schedule.setWorkStatus(a.WorkStatus);
            schedule.setExpertFee(new BigDecimal(a.Expertsfee));

            String key = a.DepartId + a.DoctorId;

            if (!docSchedules.containsKey(key)) {
                docSchedules.put(key, new ArrayList<Schedule>());
            }

            docSchedules.get(key).add(schedule);
        }

        // dpt id => doctors
        Map<String, List<Doctor>> dptDoctors = new HashMap<String, List<Doctor>>();
        for (DoctorInfo aaa : doctorInfos) {
            Doctor doc = new Doctor();
            doc.setDoctorName(aaa.DoctorName);

            // "docSex",
            // "docRank",
            // "doctorInro",
            // "docMajor",
            // "isExpert",
            // "registryFee",
            // "clinicFee"

            Doctor.DocBasic docBasic = new Doctor.DocBasic();
            docBasic.setDocSex(aaa.DoctorSex);
            docBasic.setDocRank(aaa.DoctorRank);
            docBasic.setDoctorInro(aaa.DoctorInro);
            docBasic.setDocMajor(""); // fixme: ?
            docBasic.setIsExpert(Boolean.getBoolean(aaa.IsExpert));
            docBasic.setRegistryFee(null);
            docBasic.setClinicFee(null);

            doc.setDocBasic(docBasic);


            List<Schedule> schedules = doc.getSchedule();
            schedules.clear();
            schedules.addAll(docSchedules.get(aaa.DepartId + aaa.DoctorId));

            if (!dptDoctors.containsKey(aaa.DepartId)) {
                dptDoctors.put(aaa.DepartId, new ArrayList<Doctor>());
            }
            dptDoctors.get(aaa.DepartId).add(doc);
        }


        // <dpt id> => department schedules
        Map<String, List<Schedule>> dptScheles = new HashMap<String, List<Schedule>>();
        for (DepartWork a : departWorks) {
            Schedule schedule = new Schedule();

//            "workDate",
//            "workType",
//            "workStatus",
//            "expertFee"

            schedule.setWorkDate(TimeUtils.stringToXMLGregorianCalendar(a.WorkDate, "yyyy-MM-dd"));
            schedule.setWorkType(a.WorkType);
            schedule.setWorkStatus(a.WorkStatus);
            schedule.setExpertFee(null);

            if (!dptScheles.containsKey(a.DepartId)) {
                dptScheles.put(a.DepartId, new ArrayList<Schedule>());
            }

            dptScheles.get(a.DepartId).add(schedule);
        }

        // department infos
        List<Depart> depts = new ArrayList<Depart>();
        for (DepartInfo info : departInfos) {
            Depart dpt = new Depart();

            // name
            dpt.setDepartName(info.DepartName);

            Depart.DepartBasic dptBasic = new Depart.DepartBasic();
            dptBasic.setChildAge(Short.parseShort(info.BabyAge));
            dptBasic.setClinicFee(new BigDecimal(info.ClinicFee));
            dptBasic.setDepartIntro(info.DepartIntro);
            dptBasic.setDepartSex(info.Departsex);
            dptBasic.setDepartType(info.DepartType);
            dptBasic.setRegistryFee(new BigDecimal(info.RegistryFee));
            dptBasic.setLimited(1l); // fixme: what's it?

            // basic
            dpt.setDepartBasic(dptBasic);

            // schedules
            List<Schedule> schedules = dpt.getSchedule();
            schedules.clear();
            schedules.addAll(dptScheles.get(info.DepartId));

            // doctors
            List<Doctor> doctors = dpt.getDoctor();
            doctors.clear();
            doctors.addAll(dptDoctors.get(info.DepartId));


            depts.add(dpt);
        }



        cache.addDeparts(hospName, depts);


        // todo: populate name id mapper
//        NameIdMapper mapper = NameIdMapper.getInstance();
//
//        mapper.addHospital(hospName, hospitalId);
//
//        for (Depart dept : depts) {
//            mapper.addDepartment(hospName, D);
//        }






    }

    private void prepareCacheSubFolder(String ts) {
        File subFolder = new File(cacheFolder + File.separator + ts);

        if (!subFolder.exists()) {
            subFolder.mkdir();
        }
    }

    private void backupCache(String subFolderName, String hospitalId) {
        // todo: move existing file to backup folder

    }


    private <T> List<T> loadHisData(String ts, String hospitalId, Class<T> klass, Map<String, Field> fields) {
        String prefix = hospitalId + dpt_info;
        File folder = new File(cacheFolder + File.separator + ts);

        File[] files = folder.listFiles(new FileNameStartsWithFilter(prefix));

        if (files == null) {
            throw new Ws320Exception("file with prefix [" + prefix + "] not found");
        }

        if (files.length != 1) {
            throw new Ws320Exception("expect 1 file start with [" + prefix + "], actual " + files.length);
        }

        try {
            return unmarshalHisXml(files[0], klass, fields);
        } catch (Exception e) {
            throw new Ws320Exception(e);
        }
    }

    private <T> List<T> unmarshalHisXml(File file, Class<T> klass, Map<String, Field> fields) throws DocumentException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element root = document.getRootElement();
        List<Element> dptInfos = root.elements();


        List<T> departInfos = new ArrayList<T>();
        for (int i = 0; i < dptInfos.size(); i++) {
            Element dptInfo = dptInfos.get(i);

            if (!dptInfo.getName().equalsIgnoreCase(dptInfoTagName)) {
                log.warn(file.getAbsolutePath() + ": tag #" + i + ", name [" + dptInfo.getName() + "] not " + dptInfoTagName);
                continue;
            }

            List<Element> props = dptInfo.elements();

            if (props.size() != fields.size()) {
                throw new Ws320Exception(file.getAbsolutePath() + ": tag #" + i + ", number of children != size of DepartInfo fields");
            }

            T di = klass.newInstance();

            for (Element prop : props) {
                Field field = fields.get(prop.getName());
                field.set(di, prop.getText());
            }

            departInfos.add(di);
        }
        return departInfos;
    }


    private void _sleep(long mills) {
        try {
            sleep(mills);
        } catch (InterruptedException e) {
            throw new Ws320Exception(e);
        }
    }


    static class FileNameStartsWithFilter implements FilenameFilter {
        private String prefix;

        public FileNameStartsWithFilter(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.startsWith(prefix);
        }
    }
}
