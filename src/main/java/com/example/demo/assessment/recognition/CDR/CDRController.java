package com.example.demo.assessment.recognition.CDR;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.utils.calculation.CalculationUtils;
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
public class CDRController {
    @Autowired
    CDRRepository cdrRepository;
    @GetMapping("/cdrs")
    public ResponseEntity<List<CDR>> getAllCDRs(boolean reverse) {
        try {
            List<CDR> cdrs = new ArrayList<>();
            if (reverse)
                cdrs.addAll(cdrRepository.findAllByOrderByIdDesc());
            else
                cdrs.addAll(cdrRepository.findAll());
            if (cdrs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(cdrs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/cdrs/{id}")
    public ResponseEntity<CDR> getCDRById(@PathVariable("id") long id) {
        Optional<CDR> cdrData = cdrRepository.findById(id);
        return cdrData.map(cdr -> new ResponseEntity<>(cdr,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/cdrs")
    public ResponseEntity<CDR> createCDR(@RequestBody CDR cdr) {
        try {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(cdr, 1, 6));
            CDR _cdr = cdrRepository
                    .save(new CDR(cdr.getBasicInfoId(),cdr.getDate(),sum_score,cdr.getAnswer1(),
                            cdr.getAnswer2(),cdr.getAnswer3(),cdr.getAnswer4(),cdr.getAnswer5(),
                            cdr.getAnswer6()));
            return new ResponseEntity<>(_cdr, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/cdrs/{id}")
    public ResponseEntity<CDR> updateCDR(@PathVariable("id") long id, @RequestBody
            CDR cdr) {
        Optional<CDR> cdrData = cdrRepository.findById(id);
        if (cdrData.isPresent()) {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(cdr, 1, 6));

            CDR _cdr = cdrData.get();
            _cdr.setBasicInfoId(cdr.getBasicInfoId());
            _cdr.setDate(cdr.getDate());
            _cdr.setSum_score(sum_score);
            _cdr.setAnswer1(cdr.getAnswer1());
            _cdr.setAnswer2(cdr.getAnswer2());
            _cdr.setAnswer3(cdr.getAnswer3());
            _cdr.setAnswer4(cdr.getAnswer4());
            _cdr.setAnswer5(cdr.getAnswer5());
            _cdr.setAnswer6(cdr.getAnswer6());
            return new ResponseEntity<>(cdrRepository.save(_cdr), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/cdrs/{id}")    public ResponseEntity<HttpStatus> deleteCDR(@PathVariable("id") long id) {
        try {
            cdrRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/cdrs")
    public ResponseEntity<HttpStatus> deleteAllCDRs() {
        try {
            cdrRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cdrs/basicInfoId")
    public ResponseEntity<List<CDR>> findByBasicInfoId(@RequestParam() long basicInfoId) {
        try {
            List<CDR> cdrs = cdrRepository.findByBasicInfoIdOrderByIdDesc(basicInfoId);
            if (cdrs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(cdrs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

