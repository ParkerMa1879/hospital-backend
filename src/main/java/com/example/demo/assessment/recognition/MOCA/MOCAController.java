package com.example.demo.assessment.recognition.MOCA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.utils.CalculationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class MOCAController {
    @Autowired
    MOCARepository mocaRepository;
    @GetMapping("/mocas")
    public ResponseEntity<List<MOCA>> getAllMOCAs(@RequestParam(required = false) String name) {
        try {
            List<MOCA> mocas = new ArrayList<>();
            mocas.addAll(mocaRepository.findAll());
            if (mocas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(mocas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/mocas/{id}")
    public ResponseEntity<MOCA> getMOCAById(@PathVariable("id") long id) {
        Optional<MOCA> mocaData = mocaRepository.findById(id);
        return mocaData.map(moca -> new ResponseEntity<>(moca,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/mocas")
    public ResponseEntity<MOCA> createMOCA(@RequestBody MOCA moca) {
        try {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(moca, 1, 5));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(moca, 7, 10));
            String sum_score_3 = Integer.toString(CalculationUtils.getSumScore(moca, 11, 12));
            String sum_score = Integer.toString(CalculationUtils.getSumScore(moca, 1, 15));


            MOCA _moca = mocaRepository
                    .save(new MOCA(moca.getBasicInfoId(),sum_score,sum_score_1,moca.getAnswer1(),
                            moca.getAnswer2(),moca.getAnswer3(),moca.getAnswer4(),moca.getAnswer5(),moca.getAnswer6(),
                            moca.getQuestion1(),moca.getQuestion2(),sum_score_2,moca.getAnswer7(),moca.getAnswer8(),
                            moca.getAnswer9(),moca.getAnswer10(),sum_score_3,moca.getAnswer11(),moca.getAnswer12(),
                            moca.getAnswer13(),moca.getAnswer14(),moca.getQuestion3(),moca.getQuestion4(),moca.getAnswer15()
                            ));
            return new ResponseEntity<>(_moca, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/mocas/{id}")
    public ResponseEntity<MOCA> updateMOCA(@PathVariable("id") long id, @RequestBody MOCA moca) {
        Optional<MOCA> mocaData = mocaRepository.findById(id);
        if (mocaData.isPresent()) {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(moca, 1, 5));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(moca, 7, 10));
            String sum_score_3 = Integer.toString(CalculationUtils.getSumScore(moca, 11, 12));
            String sum_score = Integer.toString(CalculationUtils.getSumScore(moca, 1, 15));

            MOCA _moca = mocaData.get();
            _moca.setId(moca.getId());
            _moca.setBasicInfoId(moca.getBasicInfoId());
            _moca.setSum_score(sum_score);
            _moca.setSum_score_1(sum_score_1);
            _moca.setAnswer1(moca.getAnswer1());
            _moca.setAnswer2(moca.getAnswer2());
            _moca.setAnswer3(moca.getAnswer3());
            _moca.setAnswer4(moca.getAnswer4());
            _moca.setAnswer5(moca.getAnswer5());
            _moca.setAnswer6(moca.getAnswer6());
            _moca.setQuestion1(moca.getQuestion1());
            _moca.setQuestion2(moca.getQuestion2());
            _moca.setSum_score_2(sum_score_2);
            _moca.setAnswer7(moca.getAnswer7());
            _moca.setAnswer8(moca.getAnswer8());
            _moca.setAnswer9(moca.getAnswer9());
            _moca.setAnswer10(moca.getAnswer10());
            _moca.setSum_score_3(sum_score_3);
            _moca.setAnswer11(moca.getAnswer11());
            _moca.setAnswer12(moca.getAnswer12());
            _moca.setAnswer13(moca.getAnswer13());
            _moca.setAnswer14(moca.getAnswer14());
            _moca.setQuestion3(moca.getQuestion3());
            _moca.setQuestion4(moca.getQuestion4());
            _moca.setAnswer15(moca.getAnswer15());
            return new ResponseEntity<>(mocaRepository.save(_moca), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/mocas/{id}")
    public ResponseEntity<HttpStatus> deleteMOCA(@PathVariable("id") long id) {
        try {
            mocaRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/mocas")
    public ResponseEntity<HttpStatus> deleteAllMOCAs() {
        try {
            mocaRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
