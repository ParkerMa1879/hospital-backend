package com.example.demo.assessment.testing;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TestingController {
    @Autowired
    TestingRepository testingRepository;

    @RequestMapping("/welcome-3")
    public String welcomepage() {
        return "Welcome to Demo";
    }

    @GetMapping("/testings")
    public ResponseEntity<List<Testing>> getAllTestings() {
        try {
            List<Testing> testings = new ArrayList<>();

            testings.addAll(testingRepository.findAll());

            if (testings.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(testings, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/testings/{id}")
    public ResponseEntity<Testing> getTestingById(@PathVariable("id") long id) {
        Optional<Testing> testingData = testingRepository.findById(id);

        return testingData.map(testing -> new ResponseEntity<>(testing, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/testings")
    public ResponseEntity<Testing> createTesting(@RequestBody Testing testing) {
        try {
            Testing _testing = testingRepository
                    .save(new Testing(testing.getAuxiliaryCheckNum(),
                            testing.getAuxiliaryExaminationDate(),testing.getHypertensionRandom(),
                            testing.getHeartRate(),testing.getRandomBloodSugar(),testing.getFastingBloodGlucose(),
                            testing.getTwoHourBloodGluoseAftermeal(),testing.getHba1c(),testing.getCho(),testing.getTg(),
                            testing.getLdl(),testing.getHdl(),testing.getApolipoproteinA(),testing.getApolipoproteinB(),
                            testing.getBun(),testing.getCr(),testing.getEgfr(),testing.getCrp(),testing.getHcyHomocysteine(),
                            testing.getProthrombinTime(),testing.getInternationalNormalizedRatio(),
                            testing.getActivatedPartialThrombinTime(),testing.getThrombinTime(),testing.getFibrinogen(),
                            testing.getdDimer(),testing.getAdp(),testing.getArachidonicAcid(),testing.getHb(),
                            testing.getApoe(),testing.getSloco1b1(),testing.getAβ(),testing.getTtau(),testing.getPtau(),
                            testing.getSrage(),testing.getBace1()
                    ));
            return new ResponseEntity<>(_testing, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/testings/{id}")
    public ResponseEntity<Testing> updateTesting(@PathVariable("id") long id, @RequestBody Testing testing) {
        Optional<Testing> testingData = testingRepository.findById(id);

        if (testingData.isPresent()) {
            Testing _testing = testingData.get();
            _testing.setAuxiliaryCheckNum(testing.getAuxiliaryCheckNum());
            _testing.setAuxiliaryExaminationDate(testing.getAuxiliaryExaminationDate());
            _testing.setHypertensionRandom(testing.getHypertensionRandom());
            _testing.setHeartRate(testing.getHeartRate());
            _testing.setRandomBloodSugar(testing.getRandomBloodSugar());
            _testing.setFastingBloodGlucose(testing.getFastingBloodGlucose());
            _testing.setTwoHourBloodGluoseAftermeal(testing.getTwoHourBloodGluoseAftermeal());
            _testing.setHba1c(testing.getHba1c());
            _testing.setCho(testing.getCho());
            _testing.setTg(testing.getTg());
            _testing.setLdl(testing.getLdl());
            _testing.setHdl(testing.getHdl());
            _testing.setApolipoproteinA(testing.getApolipoproteinA());
            _testing.setApolipoproteinB(testing.getApolipoproteinB());
            _testing.setBun(testing.getBun());
            _testing.setCr(testing.getCr());
            _testing.setEgfr(testing.getEgfr());
            _testing.setCrp(testing.getCrp());
            _testing.setHcyHomocysteine(testing.getHcyHomocysteine());
            _testing.setProthrombinTime(testing.getProthrombinTime());
            _testing.setInternationalNormalizedRatio(testing.getInternationalNormalizedRatio());
            _testing.setActivatedPartialThrombinTime(testing.getActivatedPartialThrombinTime());
            _testing.setThrombinTime(testing.getThrombinTime());
            _testing.setFibrinogen(testing.getFibrinogen());
            _testing.setdDimer(testing.getdDimer());
            _testing.setAdp(testing.getAdp());
            _testing.setArachidonicAcid(testing.getArachidonicAcid());
            _testing.setHb(testing.getHb());
            _testing.setApoe(testing.getApoe());
            _testing.setSloco1b1(testing.getSloco1b1());
            _testing.setAβ(testing.getAβ());
            _testing.setTtau(testing.getTtau());
            _testing.setPtau(testing.getPtau());
            _testing.setSrage(testing.getSrage());
            _testing.setBace1(testing.getBace1());

            return new ResponseEntity<>(testingRepository.save(_testing), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/testings/{id}")
    public ResponseEntity<HttpStatus> deleteTesting(@PathVariable("id") long id) {
        try {
            testingRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/testings")
    public ResponseEntity<HttpStatus> deleteAllTestings() {
        try {
            testingRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
