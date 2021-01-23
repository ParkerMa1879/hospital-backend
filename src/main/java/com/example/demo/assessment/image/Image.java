package com.example.demo.assessment.image;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "basicInfoId")
    private long basicInfoId;

    @Column(name = "影像号")
    private long imageNum;

    @Temporal(TemporalType.DATE)
    @Column(name = "录入时间")
    private Date entryTime;

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


    public Image(long basicInfoId, long imageNum, Date entryTime, String mrNum, String headVesselMriMra,
                 String headVesselMriMraFolder, String cranialSpectroscopy, String ctcta, String vascularUltrasound,
                 String tcd) {
        this.basicInfoId = basicInfoId;
        this.imageNum = imageNum;
        this.entryTime = entryTime;
        this.mrNum = mrNum;
        this.headVesselMriMra = headVesselMriMra;
        this.headVesselMriMraFolder = headVesselMriMraFolder;
        this.cranialSpectroscopy = cranialSpectroscopy;
        this.ctcta = ctcta;
        this.vascularUltrasound = vascularUltrasound;
        this.tcd = tcd;
    }

    public long getId() {
        return id;
    }

    public long getBasicInfoId() {
        return basicInfoId;
    }

    public void setBasicInfoId(long basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    public long getImageNum() {
        return imageNum;
    }

    public void setImageNum(long imageNum) {
        this.imageNum = imageNum;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
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
