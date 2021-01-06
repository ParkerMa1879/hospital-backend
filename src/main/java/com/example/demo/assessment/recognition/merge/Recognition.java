package com.example.demo.assessment.recognition.merge;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_recognition")
public class Recognition {
    @Id
    @Column(name = "认知编号")
    private int RecognitionNum;

    @Column(name = "认知日期")
    private Date RecognitionDate;

    @Column(name = "定向")
    private int orientation;

    @Column(name = "时间")
    private int time;

    @Column(name = "地点")
    private int location;

    @Column(name = "即刻记忆")
    private int immediateMemory;

    @Column(name = "计算力")
    private int computingPower;

    @Column(name = "回忆")
    private int memory;

    @Column(name = "命名")
    private int naming;

    @Column(name = "重复")
    private int repeat;

    @Column(name = "阅读")
    private int read;

    @Column(name = "指令")
    private int instruction;

    @Column(name = "表达")
    private int expression;

    @Column(name = "绘图")
    private int drawing;

    @Column(name = "MoCA")
    private int moCA;

    @Column(name = "执行")
    private int carryOut;

    @Column(name = "连线")
    private int connect;

    @Column(name = "立方体")
    private int cube;

    @Column(name = "画钟轮廓")
    private int drawClockOutline;

    @Column(name = "数字")
    private int numebr;

    @Column(name = "指针")
    private int pointer;

    @Column(name = "命名1")
    private int naming1;

    @Column(name = "即刻记忆1")
    private float instantMemory1;

    @Column(name = "即刻记忆2")
    private float instantMemory2;

    @Column(name = "注意")
    private int note;

    @Column(name = "顺背")
    private int reciteAlong;

    @Column(name = "倒背")
    private int reciteBackwards;

    @Column(name = "敲")
    private int knock;

    @Column(name = "计算")
    private int calculation;

    @Column(name = "语言")
    private int language;

    @Column(name = "重复1")
    private int repeat1;

    @Column(name = "流畅性")
    private int fluency;

    @Column(name = "抽象")
    private int abstraction;

    @Column(name = "分类提示")
    private int classifiacationReminder;

    @Column(name = "多选提示")
    private int multiChoiceReminder;

    @Column(name = "定向1")
    private int orientation1;

    @Column(name = "延迟回忆")
    private int delayedRecall;

    @Column(name = "数字正背")
    private int numReciteAlong;

    @Column(name = "数字倒背")
    private int numReciteBackwards;

    @Column(name = "HAMD总")
    private int hamdTotal;

    @Column(name = "HAMD1")
    private int hamd1;

    @Column(name = "HAMD2")
    private int hamd2;

    @Column(name = "HAMD3")
    private int hamd3;

    @Column(name = "HAMD4")
    private int hamd4;

    @Column(name = "HAMD5")
    private int hamd5;

    @Column(name = "HAMD6")
    private int hamd6;

    @Column(name = "HAMD7")
    private int hamd7;

    @Column(name = "HAMD8")
    private int hamd8;

    @Column(name = "HAMD9")
    private int hamd9;

    @Column(name = "HAMD10")
    private int hamd10;

    @Column(name = "HAMD11")
    private int hamd11;

    @Column(name = "HAMD12")
    private int hamd12;

    @Column(name = "HAMD13")
    private int hamd13;

    @Column(name = "HAMD14")
    private int hamd14;

    @Column(name = "HAMD15")
    private int hamd15;

    @Column(name = "HAMD16")
    private int hamd16;

    @Column(name = "HAMD17")
    private int hamd17;

    @Column(name = "HAMDC")
    private String hamdc;

    @Column(name = "HAMA总")
    private int hamaTotal;

    @Column(name = "HAMA1")
    private int hama1;

    @Column(name = "HAMA2")
    private int hama2;

    @Column(name = "HAMA3")
    private int hama3;

    @Column(name = "HAMA4")
    private int hama4;

    @Column(name = "HAMA5")
    private int hama5;

    @Column(name = "HAMA6")
    private int hama6;

    @Column(name = "HAMA7")
    private int hama7;

    @Column(name = "HAMA8")
    private int hama8;

    @Column(name = "HAMA9")
    private int hama9;

    @Column(name = "HAMA10")
    private int hama10;

    @Column(name = "HAMA11")
    private int hama11;

    @Column(name = "HAMA12")
    private int hama12;

    @Column(name = "HAMA13")
    private int hama13;

    @Column(name = "HAMA14")
    private int hama14;

    @Column(name = "HAMAC")
    private String hamac;


    @Column(name = "ADL1")
    private int adl1;

    @Column(name = "ADL2")
    private int adl2;

    @Column(name = "ADL3")
    private int adl3;

    @Column(name = "ADL4")
    private int adl4;

    @Column(name = "ADL5")
    private int adl5;

    @Column(name = "ADL6")
    private int adl6;

    @Column(name = "ADL7")
    private int adl7;

    @Column(name = "ADL8")
    private int adl8;

    @Column(name = "ADL9")
    private int adl9;

    @Column(name = "ADL10")
    private int adl10;

    @Column(name = "ADL总")
    private int adlTotal;

    @Column(name = "IADLA1")
    private int iadla1;

    @Column(name = "IADLA2")
    private int iadla2;

    @Column(name = "IADLA3")
    private int iadla3;

    @Column(name = "IADLA4")
    private int iadla4;

    @Column(name = "IADLA5")
    private int iadla5;

    @Column(name = "IADLA6")
    private int iadla6;

    @Column(name = "IADLA7")
    private int iadla7;

    @Column(name = "IADLA8")
    private int iadla8;

    @Column(name = "IADLA总")
    private int iadlaTotal;

    @Column(name = "CDR")
    private float cdr;

    @Column(name = "CDR记忆")
    private float cdrMemory;

    @Column(name = "CDR定向")
    private float cdrOrientation;

    @Column(name = "CDR判断")
    private float cdrJudgment;

    @Column(name = "CDR社会事务")
    private float cdrSocialAffair;

    @Column(name = "CDR家务爱好")
    private float cdrHouseworkHobby;

    @Column(name = "CDR自理")
    private float cdrSelfcare;

    @Column(name = "NPI")
    private int npi;

    @Column(name = "NIHSS评分")
    private int nihssScore;

    @Column(name = "NIHSS1a")
    private int nihss1a;

    @Column(name = "NIHSS1b")
    private int nihss1b;

    @Column(name = "NIHSS1c")
    private int nihss1c;

    @Column(name = "NIHSS2")
    private int nihss2;

    @Column(name = "NIHSS3")
    private int nihss3;

    @Column(name = "NIHSS4")
    private int nihss4;

    @Column(name = "NIHSS5a")
    private int nihss5a;

    @Column(name = "NIHSS5atext")
    private String nihss5aText;

    @Column(name = "NIHSS5b")
    private int nihss5b;

    @Column(name = "NIHSS5btext")
    private String nihss5bText;

    @Column(name = "NIHSS6a")
    private int nihss6a;

    @Column(name = "NIHSS6atext")
    private String nihss6aText;

    @Column(name = "NIHSS6b")
    private int nihss6b;

    @Column(name = "NIHSS6btext")
    private String nihss6bText;

    @Column(name = "NIHSS7")
    private int nihss7;

    @Column(name = "NIHSS8")
    private int nihss8;

    @Column(name = "NIHSS9")
    private int nihss9;

    @Column(name = "NIHSS10")
    private int nihss10;

    @Column(name = "NIHSS10text")
    private String nihss10Text;

    @Column(name = "NIHSS11")
    private int nihss11;

    @Column(name = "mRs评分")
    private int mRsScore;

    @Column(name = "类别流畅性")
    private int categoryFluency;

    @Column(name = "语流动物15s")
    private int whisperingAnimals15s;

    @Column(name = "语流动物30s")
    private int whisperingAnimals30s;

    @Column(name = "语流动物45s")
    private int whisperingAnimals45s;

    @Column(name = "语流动物60s")
    private int whisperingAnimals60s;

    @Column(name = "视觉复制即刻回忆")
    private int visualReproduction;

    @Column(name = "VRIR1")
    private int vrir1;

    @Column(name = "VRIR2")
    private int vrir2;

    @Column(name = "VRIR3")
    private int vrir3;

    @Column(name = "VRIR4")
    private int vrir4;

    @Column(name = "视觉复制延迟回忆")
    private int visualReproductionDelayedRecall;

    @Column(name = "VRDR1")
    private int vrdr1;

    @Column(name = "VRDR2")
    private int vrdr2;

    @Column(name = "VRDR3")
    private int vrdr3;

    @Column(name = "VRDR4")
    private int vrdr4;

    @Column(name = "视觉复制临摹")
    private int visualCopying;

    @Column(name = "VRC1")
    private int VRC1;

    @Column(name = "VRC2")
    private int VRC2;

    @Column(name = "VRC3")
    private int VRC3;

    @Column(name = "VRC4")
    private int VRC4;

    @Column(name = "画钟")
    private int drawClock;

    @Column(name = "波士顿命名")
    private int bostonNaming;

    @Column(name = "BNT0")
    private int bnt0;

    @Column(name = "BNT1")
    private int bnt1;

    @Column(name = "BNT2")
    private int bnt2;

    @Column(name = "BNTclue")
    private int bntClue;

    @Column(name = "BNTchoice")
    private int bntChoice;

    @Column(name = "听觉词语学习即刻")
    private int learnAuralWordsInstantly;

    @Column(name = "AVLTIR1")
    private int avltir1;

    @Column(name = "AVLTIR2")
    private int avltir2;

    @Column(name = "AVLTIR3")
    private int avltir3;

    @Column(name = "AVLT插入个")
    private int avltInsertNum;

    @Column(name = "AVLT插入次")
    private int avltInsertTime;

    @Column(name = "AVLT重复")
    private int avltRepeat;

    @Column(name = "AVLT策略1有0无")
    private int avltStrtegy1Yes0No;

    @Column(name = "听觉词语学习短延时")
    private int shortTimeDelayForAuditoryVocabularyLearning;

    @Column(name = "AVLT插入个1")
    private int avltInsertNum1;

    @Column(name = "AVLT插入次1")
    private int avltInsertTime1;

    @Column(name = "AVLT重复1")
    private int avltRepeat1;

    @Column(name = "AVLT策略1有0无1")
    private int avltStrtegy1Yes0No1;

    @Column(name = "听觉词语学习长延时")
    private int longDelayInAuditoryVocabularyLearning;

    @Column(name = "AVLTDDR服饰")
    private int avltddrClothing;

    @Column(name = "AVLTDDR职业")
    private int avltddrProfession;

    @Column(name = "AVLTDDR花卉")
    private int avltddrFlower;

    @Column(name = "AVLT插入个2")
    private int avltInsertNum2;

    @Column(name = "AVLT插入次2")
    private int avltInsertTime2;

    @Column(name = "AVLT重复2")
    private int avltRepeat2;

    @Column(name = "AVLT策略1有0无2")
    private int avltStrtegy1Yes0No2;

    @Column(name = "听觉词语学习再认")
    private int auditoryVocabularyLearningAndRecognition;

    @Column(name = "AVLT再认")
    private int avltRecognize;

    @Column(name = "AVLT排除画钟4分法")
    private int avltEliminatesTheDrawingClock4Minutes;

    @Column(name = "DOTA")
    private int dota;

    @Column(name = "剪影测验")
    private int silhouetteQuiz;

    @Column(name = "S1")
    private int s1;

    @Column(name = "S2")
    private int s2;

    @Column(name = "S3")
    private int s3;

    @Column(name = "S4")
    private int s4;

    @Column(name = "S5")
    private int s5;

    @Column(name = "S6")
    private int s6;

    @Column(name = "S7")
    private int s7;

    @Column(name = "S8")
    private int s8;

    @Column(name = "S9")
    private int s9;

    @Column(name = "S10")
    private int s10;

    @Column(name = "S11")
    private int s11;

    @Column(name = "S12")
    private int s12;

    @Column(name = "S13")
    private int s13;

    @Column(name = "S14")
    private int s14;

    @Column(name = "S15")
    private int s15;

    @Column(name = "S1正确")
    private float s1Correct;

    @Column(name = "S1测试者更正")
    private float s1TesterCorrect;

    @Column(name = "S1自我更正")
    private float s1SelfCorrect;

    @Column(name = "S1时间")
    private float s1Time;

    @Column(name = "S2正确")
    private float s2Correct;

    @Column(name = "S2测试者更正")
    private float s2TesterCorrect;

    @Column(name = "S2自我更正")
    private float s2SelfCorrect;

    @Column(name = "S2时间")
    private float s2Time;

    @Column(name = "S3正确")
    private float s3Correct;

    @Column(name = "S3测试者更正")
    private float s3TesterCorrect;

    @Column(name = "S3自我更正")
    private float s3SelfCorrect;

    @Column(name = "S3时间")
    private float s3Time;

    @Column(name = "色盲色弱可疑")
    private int colorBlindnessColorWeaknessSuspicious;

    @Column(name = "Stroop备注")
    private String stroopNote;

    @Column(name = "TMT1自我更正")
    private int tmt1SelfCorrect;

    @Column(name = "TMT1测试者更正")
    private int tmt1TesterCorrect;

    @Column(name = "TMT1时间")
    private int tmt1Time;

    @Column(name = "TMT1提示")
    private int tmt1Note;

    @Column(name = "TMT2自我更正")
    private int tmt2SelfCorrect;

    @Column(name = "TMT2测试者更正")
    private int tmt2TesterCorrect;

    @Column(name = "TMT2时间")
    private int tmt2Time;

    @Column(name = "TMT2提示")
    private int tmt2Note;

    @Column(name = "连线测验备注")
    private int connectedQuizNote;

    @Column(name = "步态异常量表")
    private int abnormalGaitScale;

    @Column(name = "皮质脊髓束")
    private int corticospinalTract;

    @Column(name = "皮质延髓束")
    private int corticalMedullaryTract;

    @Column(name = "椎体外系")
    private int extravertebralSystem;

    @Column(name = "步态异常")
    private int abnormalGait;

    @Column(name = "步态严重度")
    private int gaitSeverity;

    @Column(name = "Tinetti平衡量表")
    private int tinettiBalanceScale;

    @Column(name = "TinBal1")
    private int tinBal1;

    @Column(name = "TinBal2")
    private int tinBal2;

    @Column(name = "TinBal3")
    private int tinBal3;

    @Column(name = "TinBal4")
    private int tinBal4;

    @Column(name = "TinBal5")
    private int tinBal5;

    @Column(name = "TinBal6")
    private int tinBal6;

    @Column(name = "TinBal7")
    private int tinBal7;

    @Column(name = "TinBal8a")
    private int tinBal8a;

    @Column(name = "TinBal8b")
    private int tinBal8b;

    @Column(name = "TinBal9")
    private int tinBal9;

    @Column(name = "Tinetti步态量表")
    private int tinettiGaitScale;

    @Column(name = "TinGait1")
    private int tinGait1;

    @Column(name = "TinGait2a")
    private int tinGait2a;

    @Column(name = "TinGait2b")
    private int tinGait2b;

    @Column(name = "TinGait2c")
    private int tinGait2c;

    @Column(name = "TinGait2d")
    private int tinGait2d;

    @Column(name = "TinGait3")
    private int tinGait3;

    @Column(name = "TinGait4")
    private int tinGait4;

    @Column(name = "TinGait5")
    private int tinGait5;

    @Column(name = "TinGait6")
    private int tinGait6;

    @Column(name = "TinGait7")
    private int tinGait7;

    @Column(name = "TUG测验")
    private int tugTest;

    @Column(name = "助行器")
    private int walker;

    @Column(name = "TOAST")
    private String toast;


    public Recognition(int recognitionNum, Date recognitionDate, int orientation, int time,
                       int location, int immediateMemory, int computingPower, int memory, int naming, int repeat,
                       int read, int instruction, int expression, int drawing, int moCA, int carryOut, int connect,
                       int cube, int drawClockOutline, int numebr, int pointer, int naming1, float instantMemory1,
                       float instantMemory2, int note, int reciteAlong, int reciteBackwards, int knock, int calculation,
                       int language, int repeat1, int fluency, int abstraction, int classifiacationReminder,
                       int multiChoiceReminder, int orientation1, int delayedRecall, int numReciteAlong, int numReciteBackwards,
                       int hamdTotal, int hamd1, int hamd2, int hamd3, int hamd4, int hamd5, int hamd6, int hamd7,
                       int hamd8, int hamd9, int hamd10, int hamd11, int hamd12, int hamd13, int hamd14, int hamd15,
                       int hamd16, int hamd17, String hamdc, int hamaTotal, int hama1, int hama2, int hama3, int hama4,
                       int hama5, int hama6, int hama7, int hama8, int hama9, int hama10, int hama11, int hama12,
                       int hama13, int hama14, String hamac, int adl1, int adl2, int adl3, int adl4, int adl5,
                       int adl6, int adl7, int adl8, int adl9, int adl10, int adlTotal, int iadla1, int iadla2,
                       int iadla3, int iadla4, int iadla5, int iadla6, int iadla7, int iadla8, int iadlaTotal,
                       float cdr, float cdrMemory, float cdrOrientation, float cdrJudgment, float cdrSocialAffair,
                       float cdrHouseworkHobby, float cdrSelfcare, int npi, int nihssScore, int nihss1a, int nihss1b,
                       int nihss1c, int nihss2, int nihss3, int nihss4, int nihss5a, String nihss5aText, int nihss5b,
                       String nihss5bText, int nihss6a, String nihss6aText, int nihss6b, String nihss6bText, int nihss7,
                       int nihss8, int nihss9, int nihss10, String nihss10Text, int nihss11, int mRsScore, int categoryFluency,
                       int whisperingAnimals15s, int whisperingAnimals30s, int whisperingAnimals45s, int whisperingAnimals60s,
                       int visualReproduction, int vrir1, int vrir2, int vrir3, int vrir4, int visualReproductionDelayedRecall,
                       int vrdr1, int vrdr2, int vrdr3, int vrdr4, int visualCopying, int VRC1, int VRC2, int VRC3, int VRC4,
                       int drawClock, int bostonNaming, int bnt0, int bnt1, int bnt2, int bntClue, int bntChoice,
                       int learnAuralWordsInstantly, int avltir1, int avltir2, int avltir3, int avltInsertNum, int avltInsertTime,
                       int avltRepeat, int avltStrtegy1Yes0No, int shortTimeDelayForAuditoryVocabularyLearning, int avltInsertNum1,
                       int avltInsertTime1, int avltRepeat1, int avltStrtegy1Yes0No1, int longDelayInAuditoryVocabularyLearning,
                       int avltddrClothing, int avltddrProfession, int avltddrFlower, int avltInsertNum2, int avltInsertTime2,
                       int avltRepeat2, int avltStrtegy1Yes0No2, int auditoryVocabularyLearningAndRecognition, int avltRecognize,
                       int avltEliminatesTheDrawingClock4Minutes, int dota, int silhouetteQuiz, int s1, int s2, int s3, int s4,
                       int s5, int s6, int s7, int s8, int s9, int s10, int s11, int s12, int s13, int s14, int s15, float s1Correct,
                       float s1TesterCorrect, float s1SelfCorrect, float s1Time, float s2Correct, float s2TesterCorrect, float s2SelfCorrect,
                       float s2Time, float s3Correct, float s3TesterCorrect, float s3SelfCorrect, float s3Time, int colorBlindnessColorWeaknessSuspicious,
                       String stroopNote, int tmt1SelfCorrect, int tmt1TesterCorrect, int tmt1Time, int tmt1Note, int tmt2SelfCorrect, int tmt2TesterCorrect,
                       int tmt2Time, int tmt2Note, int connectedQuizNote, int abnormalGaitScale, int corticospinalTract,
                       int corticalMedullaryTract, int extravertebralSystem, int abnormalGait, int gaitSeverity, int tinettiBalanceScale,
                       int tinBal1, int tinBal2, int tinBal3, int tinBal4, int tinBal5, int tinBal6, int tinBal7, int tinBal8a,
                       int tinBal8b, int tinBal9, int tinettiGaitScale, int tinGait1, int tinGait2a, int tinGait2b, int tinGait2c,
                       int tinGait2d, int tinGait3, int tinGait4, int tinGait5, int tinGait6, int tinGait7, int tugTest,
                       int walker, String toast) {
        this.RecognitionNum = recognitionNum;
        this.RecognitionDate = recognitionDate;
        this.orientation = orientation;
        this.time = time;
        this.location = location;
        this.immediateMemory = immediateMemory;
        this.computingPower = computingPower;
        this.memory = memory;
        this.naming = naming;
        this.repeat = repeat;
        this.read = read;
        this.instruction = instruction;
        this.expression = expression;
        this.drawing = drawing;
        this.moCA = moCA;
        this.carryOut = carryOut;
        this.connect = connect;
        this.cube = cube;
        this.drawClockOutline = drawClockOutline;
        this.numebr = numebr;
        this.pointer = pointer;
        this.naming1 = naming1;
        this.instantMemory1 = instantMemory1;
        this.instantMemory2 = instantMemory2;
        this.note = note;
        this.reciteAlong = reciteAlong;
        this.reciteBackwards = reciteBackwards;
        this.knock = knock;
        this.calculation = calculation;
        this.language = language;
        this.repeat1 = repeat1;
        this.fluency = fluency;
        this.abstraction = abstraction;
        this.classifiacationReminder = classifiacationReminder;
        this.multiChoiceReminder = multiChoiceReminder;
        this.orientation1 = orientation1;
        this.delayedRecall = delayedRecall;
        this.numReciteAlong = numReciteAlong;
        this.numReciteBackwards = numReciteBackwards;
        this.hamdTotal = hamdTotal;
        this.hamd1 = hamd1;
        this.hamd2 = hamd2;
        this.hamd3 = hamd3;
        this.hamd4 = hamd4;
        this.hamd5 = hamd5;
        this.hamd6 = hamd6;
        this.hamd7 = hamd7;
        this.hamd8 = hamd8;
        this.hamd9 = hamd9;
        this.hamd10 = hamd10;
        this.hamd11 = hamd11;
        this.hamd12 = hamd12;
        this.hamd13 = hamd13;
        this.hamd14 = hamd14;
        this.hamd15 = hamd15;
        this.hamd16 = hamd16;
        this.hamd17 = hamd17;
        this.hamdc = hamdc;
        this.hamaTotal = hamaTotal;
        this.hama1 = hama1;
        this.hama2 = hama2;
        this.hama3 = hama3;
        this.hama4 = hama4;
        this.hama5 = hama5;
        this.hama6 = hama6;
        this.hama7 = hama7;
        this.hama8 = hama8;
        this.hama9 = hama9;
        this.hama10 = hama10;
        this.hama11 = hama11;
        this.hama12 = hama12;
        this.hama13 = hama13;
        this.hama14 = hama14;
        this.hamac = hamac;
        this.adl1 = adl1;
        this.adl2 = adl2;
        this.adl3 = adl3;
        this.adl4 = adl4;
        this.adl5 = adl5;
        this.adl6 = adl6;
        this.adl7 = adl7;
        this.adl8 = adl8;
        this.adl9 = adl9;
        this.adl10 = adl10;
        this.adlTotal = adlTotal;
        this.iadla1 = iadla1;
        this.iadla2 = iadla2;
        this.iadla3 = iadla3;
        this.iadla4 = iadla4;
        this.iadla5 = iadla5;
        this.iadla6 = iadla6;
        this.iadla7 = iadla7;
        this.iadla8 = iadla8;
        this.iadlaTotal = iadlaTotal;
        this.cdr = cdr;
        this.cdrMemory = cdrMemory;
        this.cdrOrientation = cdrOrientation;
        this.cdrJudgment = cdrJudgment;
        this.cdrSocialAffair = cdrSocialAffair;
        this.cdrHouseworkHobby = cdrHouseworkHobby;
        this.cdrSelfcare = cdrSelfcare;
        this.npi = npi;
        this.nihssScore = nihssScore;
        this.nihss1a = nihss1a;
        this.nihss1b = nihss1b;
        this.nihss1c = nihss1c;
        this.nihss2 = nihss2;
        this.nihss3 = nihss3;
        this.nihss4 = nihss4;
        this.nihss5a = nihss5a;
        this.nihss5aText = nihss5aText;
        this.nihss5b = nihss5b;
        this.nihss5bText = nihss5bText;
        this.nihss6a = nihss6a;
        this.nihss6aText = nihss6aText;
        this.nihss6b = nihss6b;
        this.nihss6bText = nihss6bText;
        this.nihss7 = nihss7;
        this.nihss8 = nihss8;
        this.nihss9 = nihss9;
        this.nihss10 = nihss10;
        this.nihss10Text = nihss10Text;
        this.nihss11 = nihss11;
        this.mRsScore = mRsScore;
        this.categoryFluency = categoryFluency;
        this.whisperingAnimals15s = whisperingAnimals15s;
        this.whisperingAnimals30s = whisperingAnimals30s;
        this.whisperingAnimals45s = whisperingAnimals45s;
        this.whisperingAnimals60s = whisperingAnimals60s;
        this.visualReproduction = visualReproduction;
        this.vrir1 = vrir1;
        this.vrir2 = vrir2;
        this.vrir3 = vrir3;
        this.vrir4 = vrir4;
        this.visualReproductionDelayedRecall = visualReproductionDelayedRecall;
        this.vrdr1 = vrdr1;
        this.vrdr2 = vrdr2;
        this.vrdr3 = vrdr3;
        this.vrdr4 = vrdr4;
        this.visualCopying = visualCopying;
        this.VRC1 = VRC1;
        this.VRC2 = VRC2;
        this.VRC3 = VRC3;
        this.VRC4 = VRC4;
        this.drawClock = drawClock;
        this.bostonNaming = bostonNaming;
        this.bnt0 = bnt0;
        this.bnt1 = bnt1;
        this.bnt2 = bnt2;
        this.bntClue = bntClue;
        this.bntChoice = bntChoice;
        this.learnAuralWordsInstantly = learnAuralWordsInstantly;
        this.avltir1 = avltir1;
        this.avltir2 = avltir2;
        this.avltir3 = avltir3;
        this.avltInsertNum = avltInsertNum;
        this.avltInsertTime = avltInsertTime;
        this.avltRepeat = avltRepeat;
        this.avltStrtegy1Yes0No = avltStrtegy1Yes0No;
        this.shortTimeDelayForAuditoryVocabularyLearning = shortTimeDelayForAuditoryVocabularyLearning;
        this.avltInsertNum1 = avltInsertNum1;
        this.avltInsertTime1 = avltInsertTime1;
        this.avltRepeat1 = avltRepeat1;
        this.avltStrtegy1Yes0No1 = avltStrtegy1Yes0No1;
        this.longDelayInAuditoryVocabularyLearning = longDelayInAuditoryVocabularyLearning;
        this.avltddrClothing = avltddrClothing;
        this.avltddrProfession = avltddrProfession;
        this.avltddrFlower = avltddrFlower;
        this.avltInsertNum2 = avltInsertNum2;
        this.avltInsertTime2 = avltInsertTime2;
        this.avltRepeat2 = avltRepeat2;
        this.avltStrtegy1Yes0No2 = avltStrtegy1Yes0No2;
        this.auditoryVocabularyLearningAndRecognition = auditoryVocabularyLearningAndRecognition;
        this.avltRecognize = avltRecognize;
        this.avltEliminatesTheDrawingClock4Minutes = avltEliminatesTheDrawingClock4Minutes;
        this.dota = dota;
        this.silhouetteQuiz = silhouetteQuiz;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.s10 = s10;
        this.s11 = s11;
        this.s12 = s12;
        this.s13 = s13;
        this.s14 = s14;
        this.s15 = s15;
        this.s1Correct = s1Correct;
        this.s1TesterCorrect = s1TesterCorrect;
        this.s1SelfCorrect = s1SelfCorrect;
        this.s1Time = s1Time;
        this.s2Correct = s2Correct;
        this.s2TesterCorrect = s2TesterCorrect;
        this.s2SelfCorrect = s2SelfCorrect;
        this.s2Time = s2Time;
        this.s3Correct = s3Correct;
        this.s3TesterCorrect = s3TesterCorrect;
        this.s3SelfCorrect = s3SelfCorrect;
        this.s3Time = s3Time;
        this.colorBlindnessColorWeaknessSuspicious = colorBlindnessColorWeaknessSuspicious;
        this.stroopNote = stroopNote;
        this.tmt1SelfCorrect = tmt1SelfCorrect;
        this.tmt1TesterCorrect = tmt1TesterCorrect;
        this.tmt1Time = tmt1Time;
        this.tmt1Note = tmt1Note;
        this.tmt2SelfCorrect = tmt2SelfCorrect;
        this.tmt2TesterCorrect = tmt2TesterCorrect;
        this.tmt2Time = tmt2Time;
        this.tmt2Note = tmt2Note;
        this.connectedQuizNote = connectedQuizNote;
        this.abnormalGaitScale = abnormalGaitScale;
        this.corticospinalTract = corticospinalTract;
        this.corticalMedullaryTract = corticalMedullaryTract;
        this.extravertebralSystem = extravertebralSystem;
        this.abnormalGait = abnormalGait;
        this.gaitSeverity = gaitSeverity;
        this.tinettiBalanceScale = tinettiBalanceScale;
        this.tinBal1 = tinBal1;
        this.tinBal2 = tinBal2;
        this.tinBal3 = tinBal3;
        this.tinBal4 = tinBal4;
        this.tinBal5 = tinBal5;
        this.tinBal6 = tinBal6;
        this.tinBal7 = tinBal7;
        this.tinBal8a = tinBal8a;
        this.tinBal8b = tinBal8b;
        this.tinBal9 = tinBal9;
        this.tinettiGaitScale = tinettiGaitScale;
        this.tinGait1 = tinGait1;
        this.tinGait2a = tinGait2a;
        this.tinGait2b = tinGait2b;
        this.tinGait2c = tinGait2c;
        this.tinGait2d = tinGait2d;
        this.tinGait3 = tinGait3;
        this.tinGait4 = tinGait4;
        this.tinGait5 = tinGait5;
        this.tinGait6 = tinGait6;
        this.tinGait7 = tinGait7;
        this.tugTest = tugTest;
        this.walker = walker;
        this.toast = toast;
    }

    public Recognition() {

    }

    public int getRecognitionNum() {
        return RecognitionNum;
    }

    public void setRecognitionNum(int recognitionNum) {
        RecognitionNum = recognitionNum;
    }

    public Date getRecognitionDate() {
        return RecognitionDate;
    }

    public void setRecognitionDate(Date recognitionDate) {
        RecognitionDate = recognitionDate;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getImmediateMemory() {
        return immediateMemory;
    }

    public void setImmediateMemory(int immediateMemory) {
        this.immediateMemory = immediateMemory;
    }

    public int getComputingPower() {
        return computingPower;
    }

    public void setComputingPower(int computingPower) {
        this.computingPower = computingPower;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getNaming() {
        return naming;
    }

    public void setNaming(int naming) {
        this.naming = naming;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getInstruction() {
        return instruction;
    }

    public void setInstruction(int instruction) {
        this.instruction = instruction;
    }

    public int getExpression() {
        return expression;
    }

    public void setExpression(int expression) {
        this.expression = expression;
    }

    public int getDrawing() {
        return drawing;
    }

    public void setDrawing(int drawing) {
        this.drawing = drawing;
    }

    public int getMoCA() {
        return moCA;
    }

    public void setMoCA(int moCA) {
        this.moCA = moCA;
    }

    public int getCarryOut() {
        return carryOut;
    }

    public void setCarryOut(int carryOut) {
        this.carryOut = carryOut;
    }

    public int getConnect() {
        return connect;
    }

    public void setConnect(int connect) {
        this.connect = connect;
    }

    public int getCube() {
        return cube;
    }

    public void setCube(int cube) {
        this.cube = cube;
    }

    public int getDrawClockOutline() {
        return drawClockOutline;
    }

    public void setDrawClockOutline(int drawClockOutline) {
        this.drawClockOutline = drawClockOutline;
    }

    public int getNumebr() {
        return numebr;
    }

    public void setNumebr(int numebr) {
        this.numebr = numebr;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public int getNaming1() {
        return naming1;
    }

    public void setNaming1(int naming1) {
        this.naming1 = naming1;
    }

    public float getInstantMemory1() {
        return instantMemory1;
    }

    public void setInstantMemory1(float instantMemory1) {
        this.instantMemory1 = instantMemory1;
    }

    public float getInstantMemory2() {
        return instantMemory2;
    }

    public void setInstantMemory2(float instantMemory2) {
        this.instantMemory2 = instantMemory2;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getReciteAlong() {
        return reciteAlong;
    }

    public void setReciteAlong(int reciteAlong) {
        this.reciteAlong = reciteAlong;
    }

    public int getReciteBackwards() {
        return reciteBackwards;
    }

    public void setReciteBackwards(int reciteBackwards) {
        this.reciteBackwards = reciteBackwards;
    }

    public int getKnock() {
        return knock;
    }

    public void setKnock(int knock) {
        this.knock = knock;
    }

    public int getCalculation() {
        return calculation;
    }

    public void setCalculation(int calculation) {
        this.calculation = calculation;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getRepeat1() {
        return repeat1;
    }

    public void setRepeat1(int repeat1) {
        this.repeat1 = repeat1;
    }

    public int getFluency() {
        return fluency;
    }

    public void setFluency(int fluency) {
        this.fluency = fluency;
    }

    public int getAbstraction() {
        return abstraction;
    }

    public void setAbstraction(int abstraction) {
        this.abstraction = abstraction;
    }

    public int getClassifiacationReminder() {
        return classifiacationReminder;
    }

    public void setClassifiacationReminder(int classifiacationReminder) {
        this.classifiacationReminder = classifiacationReminder;
    }

    public int getMultiChoiceReminder() {
        return multiChoiceReminder;
    }

    public void setMultiChoiceReminder(int multiChoiceReminder) {
        this.multiChoiceReminder = multiChoiceReminder;
    }

    public int getOrientation1() {
        return orientation1;
    }

    public void setOrientation1(int orientation1) {
        this.orientation1 = orientation1;
    }

    public int getDelayedRecall() {
        return delayedRecall;
    }

    public void setDelayedRecall(int delayedRecall) {
        this.delayedRecall = delayedRecall;
    }

    public int getNumReciteAlong() {
        return numReciteAlong;
    }

    public void setNumReciteAlong(int numReciteAlong) {
        this.numReciteAlong = numReciteAlong;
    }

    public int getNumReciteBackwards() {
        return numReciteBackwards;
    }

    public void setNumReciteBackwards(int numReciteBackwards) {
        this.numReciteBackwards = numReciteBackwards;
    }

    public int getHamdTotal() {
        return hamdTotal;
    }

    public void setHamdTotal(int hamdTotal) {
        this.hamdTotal = hamdTotal;
    }

    public int getHamd1() {
        return hamd1;
    }

    public void setHamd1(int hamd1) {
        this.hamd1 = hamd1;
    }

    public int getHamd2() {
        return hamd2;
    }

    public void setHamd2(int hamd2) {
        this.hamd2 = hamd2;
    }

    public int getHamd3() {
        return hamd3;
    }

    public void setHamd3(int hamd3) {
        this.hamd3 = hamd3;
    }

    public int getHamd4() {
        return hamd4;
    }

    public void setHamd4(int hamd4) {
        this.hamd4 = hamd4;
    }

    public int getHamd5() {
        return hamd5;
    }

    public void setHamd5(int hamd5) {
        this.hamd5 = hamd5;
    }

    public int getHamd6() {
        return hamd6;
    }

    public void setHamd6(int hamd6) {
        this.hamd6 = hamd6;
    }

    public int getHamd7() {
        return hamd7;
    }

    public void setHamd7(int hamd7) {
        this.hamd7 = hamd7;
    }

    public int getHamd8() {
        return hamd8;
    }

    public void setHamd8(int hamd8) {
        this.hamd8 = hamd8;
    }

    public int getHamd9() {
        return hamd9;
    }

    public void setHamd9(int hamd9) {
        this.hamd9 = hamd9;
    }

    public int getHamd10() {
        return hamd10;
    }

    public void setHamd10(int hamd10) {
        this.hamd10 = hamd10;
    }

    public int getHamd11() {
        return hamd11;
    }

    public void setHamd11(int hamd11) {
        this.hamd11 = hamd11;
    }

    public int getHamd12() {
        return hamd12;
    }

    public void setHamd12(int hamd12) {
        this.hamd12 = hamd12;
    }

    public int getHamd13() {
        return hamd13;
    }

    public void setHamd13(int hamd13) {
        this.hamd13 = hamd13;
    }

    public int getHamd14() {
        return hamd14;
    }

    public void setHamd14(int hamd14) {
        this.hamd14 = hamd14;
    }

    public int getHamd15() {
        return hamd15;
    }

    public void setHamd15(int hamd15) {
        this.hamd15 = hamd15;
    }

    public int getHamd16() {
        return hamd16;
    }

    public void setHamd16(int hamd16) {
        this.hamd16 = hamd16;
    }

    public int getHamd17() {
        return hamd17;
    }

    public void setHamd17(int hamd17) {
        this.hamd17 = hamd17;
    }

    public String getHamdc() {
        return hamdc;
    }

    public void setHamdc(String hamdc) {
        this.hamdc = hamdc;
    }

    public int getHamaTotal() {
        return hamaTotal;
    }

    public void setHamaTotal(int hamaTotal) {
        this.hamaTotal = hamaTotal;
    }

    public int getHama1() {
        return hama1;
    }

    public void setHama1(int hama1) {
        this.hama1 = hama1;
    }

    public int getHama2() {
        return hama2;
    }

    public void setHama2(int hama2) {
        this.hama2 = hama2;
    }

    public int getHama3() {
        return hama3;
    }

    public void setHama3(int hama3) {
        this.hama3 = hama3;
    }

    public int getHama4() {
        return hama4;
    }

    public void setHama4(int hama4) {
        this.hama4 = hama4;
    }

    public int getHama5() {
        return hama5;
    }

    public void setHama5(int hama5) {
        this.hama5 = hama5;
    }

    public int getHama6() {
        return hama6;
    }

    public void setHama6(int hama6) {
        this.hama6 = hama6;
    }

    public int getHama7() {
        return hama7;
    }

    public void setHama7(int hama7) {
        this.hama7 = hama7;
    }

    public int getHama8() {
        return hama8;
    }

    public void setHama8(int hama8) {
        this.hama8 = hama8;
    }

    public int getHama9() {
        return hama9;
    }

    public void setHama9(int hama9) {
        this.hama9 = hama9;
    }

    public int getHama10() {
        return hama10;
    }

    public void setHama10(int hama10) {
        this.hama10 = hama10;
    }

    public int getHama11() {
        return hama11;
    }

    public void setHama11(int hama11) {
        this.hama11 = hama11;
    }

    public int getHama12() {
        return hama12;
    }

    public void setHama12(int hama12) {
        this.hama12 = hama12;
    }

    public int getHama13() {
        return hama13;
    }

    public void setHama13(int hama13) {
        this.hama13 = hama13;
    }

    public int getHama14() {
        return hama14;
    }

    public void setHama14(int hama14) {
        this.hama14 = hama14;
    }

    public String getHamac() {
        return hamac;
    }

    public void setHamac(String hamac) {
        this.hamac = hamac;
    }

    public int getAdl1() {
        return adl1;
    }

    public void setAdl1(int adl1) {
        this.adl1 = adl1;
    }

    public int getAdl2() {
        return adl2;
    }

    public void setAdl2(int adl2) {
        this.adl2 = adl2;
    }

    public int getAdl3() {
        return adl3;
    }

    public void setAdl3(int adl3) {
        this.adl3 = adl3;
    }

    public int getAdl4() {
        return adl4;
    }

    public void setAdl4(int adl4) {
        this.adl4 = adl4;
    }

    public int getAdl5() {
        return adl5;
    }

    public void setAdl5(int adl5) {
        this.adl5 = adl5;
    }

    public int getAdl6() {
        return adl6;
    }

    public void setAdl6(int adl6) {
        this.adl6 = adl6;
    }

    public int getAdl7() {
        return adl7;
    }

    public void setAdl7(int adl7) {
        this.adl7 = adl7;
    }

    public int getAdl8() {
        return adl8;
    }

    public void setAdl8(int adl8) {
        this.adl8 = adl8;
    }

    public int getAdl9() {
        return adl9;
    }

    public void setAdl9(int adl9) {
        this.adl9 = adl9;
    }

    public int getAdl10() {
        return adl10;
    }

    public void setAdl10(int adl10) {
        this.adl10 = adl10;
    }

    public int getAdlTotal() {
        return adlTotal;
    }

    public void setAdlTotal(int adlTotal) {
        this.adlTotal = adlTotal;
    }

    public int getIadla1() {
        return iadla1;
    }

    public void setIadla1(int iadla1) {
        this.iadla1 = iadla1;
    }

    public int getIadla2() {
        return iadla2;
    }

    public void setIadla2(int iadla2) {
        this.iadla2 = iadla2;
    }

    public int getIadla3() {
        return iadla3;
    }

    public void setIadla3(int iadla3) {
        this.iadla3 = iadla3;
    }

    public int getIadla4() {
        return iadla4;
    }

    public void setIadla4(int iadla4) {
        this.iadla4 = iadla4;
    }

    public int getIadla5() {
        return iadla5;
    }

    public void setIadla5(int iadla5) {
        this.iadla5 = iadla5;
    }

    public int getIadla6() {
        return iadla6;
    }

    public void setIadla6(int iadla6) {
        this.iadla6 = iadla6;
    }

    public int getIadla7() {
        return iadla7;
    }

    public void setIadla7(int iadla7) {
        this.iadla7 = iadla7;
    }

    public int getIadla8() {
        return iadla8;
    }

    public void setIadla8(int iadla8) {
        this.iadla8 = iadla8;
    }

    public int getIadlaTotal() {
        return iadlaTotal;
    }

    public void setIadlaTotal(int iadlaTotal) {
        this.iadlaTotal = iadlaTotal;
    }

    public float getCdr() {
        return cdr;
    }

    public void setCdr(float cdr) {
        this.cdr = cdr;
    }

    public float getCdrMemory() {
        return cdrMemory;
    }

    public void setCdrMemory(float cdrMemory) {
        this.cdrMemory = cdrMemory;
    }

    public float getCdrOrientation() {
        return cdrOrientation;
    }

    public void setCdrOrientation(float cdrOrientation) {
        this.cdrOrientation = cdrOrientation;
    }

    public float getCdrJudgment() {
        return cdrJudgment;
    }

    public void setCdrJudgment(float cdrJudgment) {
        this.cdrJudgment = cdrJudgment;
    }

    public float getCdrSocialAffair() {
        return cdrSocialAffair;
    }

    public void setCdrSocialAffair(float cdrSocialAffair) {
        this.cdrSocialAffair = cdrSocialAffair;
    }

    public float getCdrHouseworkHobby() {
        return cdrHouseworkHobby;
    }

    public void setCdrHouseworkHobby(float cdrHouseworkHobby) {
        this.cdrHouseworkHobby = cdrHouseworkHobby;
    }

    public float getCdrSelfcare() {
        return cdrSelfcare;
    }

    public void setCdrSelfcare(float cdrSelfcare) {
        this.cdrSelfcare = cdrSelfcare;
    }

    public int getNpi() {
        return npi;
    }

    public void setNpi(int npi) {
        this.npi = npi;
    }

    public int getNihssScore() {
        return nihssScore;
    }

    public void setNihssScore(int nihssScore) {
        this.nihssScore = nihssScore;
    }

    public int getNihss1a() {
        return nihss1a;
    }

    public void setNihss1a(int nihss1a) {
        this.nihss1a = nihss1a;
    }

    public int getNihss1b() {
        return nihss1b;
    }

    public void setNihss1b(int nihss1b) {
        this.nihss1b = nihss1b;
    }

    public int getNihss1c() {
        return nihss1c;
    }

    public void setNihss1c(int nihss1c) {
        this.nihss1c = nihss1c;
    }

    public int getNihss2() {
        return nihss2;
    }

    public void setNihss2(int nihss2) {
        this.nihss2 = nihss2;
    }

    public int getNihss3() {
        return nihss3;
    }

    public void setNihss3(int nihss3) {
        this.nihss3 = nihss3;
    }

    public int getNihss4() {
        return nihss4;
    }

    public void setNihss4(int nihss4) {
        this.nihss4 = nihss4;
    }

    public int getNihss5a() {
        return nihss5a;
    }

    public void setNihss5a(int nihss5a) {
        this.nihss5a = nihss5a;
    }

    public String getNihss5aText() {
        return nihss5aText;
    }

    public void setNihss5aText(String nihss5aText) {
        this.nihss5aText = nihss5aText;
    }

    public int getNihss5b() {
        return nihss5b;
    }

    public void setNihss5b(int nihss5b) {
        this.nihss5b = nihss5b;
    }

    public String getNihss5bText() {
        return nihss5bText;
    }

    public void setNihss5bText(String nihss5bText) {
        this.nihss5bText = nihss5bText;
    }

    public int getNihss6a() {
        return nihss6a;
    }

    public void setNihss6a(int nihss6a) {
        this.nihss6a = nihss6a;
    }

    public String getNihss6aText() {
        return nihss6aText;
    }

    public void setNihss6aText(String nihss6aText) {
        this.nihss6aText = nihss6aText;
    }

    public int getNihss6b() {
        return nihss6b;
    }

    public void setNihss6b(int nihss6b) {
        this.nihss6b = nihss6b;
    }

    public String getNihss6bText() {
        return nihss6bText;
    }

    public void setNihss6bText(String nihss6bText) {
        this.nihss6bText = nihss6bText;
    }

    public int getNihss7() {
        return nihss7;
    }

    public void setNihss7(int nihss7) {
        this.nihss7 = nihss7;
    }

    public int getNihss8() {
        return nihss8;
    }

    public void setNihss8(int nihss8) {
        this.nihss8 = nihss8;
    }

    public int getNihss9() {
        return nihss9;
    }

    public void setNihss9(int nihss9) {
        this.nihss9 = nihss9;
    }

    public int getNihss10() {
        return nihss10;
    }

    public void setNihss10(int nihss10) {
        this.nihss10 = nihss10;
    }

    public String getNihss10Text() {
        return nihss10Text;
    }

    public void setNihss10Text(String nihss10Text) {
        this.nihss10Text = nihss10Text;
    }

    public int getNihss11() {
        return nihss11;
    }

    public void setNihss11(int nihss11) {
        this.nihss11 = nihss11;
    }

    public int getmRsScore() {
        return mRsScore;
    }

    public void setmRsScore(int mRsScore) {
        this.mRsScore = mRsScore;
    }

    public int getCategoryFluency() {
        return categoryFluency;
    }

    public void setCategoryFluency(int categoryFluency) {
        this.categoryFluency = categoryFluency;
    }

    public int getWhisperingAnimals15s() {
        return whisperingAnimals15s;
    }

    public void setWhisperingAnimals15s(int whisperingAnimals15s) {
        this.whisperingAnimals15s = whisperingAnimals15s;
    }

    public int getWhisperingAnimals30s() {
        return whisperingAnimals30s;
    }

    public void setWhisperingAnimals30s(int whisperingAnimals30s) {
        this.whisperingAnimals30s = whisperingAnimals30s;
    }

    public int getWhisperingAnimals45s() {
        return whisperingAnimals45s;
    }

    public void setWhisperingAnimals45s(int whisperingAnimals45s) {
        this.whisperingAnimals45s = whisperingAnimals45s;
    }

    public int getWhisperingAnimals60s() {
        return whisperingAnimals60s;
    }

    public void setWhisperingAnimals60s(int whisperingAnimals60s) {
        this.whisperingAnimals60s = whisperingAnimals60s;
    }

    public int getVisualReproduction() {
        return visualReproduction;
    }

    public void setVisualReproduction(int visualReproduction) {
        this.visualReproduction = visualReproduction;
    }

    public int getVrir1() {
        return vrir1;
    }

    public void setVrir1(int vrir1) {
        this.vrir1 = vrir1;
    }

    public int getVrir2() {
        return vrir2;
    }

    public void setVrir2(int vrir2) {
        this.vrir2 = vrir2;
    }

    public int getVrir3() {
        return vrir3;
    }

    public void setVrir3(int vrir3) {
        this.vrir3 = vrir3;
    }

    public int getVrir4() {
        return vrir4;
    }

    public void setVrir4(int vrir4) {
        this.vrir4 = vrir4;
    }

    public int getVisualReproductionDelayedRecall() {
        return visualReproductionDelayedRecall;
    }

    public void setVisualReproductionDelayedRecall(int visualReproductionDelayedRecall) {
        this.visualReproductionDelayedRecall = visualReproductionDelayedRecall;
    }

    public int getVrdr1() {
        return vrdr1;
    }

    public void setVrdr1(int vrdr1) {
        this.vrdr1 = vrdr1;
    }

    public int getVrdr2() {
        return vrdr2;
    }

    public void setVrdr2(int vrdr2) {
        this.vrdr2 = vrdr2;
    }

    public int getVrdr3() {
        return vrdr3;
    }

    public void setVrdr3(int vrdr3) {
        this.vrdr3 = vrdr3;
    }

    public int getVrdr4() {
        return vrdr4;
    }

    public void setVrdr4(int vrdr4) {
        this.vrdr4 = vrdr4;
    }

    public int getVisualCopying() {
        return visualCopying;
    }

    public void setVisualCopying(int visualCopying) {
        this.visualCopying = visualCopying;
    }

    public int getVRC1() {
        return VRC1;
    }

    public void setVRC1(int VRC1) {
        this.VRC1 = VRC1;
    }

    public int getVRC2() {
        return VRC2;
    }

    public void setVRC2(int VRC2) {
        this.VRC2 = VRC2;
    }

    public int getVRC3() {
        return VRC3;
    }

    public void setVRC3(int VRC3) {
        this.VRC3 = VRC3;
    }

    public int getVRC4() {
        return VRC4;
    }

    public void setVRC4(int VRC4) {
        this.VRC4 = VRC4;
    }

    public int getDrawClock() {
        return drawClock;
    }

    public void setDrawClock(int drawClock) {
        this.drawClock = drawClock;
    }

    public int getBostonNaming() {
        return bostonNaming;
    }

    public void setBostonNaming(int bostonNaming) {
        this.bostonNaming = bostonNaming;
    }

    public int getBnt0() {
        return bnt0;
    }

    public void setBnt0(int bnt0) {
        this.bnt0 = bnt0;
    }

    public int getBnt1() {
        return bnt1;
    }

    public void setBnt1(int bnt1) {
        this.bnt1 = bnt1;
    }

    public int getBnt2() {
        return bnt2;
    }

    public void setBnt2(int bnt2) {
        this.bnt2 = bnt2;
    }

    public int getBntClue() {
        return bntClue;
    }

    public void setBntClue(int bntClue) {
        this.bntClue = bntClue;
    }

    public int getBntChoice() {
        return bntChoice;
    }

    public void setBntChoice(int bntChoice) {
        this.bntChoice = bntChoice;
    }

    public int getLearnAuralWordsInstantly() {
        return learnAuralWordsInstantly;
    }

    public void setLearnAuralWordsInstantly(int learnAuralWordsInstantly) {
        this.learnAuralWordsInstantly = learnAuralWordsInstantly;
    }

    public int getAvltir1() {
        return avltir1;
    }

    public void setAvltir1(int avltir1) {
        this.avltir1 = avltir1;
    }

    public int getAvltir2() {
        return avltir2;
    }

    public void setAvltir2(int avltir2) {
        this.avltir2 = avltir2;
    }

    public int getAvltir3() {
        return avltir3;
    }

    public void setAvltir3(int avltir3) {
        this.avltir3 = avltir3;
    }

    public int getAvltInsertNum() {
        return avltInsertNum;
    }

    public void setAvltInsertNum(int avltInsertNum) {
        this.avltInsertNum = avltInsertNum;
    }

    public int getAvltInsertTime() {
        return avltInsertTime;
    }

    public void setAvltInsertTime(int avltInsertTime) {
        this.avltInsertTime = avltInsertTime;
    }

    public int getAvltRepeat() {
        return avltRepeat;
    }

    public void setAvltRepeat(int avltRepeat) {
        this.avltRepeat = avltRepeat;
    }

    public int getAvltStrtegy1Yes0No() {
        return avltStrtegy1Yes0No;
    }

    public void setAvltStrtegy1Yes0No(int avltStrtegy1Yes0No) {
        this.avltStrtegy1Yes0No = avltStrtegy1Yes0No;
    }

    public int getShortTimeDelayForAuditoryVocabularyLearning() {
        return shortTimeDelayForAuditoryVocabularyLearning;
    }

    public void setShortTimeDelayForAuditoryVocabularyLearning(int shortTimeDelayForAuditoryVocabularyLearning) {
        this.shortTimeDelayForAuditoryVocabularyLearning = shortTimeDelayForAuditoryVocabularyLearning;
    }

    public int getAvltInsertNum1() {
        return avltInsertNum1;
    }

    public void setAvltInsertNum1(int avltInsertNum1) {
        this.avltInsertNum1 = avltInsertNum1;
    }

    public int getAvltInsertTime1() {
        return avltInsertTime1;
    }

    public void setAvltInsertTime1(int avltInsertTime1) {
        this.avltInsertTime1 = avltInsertTime1;
    }

    public int getAvltRepeat1() {
        return avltRepeat1;
    }

    public void setAvltRepeat1(int avltRepeat1) {
        this.avltRepeat1 = avltRepeat1;
    }

    public int getAvltStrtegy1Yes0No1() {
        return avltStrtegy1Yes0No1;
    }

    public void setAvltStrtegy1Yes0No1(int avltStrtegy1Yes0No1) {
        this.avltStrtegy1Yes0No1 = avltStrtegy1Yes0No1;
    }

    public int getLongDelayInAuditoryVocabularyLearning() {
        return longDelayInAuditoryVocabularyLearning;
    }

    public void setLongDelayInAuditoryVocabularyLearning(int longDelayInAuditoryVocabularyLearning) {
        this.longDelayInAuditoryVocabularyLearning = longDelayInAuditoryVocabularyLearning;
    }

    public int getAvltddrClothing() {
        return avltddrClothing;
    }

    public void setAvltddrClothing(int avltddrClothing) {
        this.avltddrClothing = avltddrClothing;
    }

    public int getAvltddrProfession() {
        return avltddrProfession;
    }

    public void setAvltddrProfession(int avltddrProfession) {
        this.avltddrProfession = avltddrProfession;
    }

    public int getAvltddrFlower() {
        return avltddrFlower;
    }

    public void setAvltddrFlower(int avltddrFlower) {
        this.avltddrFlower = avltddrFlower;
    }

    public int getAvltInsertNum2() {
        return avltInsertNum2;
    }

    public void setAvltInsertNum2(int avltInsertNum2) {
        this.avltInsertNum2 = avltInsertNum2;
    }

    public int getAvltInsertTime2() {
        return avltInsertTime2;
    }

    public void setAvltInsertTime2(int avltInsertTime2) {
        this.avltInsertTime2 = avltInsertTime2;
    }

    public int getAvltRepeat2() {
        return avltRepeat2;
    }

    public void setAvltRepeat2(int avltRepeat2) {
        this.avltRepeat2 = avltRepeat2;
    }

    public int getAvltStrtegy1Yes0No2() {
        return avltStrtegy1Yes0No2;
    }

    public void setAvltStrtegy1Yes0No2(int avltStrtegy1Yes0No2) {
        this.avltStrtegy1Yes0No2 = avltStrtegy1Yes0No2;
    }

    public int getAuditoryVocabularyLearningAndRecognition() {
        return auditoryVocabularyLearningAndRecognition;
    }

    public void setAuditoryVocabularyLearningAndRecognition(int auditoryVocabularyLearningAndRecognition) {
        this.auditoryVocabularyLearningAndRecognition = auditoryVocabularyLearningAndRecognition;
    }

    public int getAvltRecognize() {
        return avltRecognize;
    }

    public void setAvltRecognize(int avltRecognize) {
        this.avltRecognize = avltRecognize;
    }

    public int getAvltEliminatesTheDrawingClock4Minutes() {
        return avltEliminatesTheDrawingClock4Minutes;
    }

    public void setAvltEliminatesTheDrawingClock4Minutes(int avltEliminatesTheDrawingClock4Minutes) {
        this.avltEliminatesTheDrawingClock4Minutes = avltEliminatesTheDrawingClock4Minutes;
    }

    public int getDota() {
        return dota;
    }

    public void setDota(int dota) {
        this.dota = dota;
    }

    public int getSilhouetteQuiz() {
        return silhouetteQuiz;
    }

    public void setSilhouetteQuiz(int silhouetteQuiz) {
        this.silhouetteQuiz = silhouetteQuiz;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public int getS4() {
        return s4;
    }

    public void setS4(int s4) {
        this.s4 = s4;
    }

    public int getS5() {
        return s5;
    }

    public void setS5(int s5) {
        this.s5 = s5;
    }

    public int getS6() {
        return s6;
    }

    public void setS6(int s6) {
        this.s6 = s6;
    }

    public int getS7() {
        return s7;
    }

    public void setS7(int s7) {
        this.s7 = s7;
    }

    public int getS8() {
        return s8;
    }

    public void setS8(int s8) {
        this.s8 = s8;
    }

    public int getS9() {
        return s9;
    }

    public void setS9(int s9) {
        this.s9 = s9;
    }

    public int getS10() {
        return s10;
    }

    public void setS10(int s10) {
        this.s10 = s10;
    }

    public int getS11() {
        return s11;
    }

    public void setS11(int s11) {
        this.s11 = s11;
    }

    public int getS12() {
        return s12;
    }

    public void setS12(int s12) {
        this.s12 = s12;
    }

    public int getS13() {
        return s13;
    }

    public void setS13(int s13) {
        this.s13 = s13;
    }

    public int getS14() {
        return s14;
    }

    public void setS14(int s14) {
        this.s14 = s14;
    }

    public int getS15() {
        return s15;
    }

    public void setS15(int s15) {
        this.s15 = s15;
    }

    public float getS1Correct() {
        return s1Correct;
    }

    public void setS1Correct(float s1Correct) {
        this.s1Correct = s1Correct;
    }

    public float getS1TesterCorrect() {
        return s1TesterCorrect;
    }

    public void setS1TesterCorrect(float s1TesterCorrect) {
        this.s1TesterCorrect = s1TesterCorrect;
    }

    public float getS1SelfCorrect() {
        return s1SelfCorrect;
    }

    public void setS1SelfCorrect(float s1SelfCorrect) {
        this.s1SelfCorrect = s1SelfCorrect;
    }

    public float getS1Time() {
        return s1Time;
    }

    public void setS1Time(float s1Time) {
        this.s1Time = s1Time;
    }

    public float getS2Correct() {
        return s2Correct;
    }

    public void setS2Correct(float s2Correct) {
        this.s2Correct = s2Correct;
    }

    public float getS2TesterCorrect() {
        return s2TesterCorrect;
    }

    public void setS2TesterCorrect(float s2TesterCorrect) {
        this.s2TesterCorrect = s2TesterCorrect;
    }

    public float getS2SelfCorrect() {
        return s2SelfCorrect;
    }

    public void setS2SelfCorrect(float s2SelfCorrect) {
        this.s2SelfCorrect = s2SelfCorrect;
    }

    public float getS2Time() {
        return s2Time;
    }

    public void setS2Time(float s2Time) {
        this.s2Time = s2Time;
    }

    public float getS3Correct() {
        return s3Correct;
    }

    public void setS3Correct(float s3Correct) {
        this.s3Correct = s3Correct;
    }

    public float getS3TesterCorrect() {
        return s3TesterCorrect;
    }

    public void setS3TesterCorrect(float s3TesterCorrect) {
        this.s3TesterCorrect = s3TesterCorrect;
    }

    public float getS3SelfCorrect() {
        return s3SelfCorrect;
    }

    public void setS3SelfCorrect(float s3SelfCorrect) {
        this.s3SelfCorrect = s3SelfCorrect;
    }

    public float getS3Time() {
        return s3Time;
    }

    public void setS3Time(float s3Time) {
        this.s3Time = s3Time;
    }

    public int getColorBlindnessColorWeaknessSuspicious() {
        return colorBlindnessColorWeaknessSuspicious;
    }

    public void setColorBlindnessColorWeaknessSuspicious(int colorBlindnessColorWeaknessSuspicious) {
        this.colorBlindnessColorWeaknessSuspicious = colorBlindnessColorWeaknessSuspicious;
    }

    public String getStroopNote() {
        return stroopNote;
    }

    public void setStroopNote(String stroopNote) {
        this.stroopNote = stroopNote;
    }

    public int getTmt1SelfCorrect() {
        return tmt1SelfCorrect;
    }

    public void setTmt1SelfCorrect(int tmt1SelfCorrect) {
        this.tmt1SelfCorrect = tmt1SelfCorrect;
    }

    public int getTmt1TesterCorrect() {
        return tmt1TesterCorrect;
    }

    public void setTmt1TesterCorrect(int tmt1TesterCorrect) {
        this.tmt1TesterCorrect = tmt1TesterCorrect;
    }

    public int getTmt1Time() {
        return tmt1Time;
    }

    public void setTmt1Time(int tmt1Time) {
        this.tmt1Time = tmt1Time;
    }

    public int getTmt1Note() {
        return tmt1Note;
    }

    public void setTmt1Note(int tmt1Note) {
        this.tmt1Note = tmt1Note;
    }

    public int getTmt2SelfCorrect() {
        return tmt2SelfCorrect;
    }

    public void setTmt2SelfCorrect(int tmt2SelfCorrect) {
        this.tmt2SelfCorrect = tmt2SelfCorrect;
    }

    public int getTmt2TesterCorrect() {
        return tmt2TesterCorrect;
    }

    public void setTmt2TesterCorrect(int tmt2TesterCorrect) {
        this.tmt2TesterCorrect = tmt2TesterCorrect;
    }

    public int getTmt2Time() {
        return tmt2Time;
    }

    public void setTmt2Time(int tmt2Time) {
        this.tmt2Time = tmt2Time;
    }

    public int getTmt2Note() {
        return tmt2Note;
    }

    public void setTmt2Note(int tmt2Note) {
        this.tmt2Note = tmt2Note;
    }

    public int getConnectedQuizNote() {
        return connectedQuizNote;
    }

    public void setConnectedQuizNote(int connectedQuizNote) {
        this.connectedQuizNote = connectedQuizNote;
    }

    public int getAbnormalGaitScale() {
        return abnormalGaitScale;
    }

    public void setAbnormalGaitScale(int abnormalGaitScale) {
        this.abnormalGaitScale = abnormalGaitScale;
    }

    public int getCorticospinalTract() {
        return corticospinalTract;
    }

    public void setCorticospinalTract(int corticospinalTract) {
        this.corticospinalTract = corticospinalTract;
    }

    public int getCorticalMedullaryTract() {
        return corticalMedullaryTract;
    }

    public void setCorticalMedullaryTract(int corticalMedullaryTract) {
        this.corticalMedullaryTract = corticalMedullaryTract;
    }

    public int getExtravertebralSystem() {
        return extravertebralSystem;
    }

    public void setExtravertebralSystem(int extravertebralSystem) {
        this.extravertebralSystem = extravertebralSystem;
    }

    public int getAbnormalGait() {
        return abnormalGait;
    }

    public void setAbnormalGait(int abnormalGait) {
        this.abnormalGait = abnormalGait;
    }

    public int getGaitSeverity() {
        return gaitSeverity;
    }

    public void setGaitSeverity(int gaitSeverity) {
        this.gaitSeverity = gaitSeverity;
    }

    public int getTinettiBalanceScale() {
        return tinettiBalanceScale;
    }

    public void setTinettiBalanceScale(int tinettiBalanceScale) {
        this.tinettiBalanceScale = tinettiBalanceScale;
    }

    public int getTinBal1() {
        return tinBal1;
    }

    public void setTinBal1(int tinBal1) {
        this.tinBal1 = tinBal1;
    }

    public int getTinBal2() {
        return tinBal2;
    }

    public void setTinBal2(int tinBal2) {
        this.tinBal2 = tinBal2;
    }

    public int getTinBal3() {
        return tinBal3;
    }

    public void setTinBal3(int tinBal3) {
        this.tinBal3 = tinBal3;
    }

    public int getTinBal4() {
        return tinBal4;
    }

    public void setTinBal4(int tinBal4) {
        this.tinBal4 = tinBal4;
    }

    public int getTinBal5() {
        return tinBal5;
    }

    public void setTinBal5(int tinBal5) {
        this.tinBal5 = tinBal5;
    }

    public int getTinBal6() {
        return tinBal6;
    }

    public void setTinBal6(int tinBal6) {
        this.tinBal6 = tinBal6;
    }

    public int getTinBal7() {
        return tinBal7;
    }

    public void setTinBal7(int tinBal7) {
        this.tinBal7 = tinBal7;
    }

    public int getTinBal8a() {
        return tinBal8a;
    }

    public void setTinBal8a(int tinBal8a) {
        this.tinBal8a = tinBal8a;
    }

    public int getTinBal8b() {
        return tinBal8b;
    }

    public void setTinBal8b(int tinBal8b) {
        this.tinBal8b = tinBal8b;
    }

    public int getTinBal9() {
        return tinBal9;
    }

    public void setTinBal9(int tinBal9) {
        this.tinBal9 = tinBal9;
    }

    public int getTinettiGaitScale() {
        return tinettiGaitScale;
    }

    public void setTinettiGaitScale(int tinettiGaitScale) {
        this.tinettiGaitScale = tinettiGaitScale;
    }

    public int getTinGait1() {
        return tinGait1;
    }

    public void setTinGait1(int tinGait1) {
        this.tinGait1 = tinGait1;
    }

    public int getTinGait2a() {
        return tinGait2a;
    }

    public void setTinGait2a(int tinGait2a) {
        this.tinGait2a = tinGait2a;
    }

    public int getTinGait2b() {
        return tinGait2b;
    }

    public void setTinGait2b(int tinGait2b) {
        this.tinGait2b = tinGait2b;
    }

    public int getTinGait2c() {
        return tinGait2c;
    }

    public void setTinGait2c(int tinGait2c) {
        this.tinGait2c = tinGait2c;
    }

    public int getTinGait2d() {
        return tinGait2d;
    }

    public void setTinGait2d(int tinGait2d) {
        this.tinGait2d = tinGait2d;
    }

    public int getTinGait3() {
        return tinGait3;
    }

    public void setTinGait3(int tinGait3) {
        this.tinGait3 = tinGait3;
    }

    public int getTinGait4() {
        return tinGait4;
    }

    public void setTinGait4(int tinGait4) {
        this.tinGait4 = tinGait4;
    }

    public int getTinGait5() {
        return tinGait5;
    }

    public void setTinGait5(int tinGait5) {
        this.tinGait5 = tinGait5;
    }

    public int getTinGait6() {
        return tinGait6;
    }

    public void setTinGait6(int tinGait6) {
        this.tinGait6 = tinGait6;
    }

    public int getTinGait7() {
        return tinGait7;
    }

    public void setTinGait7(int tinGait7) {
        this.tinGait7 = tinGait7;
    }

    public int getTugTest() {
        return tugTest;
    }

    public void setTugTest(int tugTest) {
        this.tugTest = tugTest;
    }

    public int getWalker() {
        return walker;
    }

    public void setWalker(int walker) {
        this.walker = walker;
    }

    public String getToast() {
        return toast;
    }

    public void setToast(String toast) {
        this.toast = toast;
    }
}
