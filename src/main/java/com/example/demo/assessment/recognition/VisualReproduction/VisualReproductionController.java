package com.example.demo.assessment.recognition.VisualReproduction;

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

public class VisualReproductionController {
    @Autowired
    VisualReproductionRepository visualReproductionRepository;
    @GetMapping("/visualReproductions")
    public ResponseEntity<List<VisualReproduction>> getAllVisualReproductions(@RequestParam(required = false) String name) {
        try {
            List<VisualReproduction> visualReproductions = new ArrayList<>();
            visualReproductions.addAll(visualReproductionRepository.findAll());
            if (visualReproductions.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(visualReproductions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/visualReproductions/{id}")
    public ResponseEntity<VisualReproduction> getVisualReproductionById(@PathVariable("id") long id) {
        Optional<VisualReproduction> visualReproductionData = visualReproductionRepository.findById(id);
        return visualReproductionData.map(visualReproduction -> new ResponseEntity<>(visualReproduction,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/visualReproductions")
    public ResponseEntity<VisualReproduction> createVisualReproduction(@RequestBody VisualReproduction visualReproduction) {
        try {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 1, 4));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 5, 8));
            String sum_score_3 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 9, 12));
            String sum_score_4 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 13, 16));

            VisualReproduction _visualReproduction = visualReproductionRepository
                    .save(new VisualReproduction(visualReproduction.getBasicInfoId(), visualReproduction.getDate(),
                            sum_score_1,visualReproduction.getAnswer1(),
                            visualReproduction.getAnswer2(),visualReproduction.getAnswer3(),visualReproduction.getAnswer4(),
                            sum_score_2,visualReproduction.getAnswer5(),
                            visualReproduction.getAnswer6(),visualReproduction.getAnswer7(),visualReproduction.getAnswer8(),
                            sum_score_3,visualReproduction.getAnswer9(),
                            visualReproduction.getAnswer10(),visualReproduction.getAnswer11(),
                            visualReproduction.getAnswer12(),sum_score_4,
                            visualReproduction.getAnswer13(),visualReproduction.getAnswer14(),
                            visualReproduction.getAnswer15(),visualReproduction.getAnswer16()));
            return new ResponseEntity<>(_visualReproduction, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/visualReproductions/{id}")
    public ResponseEntity<VisualReproduction> updateVisualReproduction(@PathVariable("id") long id, @RequestBody
            VisualReproduction visualReproduction) {
        Optional<VisualReproduction> visualReproductionData = visualReproductionRepository.findById(id);
        if (visualReproductionData.isPresent()) {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 1, 4));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 5, 8));
            String sum_score_3 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 9, 12));
            String sum_score_4 = Integer.toString(CalculationUtils.getSumScore(visualReproduction, 13, 16));

            VisualReproduction _visualReproduction = visualReproductionData.get();

            _visualReproduction.setBasicInfoId(visualReproduction.getBasicInfoId());
            _visualReproduction.setDate(visualReproduction.getDate());
            _visualReproduction.setSum_score_1(sum_score_1);
            _visualReproduction.setAnswer1(visualReproduction.getAnswer1());
            _visualReproduction.setAnswer2(visualReproduction.getAnswer2());
            _visualReproduction.setAnswer3(visualReproduction.getAnswer3());
            _visualReproduction.setAnswer4(visualReproduction.getAnswer4());
            _visualReproduction.setSum_score_2(sum_score_2);
            _visualReproduction.setAnswer5(visualReproduction.getAnswer5());
            _visualReproduction.setAnswer6(visualReproduction.getAnswer6());
            _visualReproduction.setAnswer7(visualReproduction.getAnswer7());
            _visualReproduction.setAnswer8(visualReproduction.getAnswer8());
            _visualReproduction.setSum_score_3(sum_score_3);
            _visualReproduction.setAnswer9(visualReproduction.getAnswer9());
            _visualReproduction.setAnswer10(visualReproduction.getAnswer10());
            _visualReproduction.setAnswer11(visualReproduction.getAnswer11());
            _visualReproduction.setAnswer12(visualReproduction.getAnswer12());
            _visualReproduction.setSum_score_4(sum_score_4);
            _visualReproduction.setAnswer13(visualReproduction.getAnswer13());
            _visualReproduction.setAnswer14(visualReproduction.getAnswer14());
            _visualReproduction.setAnswer15(visualReproduction.getAnswer15());
            _visualReproduction.setAnswer16(visualReproduction.getAnswer16());

            return new ResponseEntity<>(visualReproductionRepository.save(_visualReproduction), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/visualReproductions/{id}")    public ResponseEntity<HttpStatus> deleteVisualReproduction(@PathVariable("id") long id) {
        try {
            visualReproductionRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/visualReproductions")
    public ResponseEntity<HttpStatus> deleteAllVisualReproductions() {
        try {
            visualReproductionRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

