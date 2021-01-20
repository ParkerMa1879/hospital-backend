package com.example.demo.assessment.recognition.MMSE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MMSERepository extends JpaRepository<MMSE, Long> {
    public List<MMSE> findAllByOrderByIdDesc();
    public List<MMSE> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
