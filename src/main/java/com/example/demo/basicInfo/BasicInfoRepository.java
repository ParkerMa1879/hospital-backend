package com.example.demo.basicInfo;

import com.example.demo.basicInfo.BasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
}
