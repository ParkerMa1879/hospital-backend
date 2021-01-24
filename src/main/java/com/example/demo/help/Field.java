package com.example.demo.help;

import com.example.demo.assessment.recognition.Boston.Boston;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

public class Field {
    static String[] recoFields = {
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


    static String[] testFields = {
            "auxiliaryCheckNum",  "patientInformation",  "auxiliaryExaminationDate",  "hypertensionRandom",
            "heartRate",  "randomBloodSugar",  "fastingBloodGlucose",  "twoHourBloodGluoseAftermeal",
            "hba1c",  "cho",  "tg",  "ldl",  "hdl",  "apolipoproteinA",  "apolipoproteinB",
            "bun",  "cr",  "egfr",  "crp",  "hcyHomocysteine",  "prothrombinTime",  "internationalNormalizedRatio",
            "activatedPartialThrombinTime",  "thrombinTime",  "fibrinogen",  "dDimer",  "adp",  "arachidonicAcid",
            "hb",  "apoe",  "sloco1b1",  "aβ",  "ttau",  "ptau",  "srage",  "bace1"
    };

    static String[] imageFields ={
            "imageNum",  "entryTime",  "patientInformation",  "mrNum",  "headVesselMriMra",
            "headVesselMriMraFolder",  "cranialSpectroscopy",  "ctcta",  "vascularUltrasound",
            "tcd"
    };

    static String[] infoFields = {
            "id", "name",  "age",  "identification",  "gender",  "date",  "namePinyin",  "mrRaw",
            "mrSort",  "mrDate",  "remarkForFollowupVisit",  "csvdNum",  "primDiag",  "followupYear",
            "dropOut",  "hospitalNum",  "bedNum",  "clinicNum",  "birthDate",  "ethnic",  "eduLevel",
            "eduYear",  "profession",  "work",  "address",  "contact",  "specimenRemark",  "blood",
            "bloodBox",  "bloodSampleNum",  "cerebrospinalFluidNum",  "urineNum",  "medicalHistory",
            "memoryDeclineCourse",  "increasedMemoryImpairment",  "maritalStatus",  "height",  "weight",
            "cerebrovascularDisease",  "cerebrovascularDiseaseYear",  "stableCerebrovascularDisease",
            "cerebrovascularDiseaseMedication",  "cnsDiseaseDescription",  "hypertension",  "hypertensionYear",
            "highestHypertension",  "averageHypertension",  "stableHypertension",  "hypertensionMedication",
            "diabetes",  "diabetesYear",  "stableDiabetes",  "diabetesMedication",  "coronaryDisease",
            "coronaryDiseaseYear",  "stableCoronaryDisease",  "atrialFibrillation",  "atrialFibrillationYear",
            "atrialFibrillationControl",  "hyperlipidemia",  "hyperlipidemiaYear",  "stableHyperlipidemia",
            "hyperlipidemiaMedication",  "medicalRemark",  "otherMedicine",  "smoke",  "smokeYear",  "smokeNumPerDay",
            "quitSmoking",  "quitSmokingYear",  "drink",  "historyOfAlcoholism",  "alcoholGPerDay",  "quitDrinking",
            "quitDrinkingYear",  "familyHistory",  "familyHistoryDiscription"
    };

    static String[] basicInfoFields = {
             "name",  "age",  "identification",  "gender", "date",  "namePinyin",
     "mrRaw",  "mrSort",  "mrDate",  "remarkForFollowupVisit",  "csvdNum",
     "primDiag",  "followupYear",  "dropOut",  "hospitalNum",  "bedNum",
     "clinicNum",  "birthDate",  "ethnic",  "eduLevel",  "eduYear",
     "profession",  "work",  "address",  "contact",  "specimenRemark",
     "blood",  "bloodBox",  "bloodSampleNum",  "cerebrospinalFluidNum",
     "urineNum",  "medicalHistory",  "memoryDeclineCourse",
     "increasedMemoryImpairment",  "maritalStatus",  "height",  "weight",
     "cerebrovascularDisease",  "cerebrovascularDiseaseYear",
     "stableCerebrovascularDisease",  "cerebrovascularDiseaseMedication",
     "cnsDiseaseDescription",  "hypertension",  "hypertensionYear",
     "highestHypertension",  "averageHypertension",  "stableHypertension",
     "hypertensionMedication",  "diabetes",  "diabetesYear",
     "stableDiabetes",  "diabetesMedication",  "coronaryDisease",
     "coronaryDiseaseYear",  "stableCoronaryDisease",  "atrialFibrillation",
     "atrialFibrillationYear",  "atrialFibrillationControl",  "hyperlipidemia",
     "hyperlipidemiaYear",  "stableHyperlipidemia",  "hyperlipidemiaMedication",
     "medicalRemark",  "otherMedicine",  "smoke",  "smokeYear",  "smokeNumPerDay",  "quitSmoking",
     "quitSmokingYear",  "drink",  "historyOfAlcoholism",  "alcoholGPerDay",  "quitDrinking",
     "quitDrinkingYear",  "familyHistory",  "familyHistoryDiscription"
    };

    static String[] mmseFields = {
            "id", "basicInfoId",  "answer1",  "answer2",  "answer3",
             "answer4",  "answer5",  "answer6",  "answer7",  "answer8",  "answer9",
             "answer10",  "answer11"
    };

    static String[] mocaFields = {
            "id",   "basicInfoId",  "sum_score",  "sum_score_1",  "answer1",  "answer2",  "answer3",
             "answer4",  "answer5",  "answer6",  "question1",  "question2",  "sum_score_2",
             "answer7",  "answer8",  "answer9",  "answer10",  "sum_score_3",  "answer11",
             "answer12",  "answer13",  "answer14",  "question3",  "question4",  "answer15"
    };

    static String[] cdrFields = {
            "id", "basicInfoId",  "sum_score",  "answer1",  "answer2",  "answer3",
             "answer4",  "answer5",  "answer6"
    };

    static String[] hamdFields = {
            "id", "basicInfoId",  "sum_score",  "answer1",  "answer2",  "answer3",
             "answer4",  "answer5",  "answer6",  "answer7",  "answer8",
            "answer9",  "answer10",  "answer11",  "answer12",  "answer13",
             "answer14",  "answer15",  "answer16",  "answer17"
    };

    static String[] hamaFields = {
            "id", "basicInfoId",  "sum_score",  "answer1",  "answer2",  "answer3",  "answer4",
             "answer5",  "answer6",  "answer7",  "answer8",  "answer9",  "answer10",
             "answer11",  "answer12",  "answer13",  "answer14"
    };

    static String[] dailylifeFields = {
     "basicInfoId",  "date",  "answer1",  "answer2",  "answer3",
     "answer4",  "answer5",  "answer6",  "answer7",  "answer8",
     "answer9",  "answer10",  "sum_score_1",  "answer11",
     "answer12",  "answer13",  "answer14",  "answer15",  "answer16",
     "answer17",  "answer18",  "sum_score_2"
    };

    static String[] executionFields = {
            "id",  "basicInfoId",  "sum_score",  "answer1",  "answer2",  "answer3",
             "answer4",  "question1",  "question2",  "question3",  "question4",
             "question5",  "question6",  "question7",  "question8",  "question9",
             "question10",  "question11",  "question12",  "question13",  "question14",
             "question15",  "question16",  "question17",  "question18",  "question19",
             "question20",  "question21",  "question22",  "question23"
    };

    static String[] visualReproductionFields = {
            "id", "basicInfoId",  "sum_score_1",  "answer1",  "answer2",  "answer3",
             "answer4",  "sum_score_2",  "answer5",  "answer6",  "answer7",
             "answer8",  "sum_score_3",  "answer9",  "answer10",  "answer11",
             "answer12",  "sum_score_4",  "answer13",  "answer14",  "answer15",
             "answer16"
    };

    static String[] silhouetteQuizFields = {
            "id",  "basicInfoId",  "sum_score",  "answer1",  "answer2",  "answer3",
             "answer4",  "answer5",  "answer6",  "answer7",  "answer8",
             "answer9",  "answer10",  "answer11",  "answer12",  "answer13",
             "answer14",  "answer15"
    };

    static String[] bostonFields = {
            "id",   "basicInfoId",  "sum_score",  "answer1",  "answer2",  "answer3",
             "answer4",  "answer5"
    };

    static String[] memoryFields = {
            "id",  "basicInfoId",  "sum_score_1",  "answer1",  "answer2",  "answer3",
             "question1",  "question2",  "question3",  "question4",  "question5",
             "question6",  "question7",  "question8",  "question9",  "question10",
             "question11",  "question12",  "question13",  "question14",  "question15",
             "question16",  "question17",  "sum_score_2",  "answer4",  "answer5",
             "question18",  "question19",  "question20"
    };

    static String[] gaitFields = {
            "id",   "basicInfoId",  "sum_score_1",  "answer1",  "answer2",  "answer3",  "answer4",
             "answer5",  "sum_score_2",  "answer6",  "answer7",  "answer8",  "answer9",
             "answer10",  "answer11",  "answer12",  "answer13",  "answer14",  "answer15",
             "sum_score_3",  "answer16",  "answer17",  "answer18",  "answer19",  "answer20",
             "answer21",  "answer22",  "answer23",  "answer24",  "answer25",  "question1",
             "question2"
    };

    static String[] nihssFields = {
            "id",   "basicInfoId",  "sum_score",  "answer1",  "answer2",  "answer3",  "answer4",
             "answer5",  "answer6",  "answer7",  "question1",  "answer8",  "question2",
             "answer9",  "question3",  "answer10",  "question4",  "answer11",  "answer12",
             "answer13",  "answer14",  "question5",  "answer15"
    };

    static String[] otherFields = {
            "basicInfoId",  "date",  "question1",  "question2",  "question3",  "question4",
            "question5",  "question6",  "question7"
    };

    public static StringBuilder originalControllerCode(){
        StringBuilder str = new StringBuilder();
        str.append("public class BasicInfoController {\n");
        str.append("    @Autowired\n");
        str.append("    BasicInfoRepository basicInfoRepository;\n");
        str.append("    @GetMapping(\"/basicInfos\")\n");
        str.append("    public ResponseEntity<List<BasicInfo>> getAllBasicInfos(@RequestParam(required = false) String name) {\n");
        str.append("        try {\n");
        str.append("            List<BasicInfo> basicInfos = new ArrayList<>();\n");
        str.append("            basicInfos.addAll(basicInfoRepository.findAll());\n");
        str.append("            if (basicInfos.isEmpty()) {\n");
        str.append("                return new ResponseEntity<>(HttpStatus.NO_CONTENT);\n");
        str.append("            }\n");
        str.append("            return new ResponseEntity<>(basicInfos, HttpStatus.OK);\n");
        str.append("        } catch (Exception e) {\n");
        str.append("            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);\n");
        str.append("        }\n");
        str.append("    }\n");
        str.append("    @GetMapping(\"/basicInfos/{id}\")\n");
        str.append("    public ResponseEntity<BasicInfo> getBasicInfoById(@PathVariable(\"id\") long id) {\n");
        str.append("        Optional<BasicInfo> basicInfoData = basicInfoRepository.findById(id);\n");
        str.append("        return basicInfoData.map(basicInfo -> new ResponseEntity<>(basicInfo, \n");
        str.append("HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));\n");
        str.append("    }\n");
        str.append("    @PostMapping(\"/basicInfos\")\n");
        str.append("    public ResponseEntity<BasicInfo> createBasicInfo(@RequestBody BasicInfo basicInfo) {\n");
        str.append("        try {\n");
        str.append("            BasicInfo _basicInfo = basicInfoRepository\n");
        str.append("                    .save(new BasicInfo());\n");
        str.append("            return new ResponseEntity<>(_basicInfo, HttpStatus.CREATED);\n");
        str.append("        } catch (Exception e) {\n");
        str.append("            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);\n");
        str.append("        }\n");
        str.append("    }\n");
        str.append("    @PutMapping(\"/basicInfos/{id}\")\n");
        str.append("    public ResponseEntity<BasicInfo> updateBasicInfo(@PathVariable(\"id\") long id, @RequestBody \n");
        str.append("BasicInfo basicInfo) {\n");
        str.append("        Optional<BasicInfo> basicInfoData = basicInfoRepository.findById(id);\n");
        str.append("        if (basicInfoData.isPresent()) {\n");
        str.append("            BasicInfo _basicInfo = basicInfoData.get();\n");
        str.append("            return new ResponseEntity<>(basicInfoRepository.save(_basicInfo), HttpStatus.OK);\n");
        str.append("        } else {\n");
        str.append("            return new ResponseEntity<>(HttpStatus.NOT_FOUND);\n");
        str.append("        }\n");
        str.append("    }\n");
        str.append("    @DeleteMapping(\"/basicInfos/{id}\")");
        str.append("    public ResponseEntity<HttpStatus> deleteBasicInfo(@PathVariable(\"id\") long id) {\n");
        str.append("        try {\n");
        str.append("            basicInfoRepository.deleteById(id);\n");
        str.append("            return new ResponseEntity<>(HttpStatus.NO_CONTENT);\n");
        str.append("        } catch (Exception e) {\n");
        str.append("            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);\n");
        str.append("        }\n");
        str.append("    }\n");
        str.append("    @DeleteMapping(\"/basicInfos\")\n");
        str.append("    public ResponseEntity<HttpStatus> deleteAllBasicInfos() {\n");
        str.append("        try {\n");
        str.append("            basicInfoRepository.deleteAll();\n");
        str.append("            return new ResponseEntity<>(HttpStatus.NO_CONTENT);\n");
        str.append("        } catch (Exception e) {\n");
        str.append("            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);\n");
        str.append("        }\n");
        str.append("    }\n");
        str.append("}\n");

        return str;
    }

    public static StringBuilder originalFindByCode(){
        StringBuilder str = new StringBuilder();
        str.append("@GetMapping(\"/bostons/basicInfoId\")\n");
        str.append("public ResponseEntity<List<Boston>> findByBasicInfoId(@RequestParam() long basicInfoId) {\n");
        str.append("    try {\n"
);
        str.append("        List<Boston> bostons = bostonRepository.findByBasicInfoId(basicInfoId);\n");
        str.append("        if (bostons.isEmpty()) {\n");
        str.append("            return new ResponseEntity<>(HttpStatus.NO_CONTENT);\n");
        str.append("        }\n");
        str.append("        return new ResponseEntity<>(bostons, HttpStatus.OK);\n");
        str.append("    } catch (Exception e) {\n");
        str.append("        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);\n");
        str.append("    }\n");
        str.append("}\n");
        return str;
    }
}
