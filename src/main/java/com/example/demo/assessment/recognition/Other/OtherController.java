package com.example.demo.assessment.recognition.Other;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
public class OtherController {
    @Autowired
    OtherRepository otherRepository;
    @GetMapping("/others")
    public ResponseEntity<List<Other>> getAllOthers(@RequestParam(required = false) boolean reverse) {
        try {
            List<Other> others = new ArrayList<>();
            if (reverse)
                others.addAll(otherRepository.findAllByOrderByIdDesc());
            else
                others.addAll(otherRepository.findAll());
            if (others.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(others, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/others/{id}")
    public ResponseEntity<Other> getOtherById(@PathVariable("id") long id) {
        Optional<Other> otherData = otherRepository.findById(id);
        return otherData.map(other -> new ResponseEntity<>(other,
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/others")
    public ResponseEntity<Other> createOther(@RequestBody Other other) {
        try {
            Other _other = otherRepository
                    .save(new Other(other.getBasicInfoId(),other.getDate(),other.getQuestion1(),
                            other.getQuestion2(),other.getQuestion3(),other.getQuestion4(),other.getQuestion5(),
                            other.getQuestion6(),other.getQuestion7()));
            return new ResponseEntity<>(_other, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/others/{id}")
    public ResponseEntity<Other> updateOther(@PathVariable("id") long id, @RequestBody
            Other other) {
        Optional<Other> otherData = otherRepository.findById(id);
        if (otherData.isPresent()) {
            Other _other = otherData.get();
            _other.setBasicInfoId(other.getBasicInfoId());
            _other.setDate(other.getDate());
            _other.setQuestion1(other.getQuestion1());
            _other.setQuestion2(other.getQuestion2());
            _other.setQuestion3(other.getQuestion3());
            _other.setQuestion4(other.getQuestion4());
            _other.setQuestion5(other.getQuestion5());
            _other.setQuestion6(other.getQuestion6());
            _other.setQuestion7(other.getQuestion7());
            return new ResponseEntity<>(otherRepository.save(_other), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/others/{id}")
    public ResponseEntity<HttpStatus> deleteOther(@PathVariable("id") long id) {
        try {
            otherRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/others")
    public ResponseEntity<HttpStatus> deleteAllOthers() {
        try {
            otherRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/others/basicInfoId")
    public ResponseEntity<List<Other>> findByBasicInfoId(@RequestParam() long basicInfoId) {
        try {
            List<Other> others = otherRepository.findByBasicInfoIdOrderByIdDesc(basicInfoId);
            if (others.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(others, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
