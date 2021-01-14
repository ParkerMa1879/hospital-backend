package com.example.demo.assessment.testing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestingRepository extends JpaRepository<Testing, Long> {
    public List<Testing> findAllByOrderByIdDesc();
}