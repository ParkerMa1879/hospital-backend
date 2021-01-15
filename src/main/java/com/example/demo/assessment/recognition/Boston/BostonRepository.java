package com.example.demo.assessment.recognition.Boston;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BostonRepository extends JpaRepository<Boston, Long> {
    public List<Boston> findAllByOrderByIdDesc();
    public List<Boston> findByBasicInfoId(long basicInfoId);
}
