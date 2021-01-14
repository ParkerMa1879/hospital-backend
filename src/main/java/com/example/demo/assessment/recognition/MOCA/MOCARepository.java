package com.example.demo.assessment.recognition.MOCA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MOCARepository extends JpaRepository<MOCA, Long> {
    public List<MOCA> findAllByOrderByIdDesc();
}
