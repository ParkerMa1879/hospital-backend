package com.example.demo.assessment.recognition.Execution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExecutionRepository extends JpaRepository<Execution, Long> {
    public List<Execution> findAllByOrderByIdDesc();
}
