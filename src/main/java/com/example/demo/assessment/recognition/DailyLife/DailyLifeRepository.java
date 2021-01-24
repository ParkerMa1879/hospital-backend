package com.example.demo.assessment.recognition.DailyLife;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyLifeRepository extends JpaRepository<DailyLife, Long> {
    List<DailyLife> findAllByOrderByIdDesc();
    List<DailyLife> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}

