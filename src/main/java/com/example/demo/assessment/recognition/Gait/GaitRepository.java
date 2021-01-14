package com.example.demo.assessment.recognition.Gait;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GaitRepository  extends JpaRepository<Gait, Long> {
    public List<Gait> findAllByOrderByIdDesc();
}
