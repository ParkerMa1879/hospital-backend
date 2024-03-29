package com.example.demo.assessment.recognition.Boston;

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
public class BostonController {
    @Autowired
    BostonRepository bostonRepository;
    @GetMapping("/bostons")
    public ResponseEntity<List<Boston>> getAllBostons(@RequestParam(required = false) boolean reverse) {
        try {
            List<Boston> bostons = new ArrayList<Boston>();
            if (reverse)
                bostons.addAll(bostonRepository.findAllByOrderByIdDesc());
            else
                bostons.addAll(bostonRepository.findAll());
            if (bostons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bostons, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/bostons/{id}")
    public ResponseEntity<Boston> getBostonById(@PathVariable("id") long id) {
        Optional<Boston> bostonData = bostonRepository.findById(id);
        return bostonData.map(boston -> new ResponseEntity<>(boston,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/bostons")
    public ResponseEntity<Boston> createBoston(@RequestBody Boston boston) {
        try {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(boston, 1, 5));
            Boston _boston = bostonRepository
                    .save(new Boston(boston.getBasicInfoId(),boston.getDate(), sum_score,boston.getAnswer1(),
                            boston.getAnswer2(),boston.getAnswer3(),boston.getAnswer4(),boston.getAnswer5()));
            return new ResponseEntity<>(_boston, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/bostons/{id}")
    public ResponseEntity<Boston> updateBoston(@PathVariable("id") long id, @RequestBody
            Boston boston) {
        Optional<Boston> bostonData = bostonRepository.findById(id);
        if (bostonData.isPresent()) {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(boston, 1, 5));

            Boston _boston = bostonData.get();
            _boston.setBasicInfoId(boston.getBasicInfoId());
            _boston.setDate(boston.getDate());
            _boston.setSum_score(sum_score);
            _boston.setAnswer1(boston.getAnswer1());
            _boston.setAnswer2(boston.getAnswer2());
            _boston.setAnswer3(boston.getAnswer3());
            _boston.setAnswer4(boston.getAnswer4());
            _boston.setAnswer5(boston.getAnswer5());

            return new ResponseEntity<>(bostonRepository.save(_boston), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/bostons/{id}")    public ResponseEntity<HttpStatus> deleteBoston(@PathVariable("id") long id) {
        try {
            bostonRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/bostons")
    public ResponseEntity<HttpStatus> deleteAllBostons() {
        try {
            bostonRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/bostons/basicInfoId")
    public ResponseEntity<List<Boston>> findByBasicInfoId(@RequestParam() long basicInfoId) {
        try {
            List<Boston> bostons = bostonRepository.findByBasicInfoIdOrderByIdDesc(basicInfoId);
            if (bostons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bostons, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

