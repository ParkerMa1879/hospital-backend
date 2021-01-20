package com.example.demo.assessment.recognition.HAMA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HAMARepository extends JpaRepository<HAMA, Long> {
    public List<HAMA> findAllByOrderByIdDesc();
    public List<HAMA> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
