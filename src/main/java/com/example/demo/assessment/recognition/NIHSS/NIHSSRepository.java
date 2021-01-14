package com.example.demo.assessment.recognition.NIHSS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NIHSSRepository  extends JpaRepository<NIHSS, Long> {
    public List<NIHSS> findAllByOrderByIdDesc();
}
