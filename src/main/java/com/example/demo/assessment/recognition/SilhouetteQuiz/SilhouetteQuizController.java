package com.example.demo.assessment.recognition.SilhouetteQuiz;

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
public class SilhouetteQuizController {
    @Autowired
    SilhouetteQuizRepository silhouetteQuizRepository;
    @GetMapping("/silhouetteQuizs")
    public ResponseEntity<List<SilhouetteQuiz>> getAllSilhouetteQuizs(@RequestParam(required = false) boolean reverse) {
        try {
            List<SilhouetteQuiz> silhouetteQuizs = new ArrayList<>();
            if (reverse)
                silhouetteQuizs.addAll(silhouetteQuizRepository.findAllByOrderByIdDesc());
            else
                silhouetteQuizs.addAll(silhouetteQuizRepository.findAll());
            if (silhouetteQuizs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(silhouetteQuizs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/silhouetteQuizs/{id}")
    public ResponseEntity<SilhouetteQuiz> getSilhouetteQuizById(@PathVariable("id") long id) {
        Optional<SilhouetteQuiz> silhouetteQuizData = silhouetteQuizRepository.findById(id);
        return silhouetteQuizData.map(silhouetteQuiz -> new ResponseEntity<>(silhouetteQuiz,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/silhouetteQuizs")
    public ResponseEntity<SilhouetteQuiz> createSilhouetteQuiz(@RequestBody SilhouetteQuiz silhouetteQuiz) {
        try {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(silhouetteQuiz, 1, 15));

            SilhouetteQuiz _silhouetteQuiz = silhouetteQuizRepository
                    .save(new SilhouetteQuiz(silhouetteQuiz.getBasicInfoId(), silhouetteQuiz.getDate(),
                            sum_score,silhouetteQuiz.getAnswer1(),silhouetteQuiz.getAnswer2(),
                            silhouetteQuiz.getAnswer3(),silhouetteQuiz.getAnswer4(),silhouetteQuiz.getAnswer5(),
                            silhouetteQuiz.getAnswer6(),silhouetteQuiz.getAnswer7(),silhouetteQuiz.getAnswer8(),
                            silhouetteQuiz.getAnswer9(),silhouetteQuiz.getAnswer10(),silhouetteQuiz.getAnswer11(),
                            silhouetteQuiz.getAnswer12(),silhouetteQuiz.getAnswer13(),silhouetteQuiz.getAnswer14(),
                            silhouetteQuiz.getAnswer15()));
            return new ResponseEntity<>(_silhouetteQuiz, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/silhouetteQuizs/{id}")
    public ResponseEntity<SilhouetteQuiz> updateSilhouetteQuiz(@PathVariable("id") long id, @RequestBody
            SilhouetteQuiz silhouetteQuiz) {
        Optional<SilhouetteQuiz> silhouetteQuizData = silhouetteQuizRepository.findById(id);
        if (silhouetteQuizData.isPresent()) {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(silhouetteQuiz, 1, 15));
            SilhouetteQuiz _silhouetteQuiz = silhouetteQuizData.get();

            _silhouetteQuiz.setBasicInfoId(silhouetteQuiz.getBasicInfoId());
            _silhouetteQuiz.setDate(silhouetteQuiz.getDate());
            _silhouetteQuiz.setSum_score(sum_score);
            _silhouetteQuiz.setAnswer1(silhouetteQuiz.getAnswer1());
            _silhouetteQuiz.setAnswer2(silhouetteQuiz.getAnswer2());
            _silhouetteQuiz.setAnswer3(silhouetteQuiz.getAnswer3());
            _silhouetteQuiz.setAnswer4(silhouetteQuiz.getAnswer4());
            _silhouetteQuiz.setAnswer5(silhouetteQuiz.getAnswer5());
            _silhouetteQuiz.setAnswer6(silhouetteQuiz.getAnswer6());
            _silhouetteQuiz.setAnswer7(silhouetteQuiz.getAnswer7());
            _silhouetteQuiz.setAnswer8(silhouetteQuiz.getAnswer8());
            _silhouetteQuiz.setAnswer9(silhouetteQuiz.getAnswer9());
            _silhouetteQuiz.setAnswer10(silhouetteQuiz.getAnswer10());
            _silhouetteQuiz.setAnswer11(silhouetteQuiz.getAnswer11());
            _silhouetteQuiz.setAnswer12(silhouetteQuiz.getAnswer12());
            _silhouetteQuiz.setAnswer13(silhouetteQuiz.getAnswer13());
            _silhouetteQuiz.setAnswer14(silhouetteQuiz.getAnswer14());
            _silhouetteQuiz.setAnswer15(silhouetteQuiz.getAnswer15());

            return new ResponseEntity<>(silhouetteQuizRepository.save(_silhouetteQuiz), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/silhouetteQuizs/{id}")    public ResponseEntity<HttpStatus> deleteSilhouetteQuiz(@PathVariable("id") long id) {
        try {
            silhouetteQuizRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/silhouetteQuizs")
    public ResponseEntity<HttpStatus> deleteAllSilhouetteQuizs() {
        try {
            silhouetteQuizRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/silhouetteQuizs/basicInfoId")
    public ResponseEntity<List<SilhouetteQuiz>> findByBasicInfoId(@RequestParam() long basicInfoId) {
        try {
            List<SilhouetteQuiz> silhouetteQuizs = silhouetteQuizRepository.findByBasicInfoIdOrderByIdDesc(basicInfoId);
            if (silhouetteQuizs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(silhouetteQuizs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

