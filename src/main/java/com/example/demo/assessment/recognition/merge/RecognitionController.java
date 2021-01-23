package com.example.demo.assessment.recognition.merge;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class RecognitionController {

    @Autowired
    RecognitionRepository recognitionRepository;

    @RequestMapping("/welcome-2")
    public String welcomepage() {
        return "Welcome to Demo";
    }

    @GetMapping("/recognitions")
    public ResponseEntity<List<Recognition>> getAllRecognitions() {
        try {
            List<Recognition> recognitions = new ArrayList<>();

            recognitions.addAll(recognitionRepository.findAll());

            if (recognitions.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(recognitions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recognitions/{id}")
    public ResponseEntity<Recognition> getRecognitionById(@PathVariable("id") long id) {
        Optional<Recognition> recognitionData = recognitionRepository.findById(id);

        return recognitionData.map(recognition -> new ResponseEntity<>(recognition, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/recognitions")
    public ResponseEntity<Recognition> createRecognition(@RequestBody Recognition recognition) {
        try {
            Recognition _recognition = recognitionRepository
                    .save(new Recognition(recognition.getRecognitionNum(),recognition.getRecognitionDate(),
                            recognition.getOrientation(),recognition.getTime(),recognition.getLocation(),recognition.getImmediateMemory(),
                            recognition.getComputingPower(),recognition.getMemory(),recognition.getNaming(),recognition.getRepeat(),
                            recognition.getRead(),recognition.getInstruction(),recognition.getExpression(),recognition.getDrawing(),
                            recognition.getMoCA(),recognition.getCarryOut(),recognition.getConnect(),recognition.getCube(),
                            recognition.getDrawClockOutline(),recognition.getNumebr(),recognition.getPointer(),recognition.getNaming1(),
                            recognition.getInstantMemory1(),recognition.getInstantMemory2(),recognition.getNote(),recognition.getReciteAlong(),
                            recognition.getReciteBackwards(),recognition.getKnock(),recognition.getCalculation(),recognition.getLanguage(),
                            recognition.getRepeat1(),recognition.getFluency(),recognition.getAbstraction(),recognition.getClassifiacationReminder(),
                            recognition.getMultiChoiceReminder(),recognition.getOrientation1(),recognition.getDelayedRecall(),recognition.getNumReciteAlong(),
                            recognition.getNumReciteBackwards(),recognition.getHamdTotal(),recognition.getHamd1(),recognition.getHamd2(),
                            recognition.getHamd3(),recognition.getHamd4(),recognition.getHamd5(),recognition.getHamd6(),recognition.getHamd7(),
                            recognition.getHamd8(),recognition.getHamd9(),recognition.getHamd10(), recognition.getHamd1(),recognition.getHamd2(),recognition.getHamd3(),
                            recognition.getHamd4(),recognition.getHamd5(),recognition.getHamd6(),recognition.getHamd7(),recognition.getHamdc(),
                            recognition.getHamaTotal(),recognition.getHama1(),recognition.getHama2(),recognition.getHama3(),
                            recognition.getHama4(),recognition.getHama5(),recognition.getHama6(),recognition.getHama7(),recognition.getHama8(),
                            recognition.getHama9(),recognition.getHama10(),recognition.getHama1(),recognition.getHama2(),recognition.getHama3(),
                            recognition.getHama4(),recognition.getHamac(),recognition.getAdl1(),recognition.getAdl2(),recognition.getAdl3(),
                            recognition.getAdl4(),recognition.getAdl5(),recognition.getAdl6(),recognition.getAdl7(),recognition.getAdl8(),
                            recognition.getAdl9(),recognition.getAdl10(),recognition.getAdlTotal(),recognition.getIadla1(),recognition.getIadla2(),
                            recognition.getIadla3(),recognition.getAvltRecognize(),recognition.getIadla5(),recognition.getIadla6(),recognition.getIadla7(),
                            recognition.getIadla8(),recognition.getIadlaTotal(),recognition.getCdr(),recognition.getCdrMemory(),recognition.getCdrOrientation(),
                            recognition.getCdrJudgment(),recognition.getCdrSocialAffair(),recognition.getCdrHouseworkHobby(),recognition.getCdrSelfcare(),
                            recognition.getNpi(),recognition.getNihssScore(),recognition.getNihss1a(),recognition.getNihss1b(),recognition.getNihss1c(),
                            recognition.getNihss2(),recognition.getNihss3(),recognition.getNihss4(),recognition.getNihss5a(),recognition.getNihss5aText(),
                            recognition.getNihss5b(),recognition.getNihss5bText(),recognition.getNihss6a(),recognition.getNihss6aText(),
                            recognition.getNihss6b(),recognition.getNihss6bText(),recognition.getNihss7(),recognition.getNihss8(),
                            recognition.getNihss9(),recognition.getNihss10(),recognition.getNihss10Text(),recognition.getNihss11(),
                            recognition.getmRsScore(),recognition.getCategoryFluency(),recognition.getWhisperingAnimals15s(),
                            recognition.getWhisperingAnimals30s(),recognition.getWhisperingAnimals45s(),recognition.getWhisperingAnimals60s(),
                            recognition.getVisualReproduction(),recognition.getVrir1(),recognition.getVrir2(),recognition.getVrir3(),
                            recognition.getVrir4(),recognition.getVisualReproductionDelayedRecall(),recognition.getVrdr1(),recognition.getVrdr2(),
                            recognition.getVrdr3(),recognition.getVrdr4(),recognition.getVisualCopying(),recognition.getVRC1(),
                            recognition.getVRC2(),recognition.getVRC3(),recognition.getVRC4(),recognition.getDrawClock(),recognition.getBostonNaming(),
                            recognition.getBnt0(),recognition.getBnt1(),recognition.getBnt2(),recognition.getBntClue(),recognition.getBntChoice(),
                            recognition.getLearnAuralWordsInstantly(),recognition.getAvltir1(),recognition.getAvltir2(),recognition.getAvltir3(),
                            recognition.getAvltInsertNum(),recognition.getAvltInsertTime(),recognition.getAvltRepeat(),recognition.getAvltStrtegy1Yes0No(),
                            recognition.getShortTimeDelayForAuditoryVocabularyLearning(),recognition.getAvltInsertNum1(),recognition.getAvltInsertTime1(),
                            recognition.getAvltRepeat1(),recognition.getAvltStrtegy1Yes0No1(),recognition.getLongDelayInAuditoryVocabularyLearning(),
                            recognition.getAvltddrClothing(),recognition.getAvltddrProfession(),recognition.getAvltddrFlower(),
                            recognition.getAvltInsertNum2(),recognition.getAvltInsertTime2(),recognition.getAvltRepeat2(),recognition.getAvltStrtegy1Yes0No2(),
                            recognition.getAuditoryVocabularyLearningAndRecognition(),recognition.getAvltRecognize(),recognition.getAvltEliminatesTheDrawingClock4Minutes(),
                            recognition.getDota(),recognition.getSilhouetteQuiz(),recognition.getS1(),recognition.getS2(),recognition.getS3(),recognition.getS4(),recognition.getS5(),
                            recognition.getS6(),recognition.getS7(),recognition.getS8(),recognition.getS9(),recognition.getS10(),recognition.getS1(),
                            recognition.getS2(),recognition.getS3(),recognition.getS4(),recognition.getS5(),recognition.getS1Correct(),recognition.getS1TesterCorrect(),
                            recognition.getS1SelfCorrect(),recognition.getS1Time(),recognition.getS2Correct(),recognition.getS2TesterCorrect(),recognition.getS2SelfCorrect(),
                            recognition.getS2Time(),recognition.getS3Correct(),recognition.getS3TesterCorrect(),recognition.getS3SelfCorrect(),
                            recognition.getS3Time(),recognition.getColorBlindnessColorWeaknessSuspicious(),recognition.getStroopNote(),
                            recognition.getTmt1SelfCorrect(),recognition.getTmt1TesterCorrect(),recognition.getTmt1Time(),recognition.getTmt1Note(),
                            recognition.getTmt2SelfCorrect(),recognition.getTmt2TesterCorrect(),recognition.getTmt2Time(),recognition.getTmt2Note(),
                            recognition.getConnectedQuizNote(),recognition.getAbnormalGaitScale(),recognition.getCorticospinalTract(),
                            recognition.getCorticalMedullaryTract(),recognition.getExtravertebralSystem(),recognition.getAbnormalGait(),
                            recognition.getGaitSeverity(),recognition.getTinettiBalanceScale(),recognition.getTinBal1(),recognition.getTinBal2(),recognition.getTinBal3(),
                            recognition.getTinBal4(),recognition.getTinBal5(),recognition.getTinBal6(),recognition.getTinBal7(),recognition.getTinBal8a(),
                            recognition.getTinBal8b(),recognition.getTinBal9(),recognition.getTinettiGaitScale(),recognition.getTinGait1(),
                            recognition.getTinGait2a(),recognition.getTinGait2b(),recognition.getTinGait2c(),recognition.getTinGait2d(),
                            recognition.getTinGait3(),recognition.getTinGait4(),recognition.getTinGait5(),recognition.getTinGait6(),
                            recognition.getTinGait7(),recognition.getTugTest(),recognition.getWalker(),recognition.getToast()
                            )


                    );
            return new ResponseEntity<>(_recognition, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/recognitions/{id}")
    public ResponseEntity<Recognition> updateRecognition(@PathVariable("id") long id, @RequestBody Recognition recognition) {
        Optional<Recognition> recognitionData = recognitionRepository.findById(id);

        if (recognitionData.isPresent()) {
            Recognition _recognition = recognitionData.get();
            _recognition.setRecognitionNum(recognition.getRecognitionNum());
            _recognition.setRecognitionDate(recognition.getRecognitionDate());
            _recognition.setOrientation(recognition.getOrientation());
            _recognition.setTime(recognition.getTime());
            _recognition.setLocation(recognition.getLocation());
            _recognition.setImmediateMemory(recognition.getImmediateMemory());
            _recognition.setComputingPower(recognition.getComputingPower());
            _recognition.setMemory(recognition.getMemory());
            _recognition.setNaming(recognition.getNaming());
            _recognition.setRepeat(recognition.getRepeat());
            _recognition.setRead(recognition.getRead());
            _recognition.setInstruction(recognition.getInstruction());
            _recognition.setExpression(recognition.getExpression());
            _recognition.setDrawing(recognition.getDrawing());
            _recognition.setMoCA(recognition.getMoCA());
            _recognition.setCarryOut(recognition.getCarryOut());
            _recognition.setConnect(recognition.getConnect());
            _recognition.setCube(recognition.getCube());
            _recognition.setDrawClockOutline(recognition.getDrawClockOutline());
            _recognition.setNumebr(recognition.getNumebr());
            _recognition.setPointer(recognition.getPointer());
            _recognition.setNaming1(recognition.getNaming1());
            _recognition.setInstantMemory1(recognition.getInstantMemory1());
            _recognition.setInstantMemory2(recognition.getInstantMemory2());
            _recognition.setNote(recognition.getNote());
            _recognition.setReciteAlong(recognition.getReciteAlong());
            _recognition.setReciteBackwards(recognition.getReciteBackwards());
            _recognition.setKnock(recognition.getKnock());
            _recognition.setCalculation(recognition.getCalculation());
            _recognition.setLanguage(recognition.getLanguage());
            _recognition.setRepeat1(recognition.getRepeat1());
            _recognition.setFluency(recognition.getFluency());
            _recognition.setAbstraction(recognition.getAbstraction());
            _recognition.setClassifiacationReminder(recognition.getClassifiacationReminder());
            _recognition.setMultiChoiceReminder(recognition.getMultiChoiceReminder());
            _recognition.setOrientation1(recognition.getOrientation1());
            _recognition.setDelayedRecall(recognition.getDelayedRecall());
            _recognition.setNumReciteAlong(recognition.getNumReciteAlong());
            _recognition.setNumReciteBackwards(recognition.getNumReciteBackwards());
            _recognition.setHamdTotal(recognition.getHamdTotal());
            _recognition.setHamd1(recognition.getHamd1());
            _recognition.setHamd2(recognition.getHamd2());
            _recognition.setHamd3(recognition.getHamd3());
            _recognition.setHamd4(recognition.getHamd4());
            _recognition.setHamd5(recognition.getHamd5());
            _recognition.setHamd6(recognition.getHamd6());
            _recognition.setHamd7(recognition.getHamd7());
            _recognition.setHamd8(recognition.getHamd8());
            _recognition.setHamd9(recognition.getHamd9());
            _recognition.setHamd10(recognition.getHamd10());
            _recognition.setHamd11(recognition.getHamd11());
            _recognition.setHamd12(recognition.getHamd12());
            _recognition.setHamd13(recognition.getHamd13());
            _recognition.setHamd14(recognition.getHamd14());
            _recognition.setHamd15(recognition.getHamd15());
            _recognition.setHamd16(recognition.getHamd16());
            _recognition.setHamd17(recognition.getHamd17());
            _recognition.setHamdc(recognition.getHamdc());
            _recognition.setHamaTotal(recognition.getHamaTotal());
            _recognition.setHama1(recognition.getHama1());
            _recognition.setHama2(recognition.getHama2());
            _recognition.setHama3(recognition.getHama3());
            _recognition.setHama4(recognition.getHama4());
            _recognition.setHama5(recognition.getHama5());
            _recognition.setHama6(recognition.getHama6());
            _recognition.setHama7(recognition.getHama7());
            _recognition.setHama8(recognition.getHama8());
            _recognition.setHama9(recognition.getHama9());
            _recognition.setHama10(recognition.getHama10());
            _recognition.setHama11(recognition.getHama11());
            _recognition.setHama12(recognition.getHama12());
            _recognition.setHama13(recognition.getHama13());
            _recognition.setHama14(recognition.getHama14());
            _recognition.setHamac(recognition.getHamac());
            _recognition.setAdl1(recognition.getAdl1());
            _recognition.setAdl2(recognition.getAdl2());
            _recognition.setAdl3(recognition.getAdl3());
            _recognition.setAdl4(recognition.getAdl4());
            _recognition.setAdl5(recognition.getAdl5());
            _recognition.setAdl6(recognition.getAdl6());
            _recognition.setAdl7(recognition.getAdl7());
            _recognition.setAdl8(recognition.getAdl8());
            _recognition.setAdl9(recognition.getAdl9());
            _recognition.setAdl10(recognition.getAdl10());
            _recognition.setAdlTotal(recognition.getAdlTotal());
            _recognition.setIadla1(recognition.getIadla1());
            _recognition.setIadla2(recognition.getIadla2());
            _recognition.setIadla3(recognition.getIadla3());
            _recognition.setIadla4(recognition.getIadla4());
            _recognition.setIadla5(recognition.getIadla5());
            _recognition.setIadla6(recognition.getIadla6());
            _recognition.setIadla7(recognition.getIadla7());
            _recognition.setIadla8(recognition.getIadla8());
            _recognition.setIadlaTotal(recognition.getIadlaTotal());
            _recognition.setCdr(recognition.getCdr());
            _recognition.setCdrMemory(recognition.getCdrMemory());
            _recognition.setCdrOrientation(recognition.getCdrOrientation());
            _recognition.setCdrJudgment(recognition.getCdrJudgment());
            _recognition.setCdrSocialAffair(recognition.getCdrSocialAffair());
            _recognition.setCdrHouseworkHobby(recognition.getCdrHouseworkHobby());
            _recognition.setCdrSelfcare(recognition.getCdrSelfcare());
            _recognition.setNpi(recognition.getNpi());
            _recognition.setNihssScore(recognition.getNihssScore());
            _recognition.setNihss1a(recognition.getNihss1a());
            _recognition.setNihss1b(recognition.getNihss1b());
            _recognition.setNihss1c(recognition.getNihss1c());
            _recognition.setNihss2(recognition.getNihss2());
            _recognition.setNihss3(recognition.getNihss3());
            _recognition.setNihss4(recognition.getNihss4());
            _recognition.setNihss5a(recognition.getNihss5a());
            _recognition.setNihss5aText(recognition.getNihss5aText());
            _recognition.setNihss5b(recognition.getNihss5b());
            _recognition.setNihss5bText(recognition.getNihss5bText());
            _recognition.setNihss6a(recognition.getNihss6a());
            _recognition.setNihss6aText(recognition.getNihss6aText());
            _recognition.setNihss6b(recognition.getNihss6b());
            _recognition.setNihss6bText(recognition.getNihss6bText());
            _recognition.setNihss7(recognition.getNihss7());
            _recognition.setNihss8(recognition.getNihss8());
            _recognition.setNihss9(recognition.getNihss9());
            _recognition.setNihss10(recognition.getNihss10());
            _recognition.setNihss10Text(recognition.getNihss10Text());
            _recognition.setNihss11(recognition.getNihss11());
            _recognition.setmRsScore(recognition.getmRsScore());
            _recognition.setCategoryFluency(recognition.getCategoryFluency());
            _recognition.setWhisperingAnimals15s(recognition.getWhisperingAnimals15s());
            _recognition.setWhisperingAnimals30s(recognition.getWhisperingAnimals30s());
            _recognition.setWhisperingAnimals45s(recognition.getWhisperingAnimals45s());
            _recognition.setWhisperingAnimals60s(recognition.getWhisperingAnimals60s());
            _recognition.setVisualReproduction(recognition.getVisualReproduction());
            _recognition.setVrir1(recognition.getVrir1());
            _recognition.setVrir2(recognition.getVrir2());
            _recognition.setVrir3(recognition.getVrir3());
            _recognition.setVrir4(recognition.getVrir4());
            _recognition.setVisualReproductionDelayedRecall(recognition.getVisualReproductionDelayedRecall());
            _recognition.setVrdr1(recognition.getVrdr1());
            _recognition.setVrdr2(recognition.getVrdr2());
            _recognition.setVrdr3(recognition.getVrdr3());
            _recognition.setVrdr4(recognition.getVrdr4());
            _recognition.setVisualCopying(recognition.getVisualCopying());
            _recognition.setVRC1(recognition.getVRC1());
            _recognition.setVRC2(recognition.getVRC2());
            _recognition.setVRC3(recognition.getVRC3());
            _recognition.setVRC4(recognition.getVRC4());
            _recognition.setDrawClock(recognition.getDrawClock());
            _recognition.setBostonNaming(recognition.getBostonNaming());
            _recognition.setBnt0(recognition.getBnt0());
            _recognition.setBnt1(recognition.getBnt1());
            _recognition.setBnt2(recognition.getBnt2());
            _recognition.setBntClue(recognition.getBntClue());
            _recognition.setBntChoice(recognition.getBntChoice());
            _recognition.setLearnAuralWordsInstantly(recognition.getLearnAuralWordsInstantly());
            _recognition.setAvltir1(recognition.getAvltir1());
            _recognition.setAvltir2(recognition.getAvltir2());
            _recognition.setAvltir3(recognition.getAvltir3());
            _recognition.setAvltInsertNum(recognition.getAvltInsertNum());
            _recognition.setAvltInsertTime(recognition.getAvltInsertTime());
            _recognition.setAvltRepeat(recognition.getAvltRepeat());
            _recognition.setAvltStrtegy1Yes0No(recognition.getAvltStrtegy1Yes0No());
            _recognition.setShortTimeDelayForAuditoryVocabularyLearning(recognition.getShortTimeDelayForAuditoryVocabularyLearning());
            _recognition.setAvltInsertNum1(recognition.getAvltInsertNum1());
            _recognition.setAvltInsertTime1(recognition.getAvltInsertTime1());
            _recognition.setAvltRepeat1(recognition.getAvltRepeat1());
            _recognition.setAvltStrtegy1Yes0No1(recognition.getAvltStrtegy1Yes0No1());
            _recognition.setLongDelayInAuditoryVocabularyLearning(recognition.getLongDelayInAuditoryVocabularyLearning());
            _recognition.setAvltddrClothing(recognition.getAvltddrClothing());
            _recognition.setAvltddrProfession(recognition.getAvltddrProfession());
            _recognition.setAvltddrFlower(recognition.getAvltddrFlower());
            _recognition.setAvltInsertNum2(recognition.getAvltInsertNum2());
            _recognition.setAvltInsertTime2(recognition.getAvltInsertTime2());
            _recognition.setAvltRepeat2(recognition.getAvltRepeat2());
            _recognition.setAvltStrtegy1Yes0No2(recognition.getAvltStrtegy1Yes0No2());
            _recognition.setAuditoryVocabularyLearningAndRecognition(recognition.getAuditoryVocabularyLearningAndRecognition());
            _recognition.setAvltRecognize(recognition.getAvltRecognize());
            _recognition.setAvltEliminatesTheDrawingClock4Minutes(recognition.getAvltEliminatesTheDrawingClock4Minutes());
            _recognition.setDota(recognition.getDota());
            _recognition.setSilhouetteQuiz(recognition.getSilhouetteQuiz());
            _recognition.setS1(recognition.getS1());
            _recognition.setS2(recognition.getS2());
            _recognition.setS3(recognition.getS3());
            _recognition.setS4(recognition.getS4());
            _recognition.setS5(recognition.getS5());
            _recognition.setS6(recognition.getS6());
            _recognition.setS7(recognition.getS7());
            _recognition.setS8(recognition.getS8());
            _recognition.setS9(recognition.getS9());
            _recognition.setS10(recognition.getS10());
            _recognition.setS11(recognition.getS11());
            _recognition.setS12(recognition.getS12());
            _recognition.setS13(recognition.getS13());
            _recognition.setS14(recognition.getS14());
            _recognition.setS15(recognition.getS15());
            _recognition.setS1Correct(recognition.getS1Correct());
            _recognition.setS1TesterCorrect(recognition.getS1TesterCorrect());
            _recognition.setS1SelfCorrect(recognition.getS1SelfCorrect());
            _recognition.setS1Time(recognition.getS1Time());
            _recognition.setS2Correct(recognition.getS2Correct());
            _recognition.setS2TesterCorrect(recognition.getS2TesterCorrect());
            _recognition.setS2SelfCorrect(recognition.getS2SelfCorrect());
            _recognition.setS2Time(recognition.getS2Time());
            _recognition.setS3Correct(recognition.getS3Correct());
            _recognition.setS3TesterCorrect(recognition.getS3TesterCorrect());
            _recognition.setS3SelfCorrect(recognition.getS3SelfCorrect());
            _recognition.setS3Time(recognition.getS3Time());
            _recognition.setColorBlindnessColorWeaknessSuspicious(recognition.getColorBlindnessColorWeaknessSuspicious());
            _recognition.setStroopNote(recognition.getStroopNote());
            _recognition.setTmt1SelfCorrect(recognition.getTmt1SelfCorrect());
            _recognition.setTmt1TesterCorrect(recognition.getTmt1TesterCorrect());
            _recognition.setTmt1Time(recognition.getTmt1Time());
            _recognition.setTmt1Note(recognition.getTmt1Note());
            _recognition.setTmt2SelfCorrect(recognition.getTmt2SelfCorrect());
            _recognition.setTmt2TesterCorrect(recognition.getTmt2TesterCorrect());
            _recognition.setTmt2Time(recognition.getTmt2Time());
            _recognition.setTmt2Note(recognition.getTmt2Note());
            _recognition.setConnectedQuizNote(recognition.getConnectedQuizNote());
            _recognition.setAbnormalGaitScale(recognition.getAbnormalGaitScale());
            _recognition.setCorticospinalTract(recognition.getCorticospinalTract());
            _recognition.setCorticalMedullaryTract(recognition.getCorticalMedullaryTract());
            _recognition.setExtravertebralSystem(recognition.getExtravertebralSystem());
            _recognition.setAbnormalGait(recognition.getAbnormalGait());
            _recognition.setGaitSeverity(recognition.getGaitSeverity());
            _recognition.setTinettiBalanceScale(recognition.getTinettiBalanceScale());
            _recognition.setTinBal1(recognition.getTinBal1());
            _recognition.setTinBal2(recognition.getTinBal2());
            _recognition.setTinBal3(recognition.getTinBal3());
            _recognition.setTinBal4(recognition.getTinBal4());
            _recognition.setTinBal5(recognition.getTinBal5());
            _recognition.setTinBal6(recognition.getTinBal6());
            _recognition.setTinBal7(recognition.getTinBal7());
            _recognition.setTinBal8a(recognition.getTinBal8a());
            _recognition.setTinBal8b(recognition.getTinBal8b());
            _recognition.setTinBal9(recognition.getTinBal9());
            _recognition.setTinettiGaitScale(recognition.getTinettiGaitScale());
            _recognition.setTinGait1(recognition.getTinGait1());
            _recognition.setTinGait2a(recognition.getTinGait2a());
            _recognition.setTinGait2b(recognition.getTinGait2b());
            _recognition.setTinGait2c(recognition.getTinGait2c());
            _recognition.setTinGait2d(recognition.getTinGait2d());
            _recognition.setTinGait3(recognition.getTinGait3());
            _recognition.setTinGait4(recognition.getTinGait4());
            _recognition.setTinGait5(recognition.getTinGait5());
            _recognition.setTinGait6(recognition.getTinGait6());
            _recognition.setTinGait7(recognition.getTinGait7());
            _recognition.setTugTest(recognition.getTugTest());
            _recognition.setWalker(recognition.getWalker());
            _recognition.setToast(recognition.getToast());

            return new ResponseEntity<>(recognitionRepository.save(_recognition), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/recognitions/{id}")
    public ResponseEntity<HttpStatus> deleteRecognition(@PathVariable("id") long id) {
        try {
            recognitionRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/recognitions")
    public ResponseEntity<HttpStatus> deleteAllRecognitions() {
        try {
            recognitionRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}