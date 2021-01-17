package com.example.demo.assessment.recognition.NIHSS;

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
public class NIHSSController {
    @Autowired
    NIHSSRepository nihssRepository;
    @GetMapping("/nihsss")
    public ResponseEntity<List<NIHSS>> getAllNIHSSs(@RequestParam(required = false) String name) {
        try {
            List<NIHSS> nihsss = new ArrayList<>();
            nihsss.addAll(nihssRepository.findAll());
            if (nihsss.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(nihsss, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/nihsss/{id}")
    public ResponseEntity<NIHSS> getNIHSSById(@PathVariable("id") long id) {
        Optional<NIHSS> nihssData = nihssRepository.findById(id);
        return nihssData.map(nihss -> new ResponseEntity<>(nihss,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/nihsss")
    public ResponseEntity<NIHSS> createNIHSS(@RequestBody NIHSS nihss) {
        try {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(nihss, 1, 15));

            NIHSS _nihss = nihssRepository
                    .save(new NIHSS(nihss.getBasicInfoId(), nihss.getDate(), sum_score,
                            nihss.getAnswer1(),nihss.getAnswer2(),nihss.getAnswer3(),nihss.getAnswer4(),
                            nihss.getAnswer5(),nihss.getAnswer6(),nihss.getAnswer7(),nihss.getQuestion1(),
                            nihss.getAnswer8(),nihss.getQuestion2(),nihss.getAnswer9(),nihss.getQuestion3(),
                            nihss.getAnswer10(),nihss.getQuestion4(),nihss.getAnswer11(),nihss.getAnswer12(),
                            nihss.getAnswer13(),nihss.getAnswer14(),nihss.getQuestion5(),nihss.getAnswer15()));
            return new ResponseEntity<>(_nihss, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/nihsss/{id}")
    public ResponseEntity<NIHSS> updateNIHSS(@PathVariable("id") long id, @RequestBody
            NIHSS nihss) {
        Optional<NIHSS> nihssData = nihssRepository.findById(id);
        if (nihssData.isPresent()) {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(nihss, 1, 15));

            NIHSS _nihss = nihssData.get();

            _nihss.setBasicInfoId(nihss.getBasicInfoId());
            _nihss.setDate(nihss.getDate());
            _nihss.setSum_score(sum_score);
            _nihss.setAnswer1(nihss.getAnswer1());
            _nihss.setAnswer2(nihss.getAnswer2());
            _nihss.setAnswer3(nihss.getAnswer3());
            _nihss.setAnswer4(nihss.getAnswer4());
            _nihss.setAnswer5(nihss.getAnswer5());
            _nihss.setAnswer6(nihss.getAnswer6());
            _nihss.setAnswer7(nihss.getAnswer7());
            _nihss.setQuestion1(nihss.getQuestion1());
            _nihss.setAnswer8(nihss.getAnswer8());
            _nihss.setQuestion2(nihss.getQuestion2());
            _nihss.setAnswer9(nihss.getAnswer9());
            _nihss.setQuestion3(nihss.getQuestion3());
            _nihss.setAnswer10(nihss.getAnswer10());
            _nihss.setQuestion4(nihss.getQuestion4());
            _nihss.setAnswer11(nihss.getAnswer11());
            _nihss.setAnswer12(nihss.getAnswer12());
            _nihss.setAnswer13(nihss.getAnswer13());
            _nihss.setAnswer14(nihss.getAnswer14());
            _nihss.setQuestion5(nihss.getQuestion5());
            _nihss.setAnswer15(nihss.getAnswer15());

            return new ResponseEntity<>(nihssRepository.save(_nihss), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/nihsss/{id}")    public ResponseEntity<HttpStatus> deleteNIHSS(@PathVariable("id") long id) {
        try {
            nihssRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/nihsss")
    public ResponseEntity<HttpStatus> deleteAllNIHSSs() {
        try {
            nihssRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/nihsss/basicInfoId")
    public ResponseEntity<List<NIHSS>> findByBasicInfoId(@RequestParam() long basicInfoId) {
        try {
            List<NIHSS> nihsss = nihssRepository.findByBasicInfoId(basicInfoId);
            if (nihsss.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(nihsss, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
