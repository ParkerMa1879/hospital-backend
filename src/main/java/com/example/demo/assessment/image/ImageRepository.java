package com.example.demo.assessment.image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, String> {
    List<Image> findByBasicInfoIdOrderByIdDesc(long basicInfoId);
}
