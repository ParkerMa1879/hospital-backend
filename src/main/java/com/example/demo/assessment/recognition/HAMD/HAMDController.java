package com.example.demo.assessment.recognition.HAMD;

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
public class HAMDController {
    @Autowired
    HAMDRepository hamdRepository;
    @GetMapping("/hamds")
    public ResponseEntity<List<HAMD>> getAllHAMDs(@RequestParam(required = false) String name) {
        try {
            List<HAMD> hamds = new ArrayList<>();
            hamds.addAll(hamdRepository.findAll());
            if (hamds.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(hamds, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/hamds/{id}")
    public ResponseEntity<HAMD> getHAMDById(@PathVariable("id") long id) {
        Optional<HAMD> hamdData = hamdRepository.findById(id);
        return hamdData.map(hamd -> new ResponseEntity<>(hamd,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/hamds")
    public ResponseEntity<HAMD> createHAMD(@RequestBody HAMD hamd) {
        try {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(hamd, 1, 17));
            HAMD _hamd = hamdRepository
                    .save(new HAMD(hamd.getBasicInfoId(),hamd.getDate(), sum_score,hamd.getAnswer1(),
                            hamd.getAnswer2(),hamd.getAnswer3(),hamd.getAnswer4(),hamd.getAnswer5(),hamd.getAnswer6(),
                            hamd.getAnswer7(),hamd.getAnswer8(),hamd.getAnswer9(),hamd.getAnswer10(),hamd.getAnswer11(),
                            hamd.getAnswer12(),hamd.getAnswer13(),hamd.getAnswer14(),hamd.getAnswer15(),hamd.getAnswer16(),
                            hamd.getAnswer17()));
            return new ResponseEntity<>(_hamd, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/hamds/{id}")
    public ResponseEntity<HAMD> updateHAMD(@PathVariable("id") long id, @RequestBody
            HAMD hamd) {
        Optional<HAMD> hamdData = hamdRepository.findById(id);
        if (hamdData.isPresent()) {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(hamd, 1, 17));
            HAMD _hamd = hamdData.get();
            _hamd.setBasicInfoId(hamd.getBasicInfoId());
            _hamd.setDate(hamd.getDate());
            _hamd.setSum_score(sum_score);
            _hamd.setAnswer1(hamd.getAnswer1());
            _hamd.setAnswer2(hamd.getAnswer2());
            _hamd.setAnswer3(hamd.getAnswer3());
            _hamd.setAnswer4(hamd.getAnswer4());
            _hamd.setAnswer5(hamd.getAnswer5());
            _hamd.setAnswer6(hamd.getAnswer6());
            _hamd.setAnswer7(hamd.getAnswer7());
            _hamd.setAnswer8(hamd.getAnswer8());
            _hamd.setAnswer9(hamd.getAnswer9());
            _hamd.setAnswer10(hamd.getAnswer10());
            _hamd.setAnswer11(hamd.getAnswer11());
            _hamd.setAnswer12(hamd.getAnswer12());
            _hamd.setAnswer13(hamd.getAnswer13());
            _hamd.setAnswer14(hamd.getAnswer14());
            _hamd.setAnswer15(hamd.getAnswer15());
            _hamd.setAnswer16(hamd.getAnswer16());
            _hamd.setAnswer17(hamd.getAnswer17());
            return new ResponseEntity<>(hamdRepository.save(_hamd), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/hamds/{id}")    public ResponseEntity<HttpStatus> deleteHAMD(@PathVariable("id") long id) {
        try {
            hamdRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/hamds")
    public ResponseEntity<HttpStatus> deleteAllHAMDs() {
        try {
            hamdRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}