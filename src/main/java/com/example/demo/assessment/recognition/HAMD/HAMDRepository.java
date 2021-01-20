package com.example.demo.assessment.recognition.HAMD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HAMDRepository extends JpaRepository<HAMD, Long> {
    public List<HAMD> findAllByOrderByIdDesc();
    public List<HAMD> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
