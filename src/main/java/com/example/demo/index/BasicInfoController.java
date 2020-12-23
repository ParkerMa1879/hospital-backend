package com.example.demo.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class BasicInfoController {

    @Autowired
    BasicInfoRepository basicInfoRepository;

    @RequestMapping("/welcome-1")
    public String welcomepage() {
        return "Welcome to Demo";
    }

    @GetMapping("/basicInfos")
    public ResponseEntity<List<BasicInfo>> getAllBasicInfos(@RequestParam(required = false) String name) {
        try {
            List<BasicInfo> basicInfos = new ArrayList<>();

            basicInfos.addAll(basicInfoRepository.findAll());

            if (basicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(basicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/{id}")
    public ResponseEntity<BasicInfo> getBasicInfoById(@PathVariable("id") long id) {
        Optional<BasicInfo> basicInfoData = basicInfoRepository.findById(id);

        return basicInfoData.map(basicInfo -> new ResponseEntity<>(basicInfo, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/basicInfos")
    public ResponseEntity<BasicInfo> createBasicInfo(@RequestBody BasicInfo basicInfo) {
        try {
            BasicInfo _basicInfo = basicInfoRepository
                    .save(new BasicInfo());
            return new ResponseEntity<>(_basicInfo, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/basicInfos/{id}")
    public ResponseEntity<BasicInfo> updateBasicInfo(@PathVariable("id") long id, @RequestBody BasicInfo basicInfo) {
        Optional<BasicInfo> basicInfoData = basicInfoRepository.findById(id);

        if (basicInfoData.isPresent()) {
            BasicInfo _basicInfo = basicInfoData.get();

            return new ResponseEntity<>(basicInfoRepository.save(_basicInfo), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/basicInfos/{id}")
    public ResponseEntity<HttpStatus> deleteBasicInfo(@PathVariable("id") long id) {
        try {
            basicInfoRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/basicInfos")
    public ResponseEntity<HttpStatus> deleteAllBasicInfos() {
        try {

            basicInfoRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
