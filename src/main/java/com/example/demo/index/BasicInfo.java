package com.example.demo.index;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "basicInfos")
public class BasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "姓名")
    private String name;

    @Column(name = "年龄")
    private int age;

    @Column(name = "身份证")
    private long identification;

    @Column(name = "性别")
    private String gender;

    @Temporal(TemporalType.DATE)
    @Column (name = "日期")
    private Date date;

    @Column(name = "姓名拼音")
    private String namePinyin;

    @Column(name = "MRraw")
    private int mrRaw;

    @Column(name = "MRsort")
    private int mrSort;

    @Column(name = "Mrdate")
    private int mrDate;

    @Column(name = "基信备注复诊注意事项")
    private String remarkForFollowupVisit;

    @Column(name = "CSVD编号")
    private int csvdNum;

    @Column(name = "首要诊断")
    private String primDiag;

    @Column(name = "随访年")
    private int followupYear;

    @Column(name = "退出")
    private int dropOut;


    @Column(name = "住院号")
    private long hospitalNum;


    @Column(name = "床号")
    private long bedNum;

    @Column(name = "门诊号")
    private long clinicNum;


    @Temporal(TemporalType.DATE)
    @Column(name = "出生日期")
    private Date birthDate;

    @Column(name = "民族")
    private String ethnic;


    @Column(name = "文化")
    private String eduLevel;


    @Column(name = "教育年限")
    private int eduYear;

    @Column(name = "职业")
    private String profession;


    @Column(name = "工作性质")
    private String work;

    @Column(name = "家庭地址")
    private String address;


    @Column(name = "联系方式")
    private long contact;

    @Column(name = "标本备注")
    private String specimenRemark;

    @Column(name = "是否留血")
    private String blood;

    @Column(name = "留血盒子")
    private int bloodBox;

    @Column(name = "血样编号")
    private int bloodSampleNum;

    @Column(name = "脑脊液编号")
    private int cerebrospinalFluidNum;

    @Column(name = "尿液编号")
    private int urineNum;

    @Column(name = "病史")
    private String medicalHistory;

    @Column(name = "记忆力下降病程")
    private int memoryDeclineCourse;

    @Column(name = "记忆力损害加重")
    private int increasedMemoryImpairment;

    @Column(name = "婚姻状况")
    private String maritalStatus;


    @Column(name = "身高")
    private int height;

    @Column(name = "体重")
    private int weight;

    @Column(name = "脑血管病")
    private String cerebrovascularDisease;

    @Column(name = "脑血管病年")
    private int cerebrovascularDiseaseYear;

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
    private int diabetesYear;

    @Column(name = "糖尿病稳定")
    private String stableDiabetes;

    @Column(name = "糖尿病服药")
    private String diabetesMedication;

    @Column(name = "冠心病")
    private String coronaryDisease;

    @Column(name = "冠心病年")
    private int coronaryDiseaseYear;

    @Column(name = "冠心病稳定")
    private String stableCoronaryDisease;

    @Column(name = "房颤")
    private String atrialFibrillation;

    @Column(name = "房颤年")
    private int atrialFibrillationYear;

    @Column(name = "房颤控制")
    private String atrialFibrillationControl;

    @Column(name = "高脂血症")
    private String hyperlipidemia;

    @Column(name = "高脂血症年")
    private int hyperlipidemiaYear;

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
    private int smokeYear;

    @Column(name = "抽烟根天")
    private int smokeNumPerDay;

    @Column(name = "戒烟")
    private String quitSmoking;

    @Column(name = "戒烟年")
    private int quitSmokingYear;

    @Column(name = "饮酒")
    private String Drink;

    @Column(name = "酗酒史年")
    private int historyOfAlcoholism;

    @Column(name = "酒精g天")
    private int alcoholGPerDay;

    @Column(name = "戒酒")
    private String quitDrinking;

    @Column(name = "戒酒年")
    private int quitDrinkingYear;

    @Column(name = "家族史")
    private String familyHistory;

    @Column(name = "家族史描述")
    private String familyHistoryDiscription;


    public BasicInfo() {
    }



    public BasicInfo(String name, int age, long identification, String gender, Date date, String namePinyin, int mrRaw,
                     int mrSort, int mrDate, String remarkForFollowupVisit, String primDiag, int followupYear,
                     int dropOut,long hospitalNum,long bedNum,long clinicNum, Date birthDate, String ethnic,
                     String eduLevel, int eduYear, String profession,String work, String address, long contact,
                     String specimenRemark, String blood, int bloodBox, int bloodSampleNum, int cerebrospinalFluidNum,
                     int urineNum, String medicalHistory, int memoryDeclineCourse, int increasedMemoryImpairment,
                     String maritalStatus, int height, int weight, String cerebrovascularDisease, int cerebrovascularDiseaseYear,
                     String stableCerebrovascularDisease, String cerebrovascularDiseaseMedication, String cnsDiseaseDescription,
                     String hypertension, String hypertensionYear, String highestHypertension, String averageHypertension,
                     String stableHypertension, String hypertensionMedication, String diabetes, int diabetesYear, String stableDiabetes,
                     String diabetesMedication, String coronaryDisease, int coronaryDiseaseYear, String stableCoronaryDisease,
                     String atrialFibrillation, int atrialFibrillationYear, String atrialFibrillationControl, String hyperlipidemia,
                     int hyperlipidemiaYear, String stableHyperlipidemia, String hyperlipidemiaMedication, String medicalRemark,
                     String otherMedicine, String smoke, int smokeYear, int smokeNumPerDay, String quitSmoking, int quitSmokingYear,
                     String Drink, int historyOfAlcoholism, int alcoholGPerDay, String quitDrinking, int quitDrinkingYear,
                     String familyHistory, String familyHistoryDiscription
    ) {
        this.name = name;
        this.age = age;
        this.identification = identification;
        this.gender = gender;
        this. date = date;
        this. namePinyin = namePinyin;
        this. mrRaw = mrRaw;
        this. mrSort = mrSort;
        this. mrDate = mrDate;
        this. remarkForFollowupVisit = remarkForFollowupVisit;
        this. primDiag = primDiag;
        this. followupYear = followupYear;
        this. dropOut = dropOut;
        this. hospitalNum = hospitalNum;
        this. bedNum = bedNum;
        this. clinicNum = clinicNum;
        this. birthDate = birthDate;
        this. ethnic = ethnic;
        this. eduLevel = eduLevel;
        this. eduYear = eduYear;
        this. profession = profession;
        this. work = work;
        this. address = address;
        this. contact = contact;
        this. specimenRemark = specimenRemark;
        this. blood = blood;
        this. bloodBox = bloodBox;
        this. bloodSampleNum = bloodSampleNum;
        this. cerebrospinalFluidNum = cerebrospinalFluidNum;
        this. urineNum = urineNum;
        this. medicalHistory = medicalHistory;
        this. memoryDeclineCourse = memoryDeclineCourse;
        this. increasedMemoryImpairment = increasedMemoryImpairment;
        this. maritalStatus = maritalStatus;
        this. height = height;
        this. weight = weight;
        this. cerebrovascularDisease = cerebrovascularDisease;
        this. cerebrovascularDiseaseYear = cerebrovascularDiseaseYear;
        this. stableCerebrovascularDisease = stableCerebrovascularDisease;
        this. cerebrovascularDiseaseMedication = cerebrovascularDiseaseMedication;
        this. cnsDiseaseDescription = cnsDiseaseDescription;
        this. hypertension = hypertension;
        this. hypertensionYear = hypertensionYear;
        this. highestHypertension = highestHypertension;
        this. averageHypertension = averageHypertension;
        this. stableHypertension = stableHypertension;
        this. hypertensionMedication = hypertensionMedication;
        this. diabetes = diabetes;
        this. diabetesYear = diabetesYear;
        this. stableDiabetes = stableDiabetes;
        this. diabetesMedication = diabetesMedication;
        this. coronaryDisease = coronaryDisease;
        this. coronaryDiseaseYear = coronaryDiseaseYear;
        this. stableCoronaryDisease = stableCoronaryDisease;
        this. atrialFibrillation = atrialFibrillation;
        this. atrialFibrillationYear = atrialFibrillationYear;
        this. atrialFibrillationControl = atrialFibrillationControl;
        this. hyperlipidemia = hyperlipidemia;
        this. hyperlipidemiaYear = hyperlipidemiaYear;
        this. stableHyperlipidemia = stableHyperlipidemia;
        this. hyperlipidemiaMedication = hyperlipidemiaMedication;
        this. medicalRemark = medicalRemark;
        this. otherMedicine = otherMedicine;
        this. smoke = smoke;
        this. smokeYear = smokeYear;
        this. smokeNumPerDay = smokeNumPerDay;
        this. quitSmoking = quitSmoking;
        this. quitSmokingYear = quitSmokingYear;
        this. Drink = Drink;
        this. historyOfAlcoholism = historyOfAlcoholism;
        this. alcoholGPerDay = alcoholGPerDay;
        this. quitDrinking = quitDrinking;
        this. quitDrinkingYear = quitDrinkingYear;
        this. familyHistory  = familyHistory;
        this. familyHistoryDiscription  =familyHistoryDiscription;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public long getIdentification() {
        return identification;
    }
    public void setIdentification(long identification) {
        this.identification = identification;
    }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) { this.date = date; }

    public String getNamePinyin() {
        return namePinyin;
    }
    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public int getMrRaw() {
        return mrRaw;
    }
    public void setMrRaw(int mrRaw) {
        this.mrRaw = mrRaw;
    }

    public int getMrSort() {
        return mrSort;
    }
    public void setMrSort(int mrSort) {
        this.mrSort = mrSort;
    }

    public int getMrDate() { return mrDate; }
    public void setMrDate(int mrDate) { this.mrDate = mrDate; }

    public String getRemarkForFollowupVisit() {
        return remarkForFollowupVisit;
    }
    public void setRemarkForFollowupVisit(String remarkForFollowupVisit) { this.remarkForFollowupVisit = remarkForFollowupVisit; }

    public String getPrimDiag() { return primDiag; }
    public void setPrimDiag(String primDiag) { this.primDiag = primDiag; }

    public int getFollowupYear() { return followupYear; }
    public void setFollowupYear(int followupYear) { this.followupYear = followupYear; }

    public int getDropOut() { return dropOut; }
    public void setDropOut(int dropOut) { this.dropOut = dropOut; }

    public long getHospitalNum() { return hospitalNum; }
    public void setHospitalNum(long hospitalNum) { this.hospitalNum = hospitalNum; }

    public long getBedNum() { return bedNum; }
    public void setBedNum(long bedNum) { this.bedNum = bedNum; }

    public long getClinicNum() { return clinicNum; }
    public void setClinicNum(long clinicNum) { this.clinicNum = clinicNum; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String geteThnic() { return ethnic; }
    public void seteThnic(String ethnic) { this.ethnic = ethnic; }

    public String getEduLevel() { return eduLevel; }
    public void setEduLevel(String eduLevel) { this.eduLevel = eduLevel; }

    public int getEduYear() { return eduYear; }
    public void setEduYear(int eduYear) { this.eduYear = eduYear; }

    public String getProfession() { return profession; }
    public void setProfession(String profession) { this.profession = profession; }

    public String getWork() { return work; }
    public void setWork(String work) { this.work = work; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public long getContact() { return contact; }
    public void setContact(long contact) { this.contact = contact; }

    public String getSpecimenRemark() { return specimenRemark; }
    public void setSpecimenRemark(String specimenRemark) { this.specimenRemark = specimenRemark; }

    public String getBlood() { return blood; }
    public void setBlood(String blood) { this.blood = blood; }

    public int getBloodbox() { return bloodBox; }
    public void setBloodBox(int bloodBox) { this.bloodBox = bloodBox; }


    public int getBloodSampleNum() { return bloodSampleNum; }
    public void setBloodSampleNum(int bloodSampleNum) { this.bloodSampleNum = bloodSampleNum; }

    public int getCerebrospinalFluidNum() { return cerebrospinalFluidNum; }
    public void setCerebrospinalFluidNum(int cerebrospinalFluidNum) { this.cerebrospinalFluidNum = cerebrospinalFluidNum; }

    public int getUrineNum() { return urineNum; }
    public void setUrineNum(int urineNum) { this.urineNum = urineNum; }

    public String getMedicalHistory() { return medicalHistory; }
    public void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }

    public int getMemoryDeclineCourse() { return memoryDeclineCourse; }
    public void setMemoryDeclineCourse(int memoryDeclineCourse) { this.memoryDeclineCourse = memoryDeclineCourse; }

    public int getIncreasedMemoryImpairment() { return increasedMemoryImpairment; }
    public void setIncreasedMemoryImpairment(int increasedMemoryImpairment) { this.increasedMemoryImpairment = increasedMemoryImpairment; }

    public String getMaritalStatus() { return maritalStatus; }
    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public String getCerebrovascularDisease() { return cerebrovascularDisease; }
    public void setCerebrovascularDisease(String cerebrovascularDisease) { this.cerebrovascularDisease = cerebrovascularDisease; }


    public int getCerebrovascularDiseaseYear() { return cerebrovascularDiseaseYear; }
    public void setCerebrovascularDiseaseYear(int cerebrovascularDiseaseYear) { this.cerebrovascularDiseaseYear = cerebrovascularDiseaseYear; }

    public String getStableCerebrovascularDisease() { return stableCerebrovascularDisease; }
    public void setStableCerebrovascularDisease(String stableCerebrovascularDisease) { this.stableCerebrovascularDisease = stableCerebrovascularDisease; }

    public String getCerebrovascularDiseaseMedication() { return cerebrovascularDiseaseMedication; }
    public void setCerebrovascularDiseaseMedication(String cerebrovascularDiseaseMedication) { this.cerebrovascularDiseaseMedication = cerebrovascularDiseaseMedication; }

    public String getCnsDiseaseDescription() { return cnsDiseaseDescription; }
    public void setCnsDiseaseDescription(String cnsDiseaseDescription) { this.cnsDiseaseDescription = cnsDiseaseDescription; }

    public String getHypertension() { return hypertension; }
    public void setHypertension(String hypertension) { this.hypertension = hypertension; }

    public String getHypertensionYear() { return hypertensionYear; }
    public void setHypertensionYear(String hypertensionYear) { this.hypertensionYear = hypertensionYear; }

    public String getHighestHypertension() { return highestHypertension; }
    public void setHighestHypertension(String highestHypertension) { this.highestHypertension = highestHypertension; }

    public String getAverageHypertension() { return averageHypertension; }
    public void setAverageHypertension(String averageHypertension) { this.averageHypertension = averageHypertension; }

    public String getStableHypertension() { return stableHypertension; }
    public void setStableHypertension(String stableHypertension) { this.stableHypertension = stableHypertension; }

    public String getHypertensionMedication() { return hypertensionMedication; }
    public void setHypertensionMedication(String hypertensionMedication) { this.hypertensionMedication = hypertensionMedication; }

    public String getDiabetes() { return diabetes; }
    public void setDiabetes(String diabetes) { this.diabetes = diabetes; }


    public int getDiabetesYear() { return diabetesYear; }
    public void setDiabetesYear(int diabetesYear) { this.diabetesYear = diabetesYear; }

    public String getStableDiabetes() { return stableDiabetes; }
    public void setStableDiabetes(String stableDiabetes) { this.stableDiabetes = stableDiabetes; }

    public String getDiabetesMedication() { return diabetesMedication; }
    public void setDiabetesMedication(String diabetesMedication) { this.diabetesMedication = diabetesMedication; }

    public String getCoronaryDisease() { return coronaryDisease; }
    public void setCoronaryDisease(String coronaryDisease) { this.coronaryDisease = coronaryDisease; }

    public int getCoronaryDiseaseYear() { return coronaryDiseaseYear; }
    public void setCoronaryDiseaseYear(int coronaryDiseaseYear) { this.coronaryDiseaseYear = coronaryDiseaseYear; }

    public String getStableCoronaryDisease() { return stableCoronaryDisease; }
    public void setStableCoronaryDisease(String stableCoronaryDisease) { this.stableCoronaryDisease = stableCoronaryDisease; }

    public String geTatrialFibrillation() { return atrialFibrillation; }
    public void setTrialFibrillation(String atrialFibrillation) { this.atrialFibrillation = atrialFibrillation; }

    public int getAtrialFibrillationYear() { return atrialFibrillationYear; }
    public void setAtrialFibrillationYear(int atrialFibrillationYear) { this.atrialFibrillationYear = atrialFibrillationYear; }

    public String getAtrialFibrillationControl() { return atrialFibrillationControl; }
    public void setAtrialFibrillationControl(String atrialFibrillationControl) { this.atrialFibrillationControl = atrialFibrillationControl; }

    public String getHyperlipidemia() { return hyperlipidemia; }
    public void setHyperlipidemia(String hyperlipidemia) { this.hyperlipidemia = hyperlipidemia; }

    public int getHyperlipidemiaYear() { return hyperlipidemiaYear; }
    public void setHyperlipidemiaYear(int hyperlipidemiaYear) { this.hyperlipidemiaYear = hyperlipidemiaYear; }

    public String getStableHyperlipidemia() { return stableHyperlipidemia; }
    public void setStableHyperlipidemia(String stableHyperlipidemia) { this.stableHyperlipidemia = stableHyperlipidemia; }

    public String getHyperlipidemiaMedication() { return hyperlipidemiaMedication; }
    public void setHyperlipidemiaMedication(String hyperlipidemiaMedication) { this.hyperlipidemiaMedication = hyperlipidemiaMedication; }

    public String getMedicalRemark() { return medicalRemark; }
    public void setMedicalRemark(String medicalRemark) { this.medicalRemark = medicalRemark; }

    public String getOtherMedicine() { return otherMedicine; }
    public void setOtherMedicine(String otherMedicine) { this.otherMedicine = otherMedicine; }

    public String getSmoke() { return smoke; }
    public void setSmoke(String smoke) { this.smoke = smoke; }

    public int getSmokeYear() { return smokeYear; }
    public void setSmokeYear(int smokeYear) { this.smokeYear = smokeYear; }

    public int getSmokeNumPerDay() { return smokeNumPerDay; }
    public void setSmokeNumPerDay(int smokeNumPerDay) { this.smokeNumPerDay = smokeNumPerDay; }

    public String getQuitSmoking() { return quitSmoking; }
    public void setQuitSmoking(String quitSmoking) { this.quitSmoking = quitSmoking; }

    public int getQuitSmokingYear() { return quitSmokingYear; }
    public void setQuitSmokingYear(int quitSmokingYear) { this.quitSmokingYear = quitSmokingYear; }

    public String getDrink() { return Drink; }
    public void setDrink(String Drink) { this.Drink = Drink; }

    public int getHistoryOfAlcoholism() { return historyOfAlcoholism; }
    public void setHistoryOfAlcoholism(int historyOfAlcoholism) { this.historyOfAlcoholism = historyOfAlcoholism; }

    public int getAlcoholGPerDay() { return alcoholGPerDay; }
    public void setAlcoholGPerDay(int alcoholGPerDay) { this.alcoholGPerDay = alcoholGPerDay; }

    public String getQuitDrinking() { return quitDrinking; }
    public void setQuitDrinking(String quitDrinking) { this.quitDrinking = quitDrinking; }

    public int getQuitDrinkingYear() { return quitDrinkingYear; }
    public void setQuitDrinkingYear(int quitDrinkingYear) { this.quitDrinkingYear = quitDrinkingYear; }

    public String getFamilyHistory() { return familyHistory; }
    public void setFamilyHistory(String familyHistory) { this.familyHistory = familyHistory; }

    public String getFamilyHistoryDiscription() { return familyHistoryDiscription; }
    public void setFamilyHistoryDiscription(String familyHistoryDiscription) { this.familyHistoryDiscription = familyHistoryDiscription; }


}