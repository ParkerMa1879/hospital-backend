package com.example.demo.assessment.recognition.HAMA;

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
public class HAMAController {
    @Autowired
    HAMARepository hamaRepository;
    @GetMapping("/hamas")
    public ResponseEntity<List<HAMA>> getAllHAMAs(@RequestParam(required = false) String name) {
        try {
            List<HAMA> hamas = new ArrayList<>();
            hamas.addAll(hamaRepository.findAll());
            if (hamas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(hamas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/hamas/{id}")
    public ResponseEntity<HAMA> getHAMAById(@PathVariable("id") long id) {
        Optional<HAMA> hamaData = hamaRepository.findById(id);
        return hamaData.map(hama -> new ResponseEntity<>(hama,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/hamas")
    public ResponseEntity<HAMA> createHAMA(@RequestBody HAMA hama) {
        try {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(hama, 1, 14));
            HAMA _hama = hamaRepository
                    .save(new HAMA(hama.getBasicInfoId(), hama.getDate(), sum_score,
                            hama.getAnswer1(),hama.getAnswer2(),hama.getAnswer3(),hama.getAnswer4(),
                            hama.getAnswer5(),hama.getAnswer6(),hama.getAnswer7(),hama.getAnswer8(),
                            hama.getAnswer9(),hama.getAnswer10(),hama.getAnswer11(),hama.getAnswer12(),
                            hama.getAnswer13(),hama.getAnswer14()));
            return new ResponseEntity<>(_hama, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/hamas/{id}")
    public ResponseEntity<HAMA> updateHAMA(@PathVariable("id") long id, @RequestBody
            HAMA hama) {
        Optional<HAMA> hamaData = hamaRepository.findById(id);
        if (hamaData.isPresent()) {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(hama, 1, 14));
            HAMA _hama = hamaData.get();
            _hama.setBasicInfoId(hama.getBasicInfoId());
            _hama.setDate(hama.getDate());
            _hama.setSum_score(sum_score);
            _hama.setAnswer1(hama.getAnswer1());
            _hama.setAnswer2(hama.getAnswer2());
            _hama.setAnswer3(hama.getAnswer3());
            _hama.setAnswer4(hama.getAnswer4());
            _hama.setAnswer5(hama.getAnswer5());
            _hama.setAnswer6(hama.getAnswer6());
            _hama.setAnswer7(hama.getAnswer7());
            _hama.setAnswer8(hama.getAnswer8());
            _hama.setAnswer9(hama.getAnswer9());
            _hama.setAnswer10(hama.getAnswer10());
            _hama.setAnswer11(hama.getAnswer11());
            _hama.setAnswer12(hama.getAnswer12());
            _hama.setAnswer13(hama.getAnswer13());
            _hama.setAnswer14(hama.getAnswer14());

            return new ResponseEntity<>(hamaRepository.save(_hama), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/hamas/{id}")    public ResponseEntity<HttpStatus> deleteHAMA(@PathVariable("id") long id) {
        try {
            hamaRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/hamas")
    public ResponseEntity<HttpStatus> deleteAllHAMAs() {
        try {
            hamaRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

