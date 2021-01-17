package com.example.demo.assessment.recognition.DailyLife;

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
public class DailyLifeController {
    @Autowired
    DailyLifeRepository dailylifeRepository;
    @GetMapping("/dailylifes")
    public ResponseEntity<List<DailyLife>> getAllDailyLifes(@RequestParam(required = false) long basicInfoId) {
        try {
            List<DailyLife> dailylifes = new ArrayList<>();
            dailylifes.addAll(dailylifeRepository.findAll());
            if (dailylifes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(dailylifes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/dailylifes/{id}")
    public ResponseEntity<DailyLife> getDailyLifeById(@PathVariable("id") long id) {
        Optional<DailyLife> dailylifeData = dailylifeRepository.findById(id);
        return dailylifeData.map(dailylife -> new ResponseEntity<>(dailylife,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/dailylifes")
    public ResponseEntity<DailyLife> createDailyLife(@RequestBody DailyLife dailylife) {
        try {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(dailylife, 1, 10));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(dailylife, 11, 18));
            DailyLife _dailylife = dailylifeRepository
                    .save(new DailyLife(dailylife.getBasicInfoId(),dailylife.getDate(),dailylife.getAnswer1(),
                            dailylife.getAnswer2(),dailylife.getAnswer3(),dailylife.getAnswer4(),dailylife.getAnswer5(),
                            dailylife.getAnswer6(),dailylife.getAnswer7(),dailylife.getAnswer8(),dailylife.getAnswer9(),
                            dailylife.getAnswer10(),sum_score_1,dailylife.getAnswer11(),
                            dailylife.getAnswer12(),dailylife.getAnswer13(),dailylife.getAnswer14(),
                            dailylife.getAnswer15(),dailylife.getAnswer16(),dailylife.getAnswer17(),
                            dailylife.getAnswer18(),sum_score_2));
            return new ResponseEntity<>(_dailylife, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/dailylifes/{id}")
    public ResponseEntity<DailyLife> updateDailyLife(@PathVariable("id") long id, @RequestBody
            DailyLife dailylife) {
        Optional<DailyLife> dailylifeData = dailylifeRepository.findById(id);
        if (dailylifeData.isPresent()) {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(dailylife, 1, 10));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(dailylife, 11, 18));
            DailyLife _dailylife = dailylifeData.get();

            _dailylife.setBasicInfoId(dailylife.getBasicInfoId());
            _dailylife.setDate(_dailylife.getDate());
            _dailylife.setAnswer1(dailylife.getAnswer1());
            _dailylife.setAnswer2(dailylife.getAnswer2());
            _dailylife.setAnswer3(dailylife.getAnswer3());
            _dailylife.setAnswer4(dailylife.getAnswer4());
            _dailylife.setAnswer5(dailylife.getAnswer5());
            _dailylife.setAnswer6(dailylife.getAnswer6());
            _dailylife.setAnswer7(dailylife.getAnswer7());
            _dailylife.setAnswer8(dailylife.getAnswer8());
            _dailylife.setAnswer9(dailylife.getAnswer9());
            _dailylife.setAnswer10(dailylife.getAnswer10());
            _dailylife.setSum_score_1(sum_score_1);
            _dailylife.setAnswer11(dailylife.getAnswer11());
            _dailylife.setAnswer12(dailylife.getAnswer12());
            _dailylife.setAnswer13(dailylife.getAnswer13());
            _dailylife.setAnswer14(dailylife.getAnswer14());
            _dailylife.setAnswer15(dailylife.getAnswer15());
            _dailylife.setAnswer16(dailylife.getAnswer16());
            _dailylife.setAnswer17(dailylife.getAnswer17());
            _dailylife.setAnswer18(dailylife.getAnswer18());
            _dailylife.setSum_score_2(sum_score_2);

            return new ResponseEntity<>(dailylifeRepository.save(_dailylife), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/dailylifes/{id}")    public ResponseEntity<HttpStatus> deleteDailyLife(@PathVariable("id") long id) {
        try {
            dailylifeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/dailylifes")
    public ResponseEntity<HttpStatus> deleteAllDailyLifes() {
        try {
            dailylifeRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dailyLifes/basicInfoId")
    public ResponseEntity<List<DailyLife>> findByBasicInfoId(@RequestParam() long basicInfoId) {
        try {
            List<DailyLife> dailyLifes = dailylifeRepository.findByBasicInfoId(basicInfoId);
            if (dailyLifes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(dailyLifes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}