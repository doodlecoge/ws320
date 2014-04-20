package me.hch;

import me.hch.model.*;
import me.hch.util.FileUtils;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 14-4-20.
 */
public class XmlAnalyzerTest {
    public static void main(String[] args) throws IOException, DocumentException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        // depart info
        String fileContent = FileUtils.getInstance("./ignore").getFileContent("FQYY.getDepartInfo.xml");


        List<DepartInfo> departs = XmlAnalyzer.getDeparts(fileContent);

        for (DepartInfo depart : departs) {
            System.out.println(depart.getDepartName());
        }


        // doctor info
        fileContent = FileUtils.getInstance("./ignore").getFileContent("FQYY.getDoctorInfo.xml");
        List<DoctorInfo> doctors = XmlAnalyzer.getDoctors(fileContent);
        for (DoctorInfo doctor : doctors) {
            System.out.println(doctor.getDoctorName());
        }

        // depart works
        fileContent = FileUtils.getInstance("./ignore").getFileContent("FQYY.getDepartWorkSchedule.xml");
        List<DepartWork> departWorks = XmlAnalyzer.getDepartWorks(fileContent);
        for (DepartWork departWork : departWorks) {
            System.out.println(departWork.getDepartId());
        }

        // doctor works
        fileContent = FileUtils.getInstance("./ignore").getFileContent("FQYY.getDoctorWorkSchedule.xml");
        List<DoctorWork> doctorWorks = XmlAnalyzer.getDoctorWorks(fileContent);
        for (DoctorWork doctorWork : doctorWorks) {
            System.out.println(doctorWork.getDoctorId());
        }
    }
}
