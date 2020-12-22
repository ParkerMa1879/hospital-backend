package com.example.demo.assessment.testing;

import com.example.demo.index.BasicInfo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Testing")
public class Testing {
    @Id
    @Column(name = "辅助检查号")
    private long auxiliaryCheckNum;

    @ManyToOne
    @JoinColumn(name = "病人信息", referencedColumnName = "身份证")
    private BasicInfo patientInformation;

    @Column(name = "辅助检查日期")
    private Date auxiliaryExaminationDate;

    @Column(name = "高血压随机")
    private Date hypertensionRandom;

    @Column(name = "心率")
    private float heartRate;

    @Column(name = "随机血糖")
    private float randomBloodSugar;

    @Column(name = "空腹血糖")
    private float fastingBloodGlucose;

    @Column(name = "餐后2h血糖")
    private float twoHourBloodGluoseAftermeal;

    @Column(name = "HbA1c")
    private float hba1c;

    @Column(name = "CHO")
    private float cho;

    @Column(name = "TG")
    private float tg;

    @Column(name = "ldl")
    private float ldl;

    @Column(name = "HDL")
    private float hdl;

    @Column(name = "载脂蛋白A")
    private float apolipoproteinA;

    @Column(name = "载脂蛋白B")
    private float apolipoproteinB;

    @Column(name = "BUN")
    private float bun;

    @Column(name = "Cr")
    private float cr;

    @Column(name = "eGFR")
    private float egfr;

    @Column(name = "CRP")
    private float crp;

    @Column(name = "Hcy同型半胱氨酸")
    private float hcyHomocysteine;

    @Column(name = "凝血酶原时间")
    private float prothrombinTime;

    @Column(name = "国际标准化比值")
    private float internationalNormalizedRatio;

    @Column(name = "活化部分凝血酶时间")
    private float activatedPartialThrombinTime;

    @Column(name = "凝血酶时间")
    private float thrombinTime;

    @Column(name = "纤维蛋白原")
    private float fibrinogen;

    @Column(name = "D二聚体")
    private float dDimer;

    @Column(name = "ADP")
    private float adp;

    @Column(name = "花生四烯酸")
    private float arachidonicAcid;

    @Column(name = "HB")
    private float hb;

    @Column(name = "APOE")
    private float apoe;

    @Column(name = "SLOCO1B1")
    private float sloco1b1;

    @Column(name = "Aβ")
    private float aβ;

    @Column(name = "tTau")
    private float ttau;

    @Column(name = "pTau")
    private float ptau;

    @Column(name = "sRAGE")
    private float srage;

    @Column(name = "BACE1")
    private float bace1;


    public Testing(){

    }


    public Testing(long auxiliaryCheckNum, BasicInfo patientInformation, Date auxiliaryExaminationDate, Date hypertensionRandom,
                   float heartRate, float randomBloodSugar, float fastingBloodGlucose, float twoHourBloodGluoseAftermeal,
                   float hba1c, float cho, float tg, float ldl, float hdl, float apolipoproteinA, float apolipoproteinB,
                   float bun, float cr, float egfr, float crp, float hcyHomocysteine, float prothrombinTime, float internationalNormalizedRatio,
                   float activatedPartialThrombinTime, float thrombinTime, float fibrinogen, float dDimer, float adp, float arachidonicAcid,
                   float hb, float apoe, float sloco1b1, float aβ, float ttau, float ptau, float srage, float bace1) {
        this.auxiliaryCheckNum = auxiliaryCheckNum;
        this.patientInformation = patientInformation;
        this.auxiliaryExaminationDate = auxiliaryExaminationDate;
        this.hypertensionRandom = hypertensionRandom;
        this.heartRate = heartRate;
        this.randomBloodSugar = randomBloodSugar;
        this.fastingBloodGlucose = fastingBloodGlucose;
        this.twoHourBloodGluoseAftermeal = twoHourBloodGluoseAftermeal;
        this.hba1c = hba1c;
        this.cho = cho;
        this.tg = tg;
        this.ldl = ldl;
        this.hdl = hdl;
        this.apolipoproteinA = apolipoproteinA;
        this.apolipoproteinB = apolipoproteinB;
        this.bun = bun;
        this.cr = cr;
        this.egfr = egfr;
        this.crp = crp;
        this.hcyHomocysteine = hcyHomocysteine;
        this.prothrombinTime = prothrombinTime;
        this.internationalNormalizedRatio = internationalNormalizedRatio;
        this.activatedPartialThrombinTime = activatedPartialThrombinTime;
        this.thrombinTime = thrombinTime;
        this.fibrinogen = fibrinogen;
        this.dDimer = dDimer;
        this.adp = adp;
        this.arachidonicAcid = arachidonicAcid;
        this.hb = hb;
        this.apoe = apoe;
        this.sloco1b1 = sloco1b1;
        this.aβ = aβ;
        this.ttau = ttau;
        this.ptau = ptau;
        this.srage = srage;
        this.bace1 = bace1;
    }

    public long getAuxiliaryCheckNum() {
        return auxiliaryCheckNum;
    }

    public void setAuxiliaryCheckNum(long auxiliaryCheckNum) {
        this.auxiliaryCheckNum = auxiliaryCheckNum;
    }

    public BasicInfo getPatientInformation() {
        return patientInformation;
    }

    public void setPatientInformation(BasicInfo patientInformation) {
        this.patientInformation = patientInformation;
    }

    public Date getAuxiliaryExaminationDate() {
        return auxiliaryExaminationDate;
    }

    public void setAuxiliaryExaminationDate(Date auxiliaryExaminationDate) {
        this.auxiliaryExaminationDate = auxiliaryExaminationDate;
    }

    public Date getHypertensionRandom() {
        return hypertensionRandom;
    }

    public void setHypertensionRandom(Date hypertensionRandom) {
        this.hypertensionRandom = hypertensionRandom;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getRandomBloodSugar() {
        return randomBloodSugar;
    }

    public void setRandomBloodSugar(float randomBloodSugar) {
        this.randomBloodSugar = randomBloodSugar;
    }

    public float getFastingBloodGlucose() {
        return fastingBloodGlucose;
    }

    public void setFastingBloodGlucose(float fastingBloodGlucose) {
        this.fastingBloodGlucose = fastingBloodGlucose;
    }

    public float getTwoHourBloodGluoseAftermeal() {
        return twoHourBloodGluoseAftermeal;
    }

    public void setTwoHourBloodGluoseAftermeal(float twoHourBloodGluoseAftermeal) {
        this.twoHourBloodGluoseAftermeal = twoHourBloodGluoseAftermeal;
    }

    public float getHba1c() {
        return hba1c;
    }

    public void setHba1c(float hba1c) {
        this.hba1c = hba1c;
    }

    public float getCho() {
        return cho;
    }

    public void setCho(float cho) {
        this.cho = cho;
    }

    public float getTg() {
        return tg;
    }

    public void setTg(float tg) {
        this.tg = tg;
    }

    public float getLdl() {
        return ldl;
    }

    public void setLdl(float ldl) {
        this.ldl = ldl;
    }

    public float getHdl() {
        return hdl;
    }

    public void setHdl(float hdl) {
        this.hdl = hdl;
    }

    public float getApolipoproteinA() {
        return apolipoproteinA;
    }

    public void setApolipoproteinA(float apolipoproteinA) {
        this.apolipoproteinA = apolipoproteinA;
    }

    public float getApolipoproteinB() {
        return apolipoproteinB;
    }

    public void setApolipoproteinB(float apolipoproteinB) {
        this.apolipoproteinB = apolipoproteinB;
    }

    public float getBun() {
        return bun;
    }

    public void setBun(float bun) {
        this.bun = bun;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public float getEgfr() {
        return egfr;
    }

    public void setEgfr(float egfr) {
        this.egfr = egfr;
    }

    public float getCrp() {
        return crp;
    }

    public void setCrp(float crp) {
        this.crp = crp;
    }

    public float getHcyHomocysteine() {
        return hcyHomocysteine;
    }

    public void setHcyHomocysteine(float hcyHomocysteine) {
        this.hcyHomocysteine = hcyHomocysteine;
    }

    public float getProthrombinTime() {
        return prothrombinTime;
    }

    public void setProthrombinTime(float prothrombinTime) {
        this.prothrombinTime = prothrombinTime;
    }

    public float getInternationalNormalizedRatio() {
        return internationalNormalizedRatio;
    }

    public void setInternationalNormalizedRatio(float internationalNormalizedRatio) {
        this.internationalNormalizedRatio = internationalNormalizedRatio;
    }

    public float getActivatedPartialThrombinTime() {
        return activatedPartialThrombinTime;
    }

    public void setActivatedPartialThrombinTime(float activatedPartialThrombinTime) {
        this.activatedPartialThrombinTime = activatedPartialThrombinTime;
    }

    public float getThrombinTime() {
        return thrombinTime;
    }

    public void setThrombinTime(float thrombinTime) {
        this.thrombinTime = thrombinTime;
    }

    public float getFibrinogen() {
        return fibrinogen;
    }

    public void setFibrinogen(float fibrinogen) {
        this.fibrinogen = fibrinogen;
    }

    public float getdDimer() {
        return dDimer;
    }

    public void setdDimer(float dDimer) {
        this.dDimer = dDimer;
    }

    public float getAdp() {
        return adp;
    }

    public void setAdp(float adp) {
        this.adp = adp;
    }

    public float getArachidonicAcid() {
        return arachidonicAcid;
    }

    public void setArachidonicAcid(float arachidonicAcid) {
        this.arachidonicAcid = arachidonicAcid;
    }

    public float getHb() {
        return hb;
    }

    public void setHb(float hb) {
        this.hb = hb;
    }

    public float getApoe() {
        return apoe;
    }

    public void setApoe(float apoe) {
        this.apoe = apoe;
    }

    public float getSloco1b1() {
        return sloco1b1;
    }

    public void setSloco1b1(float sloco1b1) {
        this.sloco1b1 = sloco1b1;
    }

    public float getAβ() {
        return aβ;
    }

    public void setAβ(float aβ) {
        this.aβ = aβ;
    }

    public float getTtau() {
        return ttau;
    }

    public void setTtau(float ttau) {
        this.ttau = ttau;
    }

    public float getPtau() {
        return ptau;
    }

    public void setPtau(float ptau) {
        this.ptau = ptau;
    }

    public float getSrage() {
        return srage;
    }

    public void setSrage(float srage) {
        this.srage = srage;
    }

    public float getBace1() {
        return bace1;
    }

    public void setBace1(float bace1) {
        this.bace1 = bace1;
    }
}
