package com.example.demo.assessment.image;

import com.example.demo.index.basicInfo.BasicInfo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Image")
public class Image {

    @Id
    @Column(name = "影像号")
    private int imageNum;

    @Column(name = "录入时间")
    private Date entryTime;

    @ManyToOne
    @JoinColumn(name = "病人信息", referencedColumnName = "身份证")
    private BasicInfo patientInformation;

    @Column(name = "MR号")
    private String mrNum;

    @Column(name = "头颅血管MRIMRA")
    private String headVesselMriMra;

    @Column(name = "头颅血管MRIMRA文件夹")
    private String headVesselMriMraFolder;

    @Column(name = "头颅波谱")
    private String cranialSpectroscopy;

    @Column(name = "CTCTA")
    private String ctcta;

    @Column(name = "血管彩超")
    private String vascularUltrasound;


    @Column(name = "TCD")
    private String tcd;


    public Image(){
    }


    public Image(int imageNum, Date entryTime, BasicInfo patientInformation, String mrNum, String headVesselMriMra,
                 String headVesselMriMraFolder, String cranialSpectroscopy, String ctcta, String vascularUltrasound,
                 String tcd) {
        this.imageNum = imageNum;
        this.entryTime = entryTime;
        this.patientInformation = patientInformation;
        this.mrNum = mrNum;
        this.headVesselMriMra = headVesselMriMra;
        this.headVesselMriMraFolder = headVesselMriMraFolder;
        this.cranialSpectroscopy = cranialSpectroscopy;
        this.ctcta = ctcta;
        this.vascularUltrasound = vascularUltrasound;
        this.tcd = tcd;
    }

    public int getImageNum() {
        return imageNum;
    }

    public void setImageNum(int imageNum) {
        this.imageNum = imageNum;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public BasicInfo getPatientInformation() {
        return patientInformation;
    }

    public void setPatientInformation(BasicInfo patientInformation) {
        this.patientInformation = patientInformation;
    }

    public String getMrNum() {
        return mrNum;
    }

    public void setMrNum(String mrNum) {
        this.mrNum = mrNum;
    }

    public String getHeadVesselMriMra() {
        return headVesselMriMra;
    }

    public void setHeadVesselMriMra(String headVesselMriMra) {
        this.headVesselMriMra = headVesselMriMra;
    }

    public String getHeadVesselMriMraFolder() {
        return headVesselMriMraFolder;
    }

    public void setHeadVesselMriMraFolder(String headVesselMriMraFolder) {
        this.headVesselMriMraFolder = headVesselMriMraFolder;
    }

    public String getCranialSpectroscopy() {
        return cranialSpectroscopy;
    }

    public void setCranialSpectroscopy(String cranialSpectroscopy) {
        this.cranialSpectroscopy = cranialSpectroscopy;
    }

    public String getCtcta() {
        return ctcta;
    }

    public void setCtcta(String ctcta) {
        this.ctcta = ctcta;
    }

    public String getVascularUltrasound() {
        return vascularUltrasound;
    }

    public void setVascularUltrasound(String vascularUltrasound) {
        this.vascularUltrasound = vascularUltrasound;
    }

    public String getTcd() {
        return tcd;
    }

    public void setTcd(String tcd) {
        this.tcd = tcd;
    }
}
