package com.example.demo.assessment.recognition.VisualReproduction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisualReproductionRepository extends JpaRepository<VisualReproduction, Long> {
    public List<VisualReproduction> findAllByOrderByIdDesc();
    public List<VisualReproduction> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
