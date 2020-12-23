package com.example.demo.assessment.recognition.Gait;

import com.example.demo.utils.CalculationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GaitController {
    @Autowired
    GaitRepository gaitRepository;
    @GetMapping("/gaits")
    public ResponseEntity<List<Gait>> getAllGaits(@RequestParam(required = false) String name) {
        try {
            List<Gait> gaits = new ArrayList<>();
            gaits.addAll(gaitRepository.findAll());
            if (gaits.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(gaits, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/gaits/{id}")
    public ResponseEntity<Gait> getGaitById(@PathVariable("id") long id) {
        Optional<Gait> gaitData = gaitRepository.findById(id);
        return gaitData.map(gait -> new ResponseEntity<>(gait,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/gaits")
    public ResponseEntity<Gait> createGait(@RequestBody Gait gait) {
        try {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(gait, 1, 5));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(gait, 6, 15));
            String sum_score_3 = Integer.toString(CalculationUtils.getSumScore(gait, 16, 25));

            Gait _gait = gaitRepository
                    .save(new Gait(gait.getBasicInfoId(),sum_score_1,gait.getAnswer1(),
                            gait.getAnswer2(),gait.getAnswer3(),gait.getAnswer4(),gait.getAnswer5(),
                            sum_score_2,gait.getAnswer6(),gait.getAnswer7(),gait.getAnswer8(),
                            gait.getAnswer9(),gait.getAnswer10(),gait.getAnswer11(),gait.getAnswer12(),
                            gait.getAnswer13(),gait.getAnswer14(),gait.getAnswer15(),sum_score_3,
                            gait.getAnswer16(),gait.getAnswer17(),gait.getAnswer18(),gait.getAnswer19(),
                            gait.getAnswer20(),gait.getAnswer21(),gait.getAnswer22(),gait.getAnswer23(),
                            gait.getAnswer24(),gait.getAnswer25(),gait.getQuestion1(),gait.getQuestion2()));
            return new ResponseEntity<>(_gait, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/gaits/{id}")
    public ResponseEntity<Gait> updateGait(@PathVariable("id") long id, @RequestBody
            Gait gait) {
        Optional<Gait> gaitData = gaitRepository.findById(id);
        if (gaitData.isPresent()) {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(gait, 1, 5));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(gait, 6, 15));
            String sum_score_3 = Integer.toString(CalculationUtils.getSumScore(gait, 16, 25));

            Gait _gait = gaitData.get();

            _gait.setId(gait.getId());
            _gait.setBasicInfoId(gait.getBasicInfoId());
            _gait.setSum_score_1(sum_score_1);
            _gait.setAnswer1(gait.getAnswer1());
            _gait.setAnswer2(gait.getAnswer2());
            _gait.setAnswer3(gait.getAnswer3());
            _gait.setAnswer4(gait.getAnswer4());
            _gait.setAnswer5(gait.getAnswer5());
            _gait.setSum_score_2(sum_score_2);
            _gait.setAnswer6(gait.getAnswer6());
            _gait.setAnswer7(gait.getAnswer7());
            _gait.setAnswer8(gait.getAnswer8());
            _gait.setAnswer9(gait.getAnswer9());
            _gait.setAnswer10(gait.getAnswer10());
            _gait.setAnswer11(gait.getAnswer11());
            _gait.setAnswer12(gait.getAnswer12());
            _gait.setAnswer13(gait.getAnswer13());
            _gait.setAnswer14(gait.getAnswer14());
            _gait.setAnswer15(gait.getAnswer15());
            _gait.setSum_score_3(sum_score_3);
            _gait.setAnswer16(gait.getAnswer16());
            _gait.setAnswer17(gait.getAnswer17());
            _gait.setAnswer18(gait.getAnswer18());
            _gait.setAnswer19(gait.getAnswer19());
            _gait.setAnswer20(gait.getAnswer20());
            _gait.setAnswer21(gait.getAnswer21());
            _gait.setAnswer22(gait.getAnswer22());
            _gait.setAnswer23(gait.getAnswer23());
            _gait.setAnswer24(gait.getAnswer24());
            _gait.setAnswer25(gait.getAnswer25());
            _gait.setQuestion1(gait.getQuestion1());
            _gait.setQuestion2(gait.getQuestion2());

            return new ResponseEntity<>(gaitRepository.save(_gait), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/gaits/{id}")    public ResponseEntity<HttpStatus> deleteGait(@PathVariable("id") long id) {
        try {
            gaitRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/gaits")
    public ResponseEntity<HttpStatus> deleteAllGaits() {
        try {
            gaitRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
