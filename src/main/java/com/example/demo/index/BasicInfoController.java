package com.example.demo.index;

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
public class BasicInfoController {

    @Autowired
    BasicInfoRepository basicInfoRepository;

    @RequestMapping("/welcome-basicInfo")
    public String welcomepage() {
        return "Welcome to basicInfo";
    }

    @GetMapping("/basicInfos")
    public ResponseEntity<List<BasicInfo>> getAllBasicInfos(@RequestParam(required = false) boolean reverse) {
        try {
            List<BasicInfo> basicInfos = new ArrayList<>();
            if (reverse)
                basicInfos.addAll(basicInfoRepository.findAllByOrderByIdDesc());
            else
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
                    .save(new BasicInfo(basicInfo.getName(),basicInfo.getAge(),basicInfo.getIdentification(),
                            basicInfo.getGender(),basicInfo.getDate(),basicInfo.getNamePinyin(),
                            basicInfo.getMrRaw(),basicInfo.getMrSort(),basicInfo.getMrDate(),
                            basicInfo.getRemarkForFollowupVisit(),basicInfo.getCsvdNum(),
                            basicInfo.getPrimDiag(),basicInfo.getFollowupYear(),basicInfo.getDropOut(),
                            basicInfo.getHospitalNum(),basicInfo.getBedNum(),basicInfo.getClinicNum(),
                            basicInfo.getBirthDate(),basicInfo.getEthnic(),basicInfo.getEduLevel(),
                            basicInfo.getEduYear(),basicInfo.getProfession(),basicInfo.getWork(),
                            basicInfo.getAddress(),basicInfo.getContact(),basicInfo.getSpecimenRemark(),
                            basicInfo.getBlood(),basicInfo.getBloodBox(),basicInfo.getBloodSampleNum(),
                            basicInfo.getCerebrospinalFluidNum(),basicInfo.getUrineNum(),
                            basicInfo.getMedicalHistory(),basicInfo.getMemoryDeclineCourse(),
                            basicInfo.getIncreasedMemoryImpairment(),basicInfo.getMaritalStatus(),
                            basicInfo.getHeight(),basicInfo.getWeight(),basicInfo.getCerebrovascularDisease(),
                            basicInfo.getCerebrovascularDiseaseYear(),basicInfo.getStableCerebrovascularDisease(),
                            basicInfo.getCerebrovascularDiseaseMedication(),basicInfo.getCnsDiseaseDescription(),
                            basicInfo.getHypertension(),basicInfo.getHypertensionYear(),basicInfo.getHighestHypertension(),
                            basicInfo.getAverageHypertension(),basicInfo.getStableHypertension(),
                            basicInfo.getHypertensionMedication(),basicInfo.getDiabetes(),basicInfo.getDiabetesYear(),
                            basicInfo.getStableDiabetes(),basicInfo.getDiabetesMedication(),basicInfo.getCoronaryDisease(),
                            basicInfo.getCoronaryDiseaseYear(),basicInfo.getStableCoronaryDisease(),
                            basicInfo.getAtrialFibrillation(),basicInfo.getAtrialFibrillationYear(),
                            basicInfo.getAtrialFibrillationControl(),basicInfo.getHyperlipidemia(),
                            basicInfo.getHyperlipidemiaYear(),basicInfo.getStableHyperlipidemia(),
                            basicInfo.getHyperlipidemiaMedication(),basicInfo.getMedicalRemark(),basicInfo.getOtherMedicine(),
                            basicInfo.getSmoke(),basicInfo.getSmokeYear(),basicInfo.getSmokeNumPerDay(),
                            basicInfo.getQuitSmoking(),basicInfo.getQuitSmokingYear(),basicInfo.getDrink(),
                            basicInfo.getHistoryOfAlcoholism(),basicInfo.getAlcoholGPerDay(),basicInfo.getQuitDrinking(),
                            basicInfo.getQuitDrinkingYear(),basicInfo.getFamilyHistory(),basicInfo.getFamilyHistoryDiscription()
                            ));
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

            _basicInfo.setName(basicInfo.getName());
            _basicInfo.setAge(basicInfo.getAge());
            _basicInfo.setIdentification(basicInfo.getIdentification());
            _basicInfo.setGender(basicInfo.getGender());
            _basicInfo.setDate(basicInfo.getDate());
            _basicInfo.setNamePinyin(basicInfo.getNamePinyin());
            _basicInfo.setMrRaw(basicInfo.getMrRaw());
            _basicInfo.setMrSort(basicInfo.getMrSort());
            _basicInfo.setMrDate(basicInfo.getMrDate());
            _basicInfo.setRemarkForFollowupVisit(basicInfo.getRemarkForFollowupVisit());
            _basicInfo.setCsvdNum(basicInfo.getCsvdNum());
            _basicInfo.setPrimDiag(basicInfo.getPrimDiag());
            _basicInfo.setFollowupYear(basicInfo.getFollowupYear());
            _basicInfo.setDropOut(basicInfo.getDropOut());
            _basicInfo.setHospitalNum(basicInfo.getHospitalNum());
            _basicInfo.setBedNum(basicInfo.getBedNum());
            _basicInfo.setClinicNum(basicInfo.getClinicNum());
            _basicInfo.setBirthDate(basicInfo.getBirthDate());
            _basicInfo.setEthnic(basicInfo.getEthnic());
            _basicInfo.setEduLevel(basicInfo.getEduLevel());
            _basicInfo.setEduYear(basicInfo.getEduYear());
            _basicInfo.setProfession(basicInfo.getProfession());
            _basicInfo.setWork(basicInfo.getWork());
            _basicInfo.setAddress(basicInfo.getAddress());
            _basicInfo.setContact(basicInfo.getContact());
            _basicInfo.setSpecimenRemark(basicInfo.getSpecimenRemark());
            _basicInfo.setBlood(basicInfo.getBlood());
            _basicInfo.setBloodBox(basicInfo.getBloodBox());
            _basicInfo.setBloodSampleNum(basicInfo.getBloodSampleNum());
            _basicInfo.setCerebrospinalFluidNum(basicInfo.getCerebrospinalFluidNum());
            _basicInfo.setUrineNum(basicInfo.getUrineNum());
            _basicInfo.setMedicalHistory(basicInfo.getMedicalHistory());
            _basicInfo.setMemoryDeclineCourse(basicInfo.getMemoryDeclineCourse());
            _basicInfo.setIncreasedMemoryImpairment(basicInfo.getIncreasedMemoryImpairment());
            _basicInfo.setMaritalStatus(basicInfo.getMaritalStatus());
            _basicInfo.setHeight(basicInfo.getHeight());
            _basicInfo.setWeight(basicInfo.getWeight());
            _basicInfo.setCerebrovascularDisease(basicInfo.getCerebrovascularDisease());
            _basicInfo.setCerebrovascularDiseaseYear(basicInfo.getCerebrovascularDiseaseYear());
            _basicInfo.setStableCerebrovascularDisease(basicInfo.getStableCerebrovascularDisease());
            _basicInfo.setCerebrovascularDiseaseMedication(basicInfo.getCerebrovascularDiseaseMedication());
            _basicInfo.setCnsDiseaseDescription(basicInfo.getCnsDiseaseDescription());
            _basicInfo.setHypertension(basicInfo.getHypertension());
            _basicInfo.setHypertensionYear(basicInfo.getHypertensionYear());
            _basicInfo.setHighestHypertension(basicInfo.getHighestHypertension());
            _basicInfo.setAverageHypertension(basicInfo.getAverageHypertension());
            _basicInfo.setStableHypertension(basicInfo.getStableHypertension());
            _basicInfo.setHypertensionMedication(basicInfo.getHypertensionMedication());
            _basicInfo.setDiabetes(basicInfo.getDiabetes());
            _basicInfo.setDiabetesYear(basicInfo.getDiabetesYear());
            _basicInfo.setStableDiabetes(basicInfo.getStableDiabetes());
            _basicInfo.setDiabetesMedication(basicInfo.getDiabetesMedication());
            _basicInfo.setCoronaryDisease(basicInfo.getCoronaryDisease());
            _basicInfo.setCoronaryDiseaseYear(basicInfo.getCoronaryDiseaseYear());
            _basicInfo.setStableCoronaryDisease(basicInfo.getStableCoronaryDisease());
            _basicInfo.setAtrialFibrillation(basicInfo.getAtrialFibrillation());
            _basicInfo.setAtrialFibrillationYear(basicInfo.getAtrialFibrillationYear());
            _basicInfo.setAtrialFibrillationControl(basicInfo.getAtrialFibrillationControl());
            _basicInfo.setHyperlipidemia(basicInfo.getHyperlipidemia());
            _basicInfo.setHyperlipidemiaYear(basicInfo.getHyperlipidemiaYear());
            _basicInfo.setStableHyperlipidemia(basicInfo.getStableHyperlipidemia());
            _basicInfo.setHyperlipidemiaMedication(basicInfo.getHyperlipidemiaMedication());
            _basicInfo.setMedicalRemark(basicInfo.getMedicalRemark());
            _basicInfo.setOtherMedicine(basicInfo.getOtherMedicine());
            _basicInfo.setSmoke(basicInfo.getSmoke());
            _basicInfo.setSmokeYear(basicInfo.getSmokeYear());
            _basicInfo.setSmokeNumPerDay(basicInfo.getSmokeNumPerDay());
            _basicInfo.setQuitSmoking(basicInfo.getQuitSmoking());
            _basicInfo.setQuitSmokingYear(basicInfo.getQuitSmokingYear());
            _basicInfo.setDrink(basicInfo.getDrink());
            _basicInfo.setHistoryOfAlcoholism(basicInfo.getHistoryOfAlcoholism());
            _basicInfo.setAlcoholGPerDay(basicInfo.getAlcoholGPerDay());
            _basicInfo.setQuitDrinking(basicInfo.getQuitDrinking());
            _basicInfo.setQuitDrinkingYear(basicInfo.getQuitDrinkingYear());
            _basicInfo.setFamilyHistory(basicInfo.getFamilyHistory());
            _basicInfo.setFamilyHistoryDiscription(basicInfo.getFamilyHistoryDiscription());

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

    @GetMapping("/basicInfos/boston")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByBostonBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByBostonBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/cdr")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByCDRBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByCDRBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/dailyLife")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByDailyLifeBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByDailyLifeBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/basicInfos/execution")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByExecutionBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByExecutionBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/gait")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByGaitBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByGaitBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/hama")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByHAMABasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByHAMABasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/hamd")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByHAMDBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByHAMDBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/memory")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByMemoryBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByMemoryBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/mmse")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByMMSEBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByMMSEBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/moca")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByMOCABasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByMOCABasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/nihss")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByNIHSSBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByNIHSSBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/SilhouetteQuiz")
    public ResponseEntity<List<BasicInfo>> getBasicInfoBySilhouetteQuizBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllBySilhouetteQuizBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/visualReproduction")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByVisualReproductionBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByVisualReproductionBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/other")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByOtherBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByOtherBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/basicInfos/testing")
    public ResponseEntity<List<BasicInfo>> getBasicInfoByTestingBasicInfoId() {
        try {
            List<BasicInfo> BasicInfos = basicInfoRepository.findAllByTestingBasicInfoId();
            if (BasicInfos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(BasicInfos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
