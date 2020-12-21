package com.example.demo.index.basicInfo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_basicInfo")
public class BasicInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "姓名")
    private String name;

    @Column(name = "年龄")
    private String age;

    @Column(name = "身份证")
    private String identification;

    @Column(name = "性别")
    private String gender;

    @Temporal(TemporalType.DATE)
    @Column (name = "日期")
    private Date date;

    @Column(name = "姓名拼音")
    private String namePinyin;

    @Column(name = "MRraw")
    private String mrRaw;

    @Column(name = "MRsort")
    private String mrSort;

    @Column(name = "Mrdate")
    private String mrDate;

    @Column(name = "基信备注复诊注意事项")
    private String remarkForFollowupVisit;

    @Column(name = "CSVD编号")
    private String csvdNum;

    @Column(name = "首要诊断")
    private String primDiag;

    @Column(name = "随访年")
    private String followupYear;

    @Column(name = "退出")
    private String dropOut;


    @Column(name = "住院号")
    private String hospitalNum;


    @Column(name = "床号")
    private String bedNum;

    @Column(name = "门诊号")
    private String clinicNum;


    @Temporal(TemporalType.DATE)
    @Column(name = "出生日期")
    private Date birthDate;

    @Column(name = "民族")
    private String ethnic;


    @Column(name = "文化")
    private String eduLevel;


    @Column(name = "教育年限")
    private String eduYear;

    @Column(name = "职业")
    private String profession;


    @Column(name = "工作性质")
    private String work;

    @Column(name = "家庭地址")
    private String address;


    @Column(name = "联系方式")
    private String contact;

    @Column(name = "标本备注")
    private String specimenRemark;

    @Column(name = "是否留血")
    private String blood;

    @Column(name = "留血盒子")
    private String bloodBox;

    @Column(name = "血样编号")
    private String bloodSampleNum;

    @Column(name = "脑脊液编号")
    private String cerebrospinalFluidNum;

    @Column(name = "尿液编号")
    private String urineNum;

    @Column(name = "病史")
    private String medicalHistory;

    @Column(name = "记忆力下降病程")
    private String memoryDeclineCourse;

    @Column(name = "记忆力损害加重")
    private String increasedMemoryImpairment;

    @Column(name = "婚姻状况")
    private String maritalStatus;


    @Column(name = "身高")
    private String height;

    @Column(name = "体重")
    private String weight;

    @Column(name = "脑血管病")
    private String cerebrovascularDisease;

    @Column(name = "脑血管病年")
    private String cerebrovascularDiseaseYear;

    @Column(name = "脑血管病稳定")
    private String stableCerebrovascularDisease;

    @Column(name = "脑血管病服药")
    private String cerebrovascularDiseaseMedication;

    @Column(name = "CNS疾病描述")
    private String cnsDiseaseDescription;

    @Column(name = "高血压")
    private String hypertension;

    @Column(name = "高血压年")
    private String hypertensionYear;

    @Column(name = "高血压最高")
    private String highestHypertension;

    @Column(name = "高血压平均")
    private String averageHypertension;

    @Column(name = "高血压稳定")
    private String stableHypertension;

    @Column(name = "高血压服药")
    private String hypertensionMedication;

    @Column(name = "糖尿病")
    private String diabetes;

    @Column(name = "糖尿病年")
    private String diabetesYear;

    @Column(name = "糖尿病稳定")
    private String stableDiabetes;

    @Column(name = "糖尿病服药")
    private String diabetesMedication;

    @Column(name = "冠心病")
    private String coronaryDisease;

    @Column(name = "冠心病年")
    private String coronaryDiseaseYear;

    @Column(name = "冠心病稳定")
    private String stableCoronaryDisease;

    @Column(name = "房颤")
    private String atrialFibrillation;

    @Column(name = "房颤年")
    private String atrialFibrillationYear;

    @Column(name = "房颤控制")
    private String atrialFibrillationControl;

    @Column(name = "高脂血症")
    private String hyperlipidemia;

    @Column(name = "高脂血症年")
    private String hyperlipidemiaYear;

    @Column(name = "高脂血症稳定")
    private String stableHyperlipidemia;

    @Column(name = "高脂血症服药")
    private String hyperlipidemiaMedication;

    @Column(name = "就诊备注")
    private String medicalRemark;

    @Column(name = "其他药物")
    private String otherMedicine;

    @Column(name = "吸烟")
    private String smoke;

    @Column(name = "抽烟史年")
    private String smokeYear;

    @Column(name = "抽烟根天")
    private String smokeNumPerDay;

    @Column(name = "戒烟")
    private String quitSmoking;

    @Column(name = "戒烟年")
    private String quitSmokingYear;

    @Column(name = "饮酒")
    private String Drink;

    @Column(name = "酗酒史年")
    private String historyOfAlcoholism;

    @Column(name = "酒精g天")
    private String alcoholGPerDay;

    @Column(name = "戒酒")
    private String quitDrinking;

    @Column(name = "戒酒年")
    private String quitDrinkingYear;

    @Column(name = "家族史")
    private String familyHistory;

    @Column(name = "家族史描述")
    private String familyHistoryDiscription;


    public BasicInfo() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getMrRaw() {
        return mrRaw;
    }

    public void setMrRaw(String mrRaw) {
        this.mrRaw = mrRaw;
    }

    public String getMrSort() {
        return mrSort;
    }

    public void setMrSort(String mrSort) {
        this.mrSort = mrSort;
    }

    public String getMrDate() {
        return mrDate;
    }

    public void setMrDate(String mrDate) {
        this.mrDate = mrDate;
    }

    public String getRemarkForFollowupVisit() {
        return remarkForFollowupVisit;
    }

    public void setRemarkForFollowupVisit(String remarkForFollowupVisit) {
        this.remarkForFollowupVisit = remarkForFollowupVisit;
    }

    public String getCsvdNum() {
        return csvdNum;
    }

    public void setCsvdNum(String csvdNum) {
        this.csvdNum = csvdNum;
    }

    public String getPrimDiag() {
        return primDiag;
    }

    public void setPrimDiag(String primDiag) {
        this.primDiag = primDiag;
    }

    public String getFollowupYear() {
        return followupYear;
    }

    public void setFollowupYear(String followupYear) {
        this.followupYear = followupYear;
    }

    public String getDropOut() {
        return dropOut;
    }

    public void setDropOut(String dropOut) {
        this.dropOut = dropOut;
    }

    public String getHospitalNum() {
        return hospitalNum;
    }

    public void setHospitalNum(String hospitalNum) {
        this.hospitalNum = hospitalNum;
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }

    public String getClinicNum() {
        return clinicNum;
    }

    public void setClinicNum(String clinicNum) {
        this.clinicNum = clinicNum;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel;
    }

    public String getEduYear() {
        return eduYear;
    }

    public void setEduYear(String eduYear) {
        this.eduYear = eduYear;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSpecimenRemark() {
        return specimenRemark;
    }

    public void setSpecimenRemark(String specimenRemark) {
        this.specimenRemark = specimenRemark;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getBloodBox() {
        return bloodBox;
    }

    public void setBloodBox(String bloodBox) {
        this.bloodBox = bloodBox;
    }

    public String getBloodSampleNum() {
        return bloodSampleNum;
    }

    public void setBloodSampleNum(String bloodSampleNum) {
        this.bloodSampleNum = bloodSampleNum;
    }

    public String getCerebrospinalFluidNum() {
        return cerebrospinalFluidNum;
    }

    public void setCerebrospinalFluidNum(String cerebrospinalFluidNum) {
        this.cerebrospinalFluidNum = cerebrospinalFluidNum;
    }

    public String getUrineNum() {
        return urineNum;
    }

    public void setUrineNum(String urineNum) {
        this.urineNum = urineNum;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getMemoryDeclineCourse() {
        return memoryDeclineCourse;
    }

    public void setMemoryDeclineCourse(String memoryDeclineCourse) {
        this.memoryDeclineCourse = memoryDeclineCourse;
    }

    public String getIncreasedMemoryImpairment() {
        return increasedMemoryImpairment;
    }

    public void setIncreasedMemoryImpairment(String increasedMemoryImpairment) {
        this.increasedMemoryImpairment = increasedMemoryImpairment;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCerebrovascularDisease() {
        return cerebrovascularDisease;
    }

    public void setCerebrovascularDisease(String cerebrovascularDisease) {
        this.cerebrovascularDisease = cerebrovascularDisease;
    }

    public String getCerebrovascularDiseaseYear() {
        return cerebrovascularDiseaseYear;
    }

    public void setCerebrovascularDiseaseYear(String cerebrovascularDiseaseYear) {
        this.cerebrovascularDiseaseYear = cerebrovascularDiseaseYear;
    }

    public String getStableCerebrovascularDisease() {
        return stableCerebrovascularDisease;
    }

    public void setStableCerebrovascularDisease(String stableCerebrovascularDisease) {
        this.stableCerebrovascularDisease = stableCerebrovascularDisease;
    }

    public String getCerebrovascularDiseaseMedication() {
        return cerebrovascularDiseaseMedication;
    }

    public void setCerebrovascularDiseaseMedication(String cerebrovascularDiseaseMedication) {
        this.cerebrovascularDiseaseMedication = cerebrovascularDiseaseMedication;
    }

    public String getCnsDiseaseDescription() {
        return cnsDiseaseDescription;
    }

    public void setCnsDiseaseDescription(String cnsDiseaseDescription) {
        this.cnsDiseaseDescription = cnsDiseaseDescription;
    }

    public String getHypertension() {
        return hypertension;
    }

    public void setHypertension(String hypertension) {
        this.hypertension = hypertension;
    }

    public String getHypertensionYear() {
        return hypertensionYear;
    }

    public void setHypertensionYear(String hypertensionYear) {
        this.hypertensionYear = hypertensionYear;
    }

    public String getHighestHypertension() {
        return highestHypertension;
    }

    public void setHighestHypertension(String highestHypertension) {
        this.highestHypertension = highestHypertension;
    }

    public String getAverageHypertension() {
        return averageHypertension;
    }

    public void setAverageHypertension(String averageHypertension) {
        this.averageHypertension = averageHypertension;
    }

    public String getStableHypertension() {
        return stableHypertension;
    }

    public void setStableHypertension(String stableHypertension) {
        this.stableHypertension = stableHypertension;
    }

    public String getHypertensionMedication() {
        return hypertensionMedication;
    }

    public void setHypertensionMedication(String hypertensionMedication) {
        this.hypertensionMedication = hypertensionMedication;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getDiabetesYear() {
        return diabetesYear;
    }

    public void setDiabetesYear(String diabetesYear) {
        this.diabetesYear = diabetesYear;
    }

    public String getStableDiabetes() {
        return stableDiabetes;
    }

    public void setStableDiabetes(String stableDiabetes) {
        this.stableDiabetes = stableDiabetes;
    }

    public String getDiabetesMedication() {
        return diabetesMedication;
    }

    public void setDiabetesMedication(String diabetesMedication) {
        this.diabetesMedication = diabetesMedication;
    }

    public String getCoronaryDisease() {
        return coronaryDisease;
    }

    public void setCoronaryDisease(String coronaryDisease) {
        this.coronaryDisease = coronaryDisease;
    }

    public String getCoronaryDiseaseYear() {
        return coronaryDiseaseYear;
    }

    public void setCoronaryDiseaseYear(String coronaryDiseaseYear) {
        this.coronaryDiseaseYear = coronaryDiseaseYear;
    }

    public String getStableCoronaryDisease() {
        return stableCoronaryDisease;
    }

    public void setStableCoronaryDisease(String stableCoronaryDisease) {
        this.stableCoronaryDisease = stableCoronaryDisease;
    }

    public String getAtrialFibrillation() {
        return atrialFibrillation;
    }

    public void setAtrialFibrillation(String atrialFibrillation) {
        this.atrialFibrillation = atrialFibrillation;
    }

    public String getAtrialFibrillationYear() {
        return atrialFibrillationYear;
    }

    public void setAtrialFibrillationYear(String atrialFibrillationYear) {
        this.atrialFibrillationYear = atrialFibrillationYear;
    }

    public String getAtrialFibrillationControl() {
        return atrialFibrillationControl;
    }

    public void setAtrialFibrillationControl(String atrialFibrillationControl) {
        this.atrialFibrillationControl = atrialFibrillationControl;
    }

    public String getHyperlipidemia() {
        return hyperlipidemia;
    }

    public void setHyperlipidemia(String hyperlipidemia) {
        this.hyperlipidemia = hyperlipidemia;
    }

    public String getHyperlipidemiaYear() {
        return hyperlipidemiaYear;
    }

    public void setHyperlipidemiaYear(String hyperlipidemiaYear) {
        this.hyperlipidemiaYear = hyperlipidemiaYear;
    }

    public String getStableHyperlipidemia() {
        return stableHyperlipidemia;
    }

    public void setStableHyperlipidemia(String stableHyperlipidemia) {
        this.stableHyperlipidemia = stableHyperlipidemia;
    }

    public String getHyperlipidemiaMedication() {
        return hyperlipidemiaMedication;
    }

    public void setHyperlipidemiaMedication(String hyperlipidemiaMedication) {
        this.hyperlipidemiaMedication = hyperlipidemiaMedication;
    }

    public String getMedicalRemark() {
        return medicalRemark;
    }

    public void setMedicalRemark(String medicalRemark) {
        this.medicalRemark = medicalRemark;
    }

    public String getOtherMedicine() {
        return otherMedicine;
    }

    public void setOtherMedicine(String otherMedicine) {
        this.otherMedicine = otherMedicine;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public String getSmokeYear() {
        return smokeYear;
    }

    public void setSmokeYear(String smokeYear) {
        this.smokeYear = smokeYear;
    }

    public String getSmokeNumPerDay() {
        return smokeNumPerDay;
    }

    public void setSmokeNumPerDay(String smokeNumPerDay) {
        this.smokeNumPerDay = smokeNumPerDay;
    }

    public String getQuitSmoking() {
        return quitSmoking;
    }

    public void setQuitSmoking(String quitSmoking) {
        this.quitSmoking = quitSmoking;
    }

    public String getQuitSmokingYear() {
        return quitSmokingYear;
    }

    public void setQuitSmokingYear(String quitSmokingYear) {
        this.quitSmokingYear = quitSmokingYear;
    }

    public String getDrink() {
        return Drink;
    }

    public void setDrink(String drink) {
        Drink = drink;
    }

    public String getHistoryOfAlcoholism() {
        return historyOfAlcoholism;
    }

    public void setHistoryOfAlcoholism(String historyOfAlcoholism) {
        this.historyOfAlcoholism = historyOfAlcoholism;
    }

    public String getAlcoholGPerDay() {
        return alcoholGPerDay;
    }

    public void setAlcoholGPerDay(String alcoholGPerDay) {
        this.alcoholGPerDay = alcoholGPerDay;
    }

    public String getQuitDrinking() {
        return quitDrinking;
    }

    public void setQuitDrinking(String quitDrinking) {
        this.quitDrinking = quitDrinking;
    }

    public String getQuitDrinkingYear() {
        return quitDrinkingYear;
    }

    public void setQuitDrinkingYear(String quitDrinkingYear) {
        this.quitDrinkingYear = quitDrinkingYear;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    public String getFamilyHistoryDiscription() {
        return familyHistoryDiscription;
    }

    public void setFamilyHistoryDiscription(String familyHistoryDiscription) {
        this.familyHistoryDiscription = familyHistoryDiscription;
    }

    public BasicInfo(String name, String age, String identification, String gender, Date date, String namePinyin, String mrRaw,
                     String mrSort, String mrDate, String remarkForFollowupVisit, String csvdNum, String primDiag, String followupYear,
                     String dropOut, String hospitalNum, String bedNum, String clinicNum, Date birthDate, String ethnic, String eduLevel,
                     String eduYear, String profession, String work, String address, String contact, String specimenRemark, String blood,
                     String bloodBox, String bloodSampleNum, String cerebrospinalFluidNum, String urineNum, String medicalHistory,
                     String memoryDeclineCourse, String increasedMemoryImpairment, String maritalStatus, String height, String weight,
                     String cerebrovascularDisease, String cerebrovascularDiseaseYear, String stableCerebrovascularDisease,
                     String cerebrovascularDiseaseMedication, String cnsDiseaseDescription, String hypertension, String hypertensionYear,
                     String highestHypertension, String averageHypertension, String stableHypertension, String hypertensionMedication,
                     String diabetes, String diabetesYear, String stableDiabetes, String diabetesMedication, String coronaryDisease,
                     String coronaryDiseaseYear, String stableCoronaryDisease, String atrialFibrillation, String atrialFibrillationYear,
                     String atrialFibrillationControl, String hyperlipidemia, String hyperlipidemiaYear, String stableHyperlipidemia,
                     String hyperlipidemiaMedication, String medicalRemark, String otherMedicine, String smoke, String smokeYear, String smokeNumPerDay,
                     String quitSmoking, String quitSmokingYear, String drink, String historyOfAlcoholism, String alcoholGPerDay, String quitDrinking,
                     String quitDrinkingYear, String familyHistory, String familyHistoryDiscription) {
        this.name = name;
        this.age = age;
        this.identification = identification;
        this.gender = gender;
        this.date = date;
        this.namePinyin = namePinyin;
        this.mrRaw = mrRaw;
        this.mrSort = mrSort;
        this.mrDate = mrDate;
        this.remarkForFollowupVisit = remarkForFollowupVisit;
        this.csvdNum = csvdNum;
        this.primDiag = primDiag;
        this.followupYear = followupYear;
        this.dropOut = dropOut;
        this.hospitalNum = hospitalNum;
        this.bedNum = bedNum;
        this.clinicNum = clinicNum;
        this.birthDate = birthDate;
        this.ethnic = ethnic;
        this.eduLevel = eduLevel;
        this.eduYear = eduYear;
        this.profession = profession;
        this.work = work;
        this.address = address;
        this.contact = contact;
        this.specimenRemark = specimenRemark;
        this.blood = blood;
        this.bloodBox = bloodBox;
        this.bloodSampleNum = bloodSampleNum;
        this.cerebrospinalFluidNum = cerebrospinalFluidNum;
        this.urineNum = urineNum;
        this.medicalHistory = medicalHistory;
        this.memoryDeclineCourse = memoryDeclineCourse;
        this.increasedMemoryImpairment = increasedMemoryImpairment;
        this.maritalStatus = maritalStatus;
        this.height = height;
        this.weight = weight;
        this.cerebrovascularDisease = cerebrovascularDisease;
        this.cerebrovascularDiseaseYear = cerebrovascularDiseaseYear;
        this.stableCerebrovascularDisease = stableCerebrovascularDisease;
        this.cerebrovascularDiseaseMedication = cerebrovascularDiseaseMedication;
        this.cnsDiseaseDescription = cnsDiseaseDescription;
        this.hypertension = hypertension;
        this.hypertensionYear = hypertensionYear;
        this.highestHypertension = highestHypertension;
        this.averageHypertension = averageHypertension;
        this.stableHypertension = stableHypertension;
        this.hypertensionMedication = hypertensionMedication;
        this.diabetes = diabetes;
        this.diabetesYear = diabetesYear;
        this.stableDiabetes = stableDiabetes;
        this.diabetesMedication = diabetesMedication;
        this.coronaryDisease = coronaryDisease;
        this.coronaryDiseaseYear = coronaryDiseaseYear;
        this.stableCoronaryDisease = stableCoronaryDisease;
        this.atrialFibrillation = atrialFibrillation;
        this.atrialFibrillationYear = atrialFibrillationYear;
        this.atrialFibrillationControl = atrialFibrillationControl;
        this.hyperlipidemia = hyperlipidemia;
        this.hyperlipidemiaYear = hyperlipidemiaYear;
        this.stableHyperlipidemia = stableHyperlipidemia;
        this.hyperlipidemiaMedication = hyperlipidemiaMedication;
        this.medicalRemark = medicalRemark;
        this.otherMedicine = otherMedicine;
        this.smoke = smoke;
        this.smokeYear = smokeYear;
        this.smokeNumPerDay = smokeNumPerDay;
        this.quitSmoking = quitSmoking;
        this.quitSmokingYear = quitSmokingYear;
        this.Drink = drink;
        this.historyOfAlcoholism = historyOfAlcoholism;
        this.alcoholGPerDay = alcoholGPerDay;
        this.quitDrinking = quitDrinking;
        this.quitDrinkingYear = quitDrinkingYear;
        this.familyHistory = familyHistory;
        this.familyHistoryDiscription = familyHistoryDiscription;
    }

    @Override
    public String toString() {
        return "BasicInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", identification='" + identification + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", namePinyin='" + namePinyin + '\'' +
                ", mrRaw='" + mrRaw + '\'' +
                ", mrSort='" + mrSort + '\'' +
                ", mrDate='" + mrDate + '\'' +
                ", remarkForFollowupVisit='" + remarkForFollowupVisit + '\'' +
                ", csvdNum='" + csvdNum + '\'' +
                ", primDiag='" + primDiag + '\'' +
                ", followupYear='" + followupYear + '\'' +
                ", dropOut='" + dropOut + '\'' +
                ", hospitalNum='" + hospitalNum + '\'' +
                ", bedNum='" + bedNum + '\'' +
                ", clinicNum='" + clinicNum + '\'' +
                ", birthDate=" + birthDate +
                ", ethnic='" + ethnic + '\'' +
                ", eduLevel='" + eduLevel + '\'' +
                ", eduYear='" + eduYear + '\'' +
                ", profession='" + profession + '\'' +
                ", work='" + work + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", specimenRemark='" + specimenRemark + '\'' +
                ", blood='" + blood + '\'' +
                ", bloodBox='" + bloodBox + '\'' +
                ", bloodSampleNum='" + bloodSampleNum + '\'' +
                ", cerebrospinalFluidNum='" + cerebrospinalFluidNum + '\'' +
                ", urineNum='" + urineNum + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", memoryDeclineCourse='" + memoryDeclineCourse + '\'' +
                ", increasedMemoryImpairment='" + increasedMemoryImpairment + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", cerebrovascularDisease='" + cerebrovascularDisease + '\'' +
                ", cerebrovascularDiseaseYear='" + cerebrovascularDiseaseYear + '\'' +
                ", stableCerebrovascularDisease='" + stableCerebrovascularDisease + '\'' +
                ", cerebrovascularDiseaseMedication='" + cerebrovascularDiseaseMedication + '\'' +
                ", cnsDiseaseDescription='" + cnsDiseaseDescription + '\'' +
                ", hypertension='" + hypertension + '\'' +
                ", hypertensionYear='" + hypertensionYear + '\'' +
                ", highestHypertension='" + highestHypertension + '\'' +
                ", averageHypertension='" + averageHypertension + '\'' +
                ", stableHypertension='" + stableHypertension + '\'' +
                ", hypertensionMedication='" + hypertensionMedication + '\'' +
                ", diabetes='" + diabetes + '\'' +
                ", diabetesYear='" + diabetesYear + '\'' +
                ", stableDiabetes='" + stableDiabetes + '\'' +
                ", diabetesMedication='" + diabetesMedication + '\'' +
                ", coronaryDisease='" + coronaryDisease + '\'' +
                ", coronaryDiseaseYear='" + coronaryDiseaseYear + '\'' +
                ", stableCoronaryDisease='" + stableCoronaryDisease + '\'' +
                ", atrialFibrillation='" + atrialFibrillation + '\'' +
                ", atrialFibrillationYear='" + atrialFibrillationYear + '\'' +
                ", atrialFibrillationControl='" + atrialFibrillationControl + '\'' +
                ", hyperlipidemia='" + hyperlipidemia + '\'' +
                ", hyperlipidemiaYear='" + hyperlipidemiaYear + '\'' +
                ", stableHyperlipidemia='" + stableHyperlipidemia + '\'' +
                ", hyperlipidemiaMedication='" + hyperlipidemiaMedication + '\'' +
                ", medicalRemark='" + medicalRemark + '\'' +
                ", otherMedicine='" + otherMedicine + '\'' +
                ", smoke='" + smoke + '\'' +
                ", smokeYear='" + smokeYear + '\'' +
                ", smokeNumPerDay='" + smokeNumPerDay + '\'' +
                ", quitSmoking='" + quitSmoking + '\'' +
                ", quitSmokingYear='" + quitSmokingYear + '\'' +
                ", Drink='" + Drink + '\'' +
                ", historyOfAlcoholism='" + historyOfAlcoholism + '\'' +
                ", alcoholGPerDay='" + alcoholGPerDay + '\'' +
                ", quitDrinking='" + quitDrinking + '\'' +
                ", quitDrinkingYear='" + quitDrinkingYear + '\'' +
                ", familyHistory='" + familyHistory + '\'' +
                ", familyHistoryDiscription='" + familyHistoryDiscription + '\'' +
                '}';
    }
}