package com.example.demo.help;

import java.util.Date;

public class Generater {
    String[] recoFields = {
     "recognitionNum",  "patientInformation",  "recognitionDate",  "orientation",  "time",
     "location",  "immediateMemory",  "computingPower",  "memory",  "naming", "repeat",
     "read",  "instruction",  "expression",  "drawing",  "moCA",  "carryOut",  "connect",
     "cube",  "drawClockOutline",  "numebr",  "pointer",  "naming1",  "instantMemory1",
     "instantMemory2",  "note",  "reciteAlong",  "reciteBackwards",  "knock",  "calculation",
     "language",  "repeat1",  "fluency",  "abstraction",  "classifiacationReminder",
     "multiChoiceReminder",  "orientation1",  "delayedRecall",  "numReciteAlong",  "numReciteBackwards",
     "hamdTotal",  "hamd1",  "hamd2",  "hamd3",  "hamd4",  "hamd5",  "hamd6",  "hamd7",
     "hamd8",  "hamd9",  "hamd10",  "hamd11",  "hamd12",  "hamd13",  "hamd14",  "hamd15",
     "hamd16",  "hamd17",  "hamdc",  "hamaTotal",  "hama1",  "hama2",  "hama3",  "hama4",
     "hama5",  "hama6",  "hama7",  "hama8",  "hama9",  "hama10",  "hama11",  "hama12",
     "hama13",  "hama14",  "hamac",  "adl1",  "adl2",  "adl3",  "adl4",  "adl5",
     "adl6",  "adl7",  "adl8",  "adl9",  "adl10",  "adlTotal",  "iadla1",  "iadla2",
     "iadla3",  "iadla4",  "iadla5",  "iadla6",  "iadla7",  "iadla8",  "iadlaTotal",
     "cdr",  "cdrMemory",  "cdrOrientation",  "cdrJudgment",  "cdrSocialAffair",
     "cdrHouseworkHobby",  "cdrSelfcare",  "npi",  "nihssScore",  "nihss1a",  "nihss1b",
     "nihss1c",  "nihss2",  "nihss3",  "nihss4",  "nihss5a",  "nihss5aText",  "nihss5b",
     "nihss5bText",  "nihss6a",  "nihss6aText",  "nihss6b",  "nihss6bText",  "nihss7",
     "nihss8",  "nihss9",  "nihss10",  "nihss10Text",  "nihss11",  "mRsScore",  "categoryFluency",
     "whisperingAnimals15s",  "whisperingAnimals30s",  "whisperingAnimals45s",  "whisperingAnimals60s",
     "visualReproduction",  "vrir1",  "vrir2",  "vrir3",  "vrir4",  "visualReproductionDelayedRecall",
     "vrdr1",  "vrdr2",  "vrdr3",  "vrdr4",  "visualCopying",  "VRC1",  "VRC2",  "VRC3",  "VRC4",
     "drawClock",  "bostonNaming",  "bnt0",  "bnt1",  "bnt2",  "bntClue",  "bntChoice",
     "learnAuralWordsInstantly",  "avltir1",  "avltir2",  "avltir3",  "avltInsertNum",  "avltInsertTime",
     "avltRepeat",  "avltStrtegy1Yes0No",  "shortTimeDelayForAuditoryVocabularyLearning",  "avltInsertNum1",
     "avltInsertTime1",  "avltRepeat1",  "avltStrtegy1Yes0No1",  "longDelayInAuditoryVocabularyLearning",
     "avltddrClothing",  "avltddrProfession",  "avltddrFlower",  "avltInsertNum2",  "avltInsertTime2",
     "avltRepeat2",  "avltStrtegy1Yes0No2",  "auditoryVocabularyLearningAndRecognition",  "avltRecognize",
     "avltEliminatesTheDrawingClock4Minutes",  "dota",  "silhouetteQuiz",  "s1",  "s2",  "s3",  "s4",
     "s5",  "s6",  "s7",  "s8",  "s9",  "s10",  "s11",  "s12",  "s13",  "s14",  "s15",  "s1Correct",
     "s1TesterCorrect",  "s1SelfCorrect",  "s1Time",  "s2Correct",  "s2TesterCorrect",  "s2SelfCorrect",
     "s2Time",  "s3Correct",  "s3TesterCorrect",  "s3SelfCorrect",  "s3Time",  "colorBlindnessColorWeaknessSuspicious",
     "stroopNote",  "tmt1SelfCorrect",  "tmt1TesterCorrect",  "tmt1Time",  "tmt1Note",  "tmt2SelfCorrect",  "tmt2TesterCorrect",
     "tmt2Time",  "tmt2Note",  "connectedQuizNote",  "abnormalGaitScale",  "corticospinalTract",
     "corticalMedullaryTract",  "extravertebralSystem",  "abnormalGait",  "gaitSeverity",  "tinettiBalanceScale",
     "tinBal1",  "tinBal2",  "tinBal3",  "tinBal4",  "tinBal5",  "tinBal6",  "tinBal7",  "tinBal8a",
     "tinBal8b",  "tinBal9",  "tinettiGaitScale",  "tinGait1",  "tinGait2a",  "tinGait2b",  "tinGait2c",
     "tinGait2d",  "tinGait3",  "tinGait4",  "tinGait5",  "tinGait6",  "tinGait7",  "tugTest",
     "walker",  "toast"
    };


    String[] testFields = {
            "auxiliaryCheckNum",  "patientInformation",  "auxiliaryExaminationDate",  "hypertensionRandom",
            "heartRate",  "randomBloodSugar",  "fastingBloodGlucose",  "twoHourBloodGluoseAftermeal",
            "hba1c",  "cho",  "tg",  "ldl",  "hdl",  "apolipoproteinA",  "apolipoproteinB",
            "bun",  "cr",  "egfr",  "crp",  "hcyHomocysteine",  "prothrombinTime",  "internationalNormalizedRatio",
            "activatedPartialThrombinTime",  "thrombinTime",  "fibrinogen",  "dDimer",  "adp",  "arachidonicAcid",
            "hb",  "apoe",  "sloco1b1",  "aβ",  "ttau",  "ptau",  "srage",  "bace1"
    };

    String[] imageFields ={
     "imageNum",  "entryTime",  "patientInformation",  "mrNum",  "headVesselMriMra",
     "headVesselMriMraFolder",  "cranialSpectroscopy",  "ctcta",  "vascularUltrasound",
     "tcd"
    };

    String[] infoFields = {
     "name",  "age",  "id",  "gender",  "date",  "namePinyin",  "mrRaw",
     "mrSort",  "mrDate",  "remarkForFollowupVisit",  "primDiag",  "followupYear",
     "dropOut", "hospitalNum", "bedNum", "clinicNum",  "birthDate",  "ethnic",
     "eduLevel",  "eduYear",  "profession", "work",  "address",  "contact",
     "specimenRemark",  "blood",  "bloodBox",  "bloodSampleNum",  "cerebrospinalFluidNum",
     "urineNum",  "medicalHistory",  "memoryDeclineCourse",  "increasedMemoryImpairment",
     "maritalStatus",  "height",  "weight",  "cerebrovascularDisease",  "cerebrovascularDiseaseYear",
     "stableCerebrovascularDisease",  "cerebrovascularDiseaseMedication",  "cnsDiseaseDescription",
     "hypertension",  "hypertensionYear",  "highestHypertension",  "averageHypertension",
     "stableHypertension",  "hypertensionMedication",  "diabetes",  "diabetesYear",  "stableDiabetes",
     "diabetesMedication",  "coronaryDisease",  "coronaryDiseaseYear",  "stableCoronaryDisease",
     "atrialFibrillation",  "atrialFibrillationYear",  "atrialFibrillationControl",  "hyperlipidemia",
     "hyperlipidemiaYear",  "stableHyperlipidemia",  "hyperlipidemiaMedication",  "medicalRemark",
     "otherMedicine",  "smoke",  "smokeYear",  "smokeNumPerDay",  "quitSmoking",  "quitSmokingYear",
     "Drink",  "historyOfAlcoholism",  "alcoholGPerDay",  "quitDrinking",  "quitDrinkingYear",
     "familyHistory",  "familyHistoryDiscription"
    };

    public String toSet(String field){
        return "set" + field.substring(0,1).toUpperCase() + field.substring(1);
    }

    public String toGet(String field){
        return "get" + field.substring(0,1).toUpperCase() + field.substring(1);
    }

    public StringBuilder getMappingCode(String[] fields){
        StringBuilder str = new StringBuilder();
        for (String field : fields){
            str.append("_image.");
            str.append(toSet(field)+"(");
            str.append("image.");
            str.append(toGet(field)+"());");
            str.append(System.lineSeparator());
        }

        return str;
    }

    public StringBuilder getConstructingCode(String[] fields){
        StringBuilder str = new StringBuilder();
        for (String field : fields){
            str.append("image.");
            str.append(toGet(field)+"(),");
        }

        return str;
    }

    public StringBuilder getJfinalFieldCode(String[] fields){
        StringBuilder str = new StringBuilder();
        for (String field: fields){
            str.append("private String " + field + ";");
            str.append(System.lineSeparator());
        }

        return str;
    }

    public static  void main(String[] argv) throws Exception{
//        Generater recoGenerater = new Generater();
//        System.out.println(recoGenerater.getMappingCode(recoGenerater.recoFields));

//        Generater testGenerator = new Generater();
//        System.out.println(testGenerator.getConstructingCode(testGenerator.testFields));
//        System.out.println(testGenerator.getMappingCode(testGenerator.testFields));

//        Generater imageGenerator = new Generater();
//        System.out.println(imageGenerator.getConstructingCode(imageGenerator.imageFields));
//        System.out.println(imageGenerator.getMappingCode(imageGenerator.imageFields));

        Generater infoGenerator = new Generater();
        System.out.println(infoGenerator.getJfinalFieldCode(infoGenerator.infoFields));

    }

}
