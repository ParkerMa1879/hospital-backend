package com.example.demo.assessment.image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long>{
    List<Image> findAllByOrderByIdDesc();
    List<Image> findByBasicInfoId(long basicInfoId);
}
