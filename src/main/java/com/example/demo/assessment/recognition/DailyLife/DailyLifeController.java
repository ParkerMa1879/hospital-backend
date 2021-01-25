package com.example.demo.assessment.recognition.DailyLife;

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
public class DailyLifeController {
    @Autowired
    DailyLifeRepository dailyLifeRepository;
    @GetMapping("/dailyLifes")
    public ResponseEntity<List<DailyLife>> getAllDailyLifes(@RequestParam(required = false) String name) {
        try {
            List<DailyLife> dailyLifes = new ArrayList<>();
            dailyLifes.addAll(dailyLifeRepository.findAll());
            if (dailyLifes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(dailyLifes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/dailyLifes/{id}")
    public ResponseEntity<DailyLife> getDailyLifeById(@PathVariable("id") long id) {
        Optional<DailyLife> dailyLifeData = dailyLifeRepository.findById(id);
        return dailyLifeData.map(dailyLife -> new ResponseEntity<>(dailyLife,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/dailyLifes")
    public ResponseEntity<DailyLife> createDailyLife(@RequestBody DailyLife dailyLife) {
        try {
            DailyLife _dailyLife = dailyLifeRepository
                    .save(new DailyLife(dailyLife.getBasicInfoId(),dailyLife.getDate(),dailyLife.getAnswer1(),
                            dailyLife.getAnswer2(),dailyLife.getAnswer3(),dailyLife.getAnswer4(),
                            dailyLife.getAnswer5(),dailyLife.getAnswer6(),dailyLife.getAnswer7(),
                            dailyLife.getAnswer8(),dailyLife.getAnswer9(),dailyLife.getAnswer10(),
                            dailyLife.getSum_score_1(),dailyLife.getAnswer11(),dailyLife.getAnswer12(),
                            dailyLife.getAnswer13(),dailyLife.getAnswer14(),dailyLife.getAnswer15(),
                            dailyLife.getAnswer16(),dailyLife.getAnswer17(),dailyLife.getAnswer18(),
                            dailyLife.getSum_score_2()));
            return new ResponseEntity<>(_dailyLife, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/dailyLifes/{id}")
    public ResponseEntity<DailyLife> updateDailyLife(@PathVariable("id") long id, @RequestBody
            DailyLife dailyLife) {
        Optional<DailyLife> dailyLifeData = dailyLifeRepository.findById(id);
        if (dailyLifeData.isPresent()) {
            DailyLife _dailyLife = dailyLifeData.get();

            _dailyLife.setBasicInfoId(dailyLife.getBasicInfoId());
            _dailyLife.setDate(dailyLife.getDate());
            _dailyLife.setAnswer1(dailyLife.getAnswer1());
            _dailyLife.setAnswer2(dailyLife.getAnswer2());
            _dailyLife.setAnswer3(dailyLife.getAnswer3());
            _dailyLife.setAnswer4(dailyLife.getAnswer4());
            _dailyLife.setAnswer5(dailyLife.getAnswer5());
            _dailyLife.setAnswer6(dailyLife.getAnswer6());
            _dailyLife.setAnswer7(dailyLife.getAnswer7());
            _dailyLife.setAnswer8(dailyLife.getAnswer8());
            _dailyLife.setAnswer9(dailyLife.getAnswer9());
            _dailyLife.setAnswer10(dailyLife.getAnswer10());
            _dailyLife.setSum_score_1(dailyLife.getSum_score_1());
            _dailyLife.setAnswer11(dailyLife.getAnswer11());
            _dailyLife.setAnswer12(dailyLife.getAnswer12());
            _dailyLife.setAnswer13(dailyLife.getAnswer13());
            _dailyLife.setAnswer14(dailyLife.getAnswer14());
            _dailyLife.setAnswer15(dailyLife.getAnswer15());
            _dailyLife.setAnswer16(dailyLife.getAnswer16());
            _dailyLife.setAnswer17(dailyLife.getAnswer17());
            _dailyLife.setAnswer18(dailyLife.getAnswer18());
            _dailyLife.setSum_score_2(dailyLife.getSum_score_2());

            return new ResponseEntity<>(dailyLifeRepository.save(_dailyLife), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/dailyLifes/{id}")    public ResponseEntity<HttpStatus> deleteDailyLife(@PathVariable("id") long id) {
        try {
            dailyLifeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/dailyLifes")
    public ResponseEntity<HttpStatus> deleteAllDailyLifes() {
        try {
            dailyLifeRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
