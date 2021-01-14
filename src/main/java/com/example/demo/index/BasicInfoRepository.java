package com.example.demo.index;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.assessment.recognition.MOCA.MOCA;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
    public List<BasicInfo> findAllByOrderByIdDesc();
    @Query("Select b from BasicInfo b  left join MOCA m on m.basicInfoId = b.id")
    public List<BasicInfo> FindAllWithDescriptionQueryOrderByIdDesc();
}
