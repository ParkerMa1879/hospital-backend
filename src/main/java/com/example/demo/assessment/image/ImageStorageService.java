package com.example.demo.assessment.image;

import java.io.IOException;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageStorageService {

  @Autowired
  private ImageRepository imageRepository;

  public void store(long basicInfo, Date entryTime, String mrNum, int imageType, MultipartFile file) throws IOException {
    Image image = new Image(basicInfo, entryTime, mrNum, imageType, file.getBytes());
    imageRepository.save(image);
  }

  public Image getFile(String id) {
    if (imageRepository.findById(id).isPresent()){
      return imageRepository.findById(id).get();
    }
    return new Image();
  }

  public Stream<Image> getFileByBaicInfoId(long basicInfoId) {
    return imageRepository.findByBasicInfoIdOrderByIdDesc(basicInfoId).stream();
  }
  
  public Stream<Image> getAllFiles() {
    return imageRepository.findAll().stream();
  }
}
