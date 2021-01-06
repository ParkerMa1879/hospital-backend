package com.example.demo.assessment.recognition.MMSE;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.utils.CalculationUtils;
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
public class MSEEController {
    @Autowired
    MMSERepository mmseRepository;
    @GetMapping("/mmses")
    public ResponseEntity<List<MMSE>> getAllMMSEs(@RequestParam(required = false) String name) {
        try {
            List<MMSE> mmses = new ArrayList<>();
            mmses.addAll(mmseRepository.findAll());
            if (mmses.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(mmses, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/mmses/{id}")
    public ResponseEntity<MMSE> getMMSEById(@PathVariable("id") long id) {
        Optional<MMSE> mmseData = mmseRepository.findById(id);
        return mmseData.map(mmse -> new ResponseEntity<>(mmse,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/mmses")
    public ResponseEntity<MMSE> createMMSE(@RequestBody MMSE mmse) {
        try {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(mmse, 1, 2));
            String sum_score = Integer.toString(CalculationUtils.getSumScore(mmse, 1, 11));

            MMSE _mmse = mmseRepository
                    .save(new MMSE(mmse.getBasicInfoId(),sum_score, sum_score_1,mmse.getAnswer1(),mmse.getAnswer2(),mmse.getAnswer3(),
                            mmse.getAnswer4(),mmse.getAnswer5(),mmse.getAnswer6(),mmse.getAnswer7(),mmse.getAnswer8(),
                            mmse.getAnswer9(),mmse.getAnswer10(),mmse.getAnswer11()));
            return new ResponseEntity<>(_mmse, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/mmses/{id}")
    public ResponseEntity<MMSE> updateMMSE(@PathVariable("id") long id, @RequestBody
            MMSE mmse) {
        Optional<MMSE> mmseData = mmseRepository.findById(id);
        if (mmseData.isPresent()) {
            MMSE _mmse = mmseData.get();
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(mmse, 1, 2));
            String sum_score = Integer.toString(CalculationUtils.getSumScore(mmse, 1, 11));

            _mmse.setId(mmse.getId());
            _mmse.setBasicInfoId(mmse.getBasicInfoId());
            _mmse.setAnswer1(mmse.getAnswer1());
            _mmse.setAnswer2(mmse.getAnswer2());
            _mmse.setAnswer3(mmse.getAnswer3());
            _mmse.setAnswer4(mmse.getAnswer4());
            _mmse.setAnswer5(mmse.getAnswer5());
            _mmse.setAnswer6(mmse.getAnswer6());
            _mmse.setAnswer7(mmse.getAnswer7());
            _mmse.setAnswer8(mmse.getAnswer8());
            _mmse.setAnswer9(mmse.getAnswer9());
            _mmse.setAnswer10(mmse.getAnswer10());
            _mmse.setAnswer11(mmse.getAnswer11());
            _mmse.setSum_socre(sum_score);
            _mmse.setSum_socre_1(sum_score_1);
            return new ResponseEntity<>(mmseRepository.save(_mmse), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/mmses/{id}")    public ResponseEntity<HttpStatus> deleteMMSE(@PathVariable("id") long id) {
        try {
            mmseRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/mmses")
    public ResponseEntity<HttpStatus> deleteAllMMSEs() {
        try {
            mmseRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}