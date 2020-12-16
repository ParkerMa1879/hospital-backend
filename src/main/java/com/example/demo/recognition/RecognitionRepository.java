package com.example.demo.recognition;

import com.example.demo.recognition.Recognition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecognitionRepository extends JpaRepository<Recognition, Long> {
}
