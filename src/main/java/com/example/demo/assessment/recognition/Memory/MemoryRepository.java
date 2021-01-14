package com.example.demo.assessment.recognition.Memory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoryRepository  extends JpaRepository<Memory, Long> {
    public List<Memory> findAllByOrderByIdDesc();
}
