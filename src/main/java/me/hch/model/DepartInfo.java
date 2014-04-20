package me.hch.model;


/**
 * Created by huaiwang on 14-3-25.
 */
public class DepartInfo {
    private String HospitalCode;
    private String DepartName;
    private String DepartId;
    private String DepartIntro;
    private String DepartType;
    private String RegistryFee;
    private String ClinicFee;
    private String MZKS;
    private String Departsex;
    private String Babyflag;
    private String BabyAge;

    public String getHospitalCode() {
        return HospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        HospitalCode = hospitalCode;
    }

    public String getDepartName() {
        return DepartName;
    }

    public void setDepartName(String departName) {
        DepartName = departName;
    }

    public String getDepartId() {
        return DepartId;
    }

    public void setDepartId(String departId) {
        DepartId = departId;
    }

    public String getDepartIntro() {
        return DepartIntro;
    }

    public void setDepartIntro(String departIntro) {
        DepartIntro = departIntro;
    }

    public String getDepartType() {
        return DepartType;
    }

    public void setDepartType(String departType) {
        DepartType = departType;
    }

    public String getRegistryFee() {
        return RegistryFee;
    }

    public void setRegistryFee(String registryFee) {
        RegistryFee = registryFee;
    }

    public String getClinicFee() {
        return ClinicFee;
    }

    public void setClinicFee(String clinicFee) {
        ClinicFee = clinicFee;
    }

    public String getMZKS() {
        return MZKS;
    }

    public void setMZKS(String MZKS) {
        this.MZKS = MZKS;
    }

    public String getDepartsex() {
        return Departsex;
    }

    public void setDepartsex(String departsex) {
        Departsex = departsex;
    }

    public String getBabyflag() {
        return Babyflag;
    }

    public void setBabyflag(String babyflag) {
        Babyflag = babyflag;
    }

    public String getBabyAge() {
        return BabyAge;
    }

    public void setBabyAge(String babyAge) {
        BabyAge = babyAge;
    }
}
