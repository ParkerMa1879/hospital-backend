//package com.example.demo.utils.csv;
//
//
//import java.io.ByteArrayInputStream;
//import java.util.List;
//
//import com.example.demo.index.BasicInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CSVService {
//
//  @Autowired
//  BasicInfoRepository repository;
//
//  public ByteArrayInputStream load() {
//    List<BasicInfo> tutorials = repository.findAll();
//
//    ByteArrayInputStream in = CSVHelper.basicInfosToCSV(tutorials);
//    return in;
//  }
//}
