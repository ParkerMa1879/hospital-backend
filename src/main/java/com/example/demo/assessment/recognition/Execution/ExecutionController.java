package com.example.demo.assessment.recognition.Execution;

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
public class ExecutionController {
    @Autowired
    ExecutionRepository executionRepository;
    @GetMapping("/executions")
    public ResponseEntity<List<Execution>> getAllExecutions(@RequestParam(required = false) String name) {
        try {
            List<Execution> executions = new ArrayList<>();
            executions.addAll(executionRepository.findAll());
            if (executions.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(executions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/executions/{id}")
    public ResponseEntity<Execution> getExecutionById(@PathVariable("id") long id) {
        Optional<Execution> executionData = executionRepository.findById(id);
        return executionData.map(execution -> new ResponseEntity<>(execution,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/executions")
    public ResponseEntity<Execution> createExecution(@RequestBody Execution execution) {
        try {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(execution, 1, 4));

            Execution _execution = executionRepository
                    .save(new Execution(execution.getBasicInfoId(),execution.getDate(), sum_score,
                            execution.getAnswer1(),execution.getAnswer2(),execution.getAnswer3(),execution.getAnswer4(),
                            execution.getQuestion1(),execution.getQuestion2(),execution.getQuestion3(),
                            execution.getQuestion4(),execution.getQuestion5(),execution.getQuestion6(),
                            execution.getQuestion7(),execution.getQuestion8(),execution.getQuestion9(),
                            execution.getQuestion10(),execution.getQuestion11(),execution.getQuestion12(),
                            execution.getQuestion13(),execution.getQuestion14(),execution.getQuestion15(),
                            execution.getQuestion16(),execution.getQuestion17(),execution.getQuestion18(),
                            execution.getQuestion19(),execution.getQuestion20(),execution.getQuestion21(),
                            execution.getQuestion22(),execution.getQuestion23()));
            return new ResponseEntity<>(_execution, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/executions/{id}")
    public ResponseEntity<Execution> updateExecution(@PathVariable("id") long id, @RequestBody
            Execution execution) {
        Optional<Execution> executionData = executionRepository.findById(id);
        if (executionData.isPresent()) {
            String sum_score = Integer.toString(CalculationUtils.getSumScore(execution, 1, 4));

            Execution _execution = executionData.get();

            _execution.setBasicInfoId(execution.getBasicInfoId());
            _execution.setDate(execution.getDate());
            _execution.setSum_score(sum_score);
            _execution.setAnswer1(execution.getAnswer1());
            _execution.setAnswer2(execution.getAnswer2());
            _execution.setAnswer3(execution.getAnswer3());
            _execution.setAnswer4(execution.getAnswer4());
            _execution.setQuestion1(execution.getQuestion1());
            _execution.setQuestion2(execution.getQuestion2());
            _execution.setQuestion3(execution.getQuestion3());
            _execution.setQuestion4(execution.getQuestion4());
            _execution.setQuestion5(execution.getQuestion5());
            _execution.setQuestion6(execution.getQuestion6());
            _execution.setQuestion7(execution.getQuestion7());
            _execution.setQuestion8(execution.getQuestion8());
            _execution.setQuestion9(execution.getQuestion9());
            _execution.setQuestion10(execution.getQuestion10());
            _execution.setQuestion11(execution.getQuestion11());
            _execution.setQuestion12(execution.getQuestion12());
            _execution.setQuestion13(execution.getQuestion13());
            _execution.setQuestion14(execution.getQuestion14());
            _execution.setQuestion15(execution.getQuestion15());
            _execution.setQuestion16(execution.getQuestion16());
            _execution.setQuestion17(execution.getQuestion17());
            _execution.setQuestion18(execution.getQuestion18());
            _execution.setQuestion19(execution.getQuestion19());
            _execution.setQuestion20(execution.getQuestion20());
            _execution.setQuestion21(execution.getQuestion21());
            _execution.setQuestion22(execution.getQuestion22());
            _execution.setQuestion23(execution.getQuestion23());


            return new ResponseEntity<>(executionRepository.save(_execution), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/executions/{id}")    public ResponseEntity<HttpStatus> deleteExecution(@PathVariable("id") long id) {
        try {
            executionRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/executions")
    public ResponseEntity<HttpStatus> deleteAllExecutions() {
        try {
            executionRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

