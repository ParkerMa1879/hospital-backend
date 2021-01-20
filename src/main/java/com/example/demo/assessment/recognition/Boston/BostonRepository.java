package com.example.demo.assessment.recognition.Boston;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BostonRepository extends JpaRepository<Boston, Long> {
    List<Boston> findAllByOrderByIdDesc();
    List<Boston> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
