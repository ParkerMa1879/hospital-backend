package com.example.demo.assessment.recognition.Other;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OtherRepository extends JpaRepository<Other, Long>{
    List<Other> findAllByOrderByIdDesc();
    List<Other> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
