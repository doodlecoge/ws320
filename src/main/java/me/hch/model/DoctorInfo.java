package me.hch.model;

/**
 * Created by huaiwang on 14-3-25.
 */
public class DoctorInfo {
    private String Hospitalcode;
    private String DoctorId;
    private String DepartId;
    private String DoctorName;
    private String DoctorSex;
    private String DoctorRank;
    private String DoctorIntor;
    private String DoctorInro;
    private String IsExpert;
    private String AVeworktime;

    public String getHospitalcode() {
        return Hospitalcode;
    }

    public void setHospitalcode(String hospitalcode) {
        Hospitalcode = hospitalcode;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String doctorId) {
        DoctorId = doctorId;
    }

    public String getDepartId() {
        return DepartId;
    }

    public void setDepartId(String departId) {
        DepartId = departId;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDoctorSex() {
        return DoctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        DoctorSex = doctorSex;
    }

    public String getDoctorRank() {
        return DoctorRank;
    }

    public void setDoctorRank(String doctorRank) {
        DoctorRank = doctorRank;
    }

    public String getDoctorIntor() {
        return DoctorIntor;
    }

    public void setDoctorIntor(String doctorIntor) {
        DoctorIntor = doctorIntor;
    }

    public String getDoctorInro() {
        return DoctorInro;
    }

    public void setDoctorInro(String doctorInro) {
        DoctorInro = doctorInro;
    }

    public String getIsExpert() {
        return IsExpert;
    }

    public void setIsExpert(String isExpert) {
        IsExpert = isExpert;
    }

    public String getAVeworktime() {
        return AVeworktime;
    }

    public void setAVeworktime(String AVeworktime) {
        this.AVeworktime = AVeworktime;
    }
}
