package com.example.demo.assessment.recognition.CDR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CDRRepository extends JpaRepository<CDR, Long> {
    List<CDR> findAllByOrderByIdDesc();
    List<CDR> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
