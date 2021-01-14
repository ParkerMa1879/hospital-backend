package com.example.demo.assessment.recognition.CDR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CDRRepository extends JpaRepository<CDR, Long> {
    public List<CDR> findAllByOrderByIdDesc();
}
