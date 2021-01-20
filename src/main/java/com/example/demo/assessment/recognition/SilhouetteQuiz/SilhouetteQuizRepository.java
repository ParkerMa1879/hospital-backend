package com.example.demo.assessment.recognition.SilhouetteQuiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SilhouetteQuizRepository extends JpaRepository<SilhouetteQuiz, Long> {
    public List<SilhouetteQuiz> findAllByOrderByIdDesc();
    public List<SilhouetteQuiz> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
