package com.example.demo.assessment.recognition.Memory;

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
public class MemoryController {
    @Autowired
    MemoryRepository memoryRepository;
    @GetMapping("/memorys")
    public ResponseEntity<List<Memory>> getAllMemorys(@RequestParam(required = false) boolean reverse) {
        try {
            List<Memory> memorys = new ArrayList<>();
            if (reverse)
                memorys.addAll(memoryRepository.findAllByOrderByIdDesc());
            else
                memorys.addAll(memoryRepository.findAll());
            if (memorys.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(memorys, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/memorys/{id}")
    public ResponseEntity<Memory> getMemoryById(@PathVariable("id") long id) {
        Optional<Memory> memoryData = memoryRepository.findById(id);
        return memoryData.map(memory -> new ResponseEntity<>(memory,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/memorys")
    public ResponseEntity<Memory> createMemory(@RequestBody Memory memory) {
        try {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(memory, 1, 3));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(memory, 4, 5));

            Memory _memory = memoryRepository
                    .save(new Memory(memory.getBasicInfoId(), memory.getDate(), sum_score_1,
                            memory.getAnswer1(),memory.getAnswer2(),memory.getAnswer3(),memory.getQuestion1(),
                            memory.getQuestion2(),memory.getQuestion3(),memory.getQuestion4(),memory.getQuestion5(),
                            memory.getQuestion6(),memory.getQuestion7(),memory.getQuestion8(),memory.getQuestion9(),
                            memory.getQuestion10(),memory.getQuestion11(),memory.getQuestion12(),
                            memory.getQuestion13(),memory.getQuestion14(),memory.getQuestion15(),
                            memory.getQuestion16(),memory.getQuestion17(),sum_score_2,
                            memory.getAnswer4(),memory.getAnswer5(),memory.getQuestion18(),memory.getQuestion19(),
                            memory.getQuestion20()));
            return new ResponseEntity<>(_memory, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/memorys/{id}")
    public ResponseEntity<Memory> updateMemory(@PathVariable("id") long id, @RequestBody
            Memory memory) {
        Optional<Memory> memoryData = memoryRepository.findById(id);
        if (memoryData.isPresent()) {
            String sum_score_1 = Integer.toString(CalculationUtils.getSumScore(memory, 1, 3));
            String sum_score_2 = Integer.toString(CalculationUtils.getSumScore(memory, 4, 5));

            Memory _memory = memoryData.get();

            _memory.setBasicInfoId(memory.getBasicInfoId());
            _memory.setDate(memory.getDate());
            _memory.setSum_score_1(sum_score_1);
            _memory.setAnswer1(memory.getAnswer1());
            _memory.setAnswer2(memory.getAnswer2());
            _memory.setAnswer3(memory.getAnswer3());
            _memory.setQuestion1(memory.getQuestion1());
            _memory.setQuestion2(memory.getQuestion2());
            _memory.setQuestion3(memory.getQuestion3());
            _memory.setQuestion4(memory.getQuestion4());
            _memory.setQuestion5(memory.getQuestion5());
            _memory.setQuestion6(memory.getQuestion6());
            _memory.setQuestion7(memory.getQuestion7());
            _memory.setQuestion8(memory.getQuestion8());
            _memory.setQuestion9(memory.getQuestion9());
            _memory.setQuestion10(memory.getQuestion10());
            _memory.setQuestion11(memory.getQuestion11());
            _memory.setQuestion12(memory.getQuestion12());
            _memory.setQuestion13(memory.getQuestion13());
            _memory.setQuestion14(memory.getQuestion14());
            _memory.setQuestion15(memory.getQuestion15());
            _memory.setQuestion16(memory.getQuestion16());
            _memory.setQuestion17(memory.getQuestion17());
            _memory.setSum_score_2(sum_score_2);
            _memory.setAnswer4(memory.getAnswer4());
            _memory.setAnswer5(memory.getAnswer5());
            _memory.setQuestion18(memory.getQuestion18());
            _memory.setQuestion19(memory.getQuestion19());
            _memory.setQuestion20(memory.getQuestion20());

            return new ResponseEntity<>(memoryRepository.save(_memory), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/memorys/{id}")    public ResponseEntity<HttpStatus> deleteMemory(@PathVariable("id") long id) {
        try {
            memoryRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/memorys")
    public ResponseEntity<HttpStatus> deleteAllMemorys() {
        try {
            memoryRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/memorys/basicInfoId")
    public ResponseEntity<List<Memory>> findByBasicInfoId(@RequestParam() long basicInfoId) {
        try {
            List<Memory> memorys = memoryRepository.findByBasicInfoIdOrderByIdDesc(basicInfoId);
            if (memorys.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(memorys, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

