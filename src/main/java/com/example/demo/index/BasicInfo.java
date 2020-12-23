package com.example.demo.index;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_basicInfo")
public class BasicInfo {

    @Column(name = "姓名")
    private String name;

    @Column(name = "年龄")
    private int age;

    @Id
    @Column(name = "身份证")
    private long id;

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
}