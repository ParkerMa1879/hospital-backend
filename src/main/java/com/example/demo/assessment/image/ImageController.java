package com.example.demo.assessment.image;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
@CrossOrigin("http://localhost:8081")
@RequestMapping("/api")
public class ImageController {

  @Autowired
  private ImageStorageService storageService;

  @PostMapping("/images/upload")
  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("basicInfoId") long basicInfoId, @RequestParam("entryTime") Date entryTime,
                                                    @RequestParam("mrNum") String mrNum,@RequestParam("imageType") int imageType,
                                                    @RequestParam("file") MultipartFile file) {
    String message = "";
    try {
      storageService.store(basicInfoId, entryTime, mrNum, imageType, file);

      message = "Uploaded the file successfully: " + file.getOriginalFilename();
      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
    } catch (Exception e) {
      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
    }
  }

  @GetMapping("/images")
  public ResponseEntity<List<ResponseFile>> getListFiles() {
    List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
      String fileDownloadUri = ServletUriComponentsBuilder
              .fromCurrentContextPath()
              .path("/images/")
              .path(dbFile.getId())
              .toUriString();

      return new ResponseFile(
              dbFile.getBasicInfoId(),
              dbFile.getEntryTime(),
              dbFile.getMrNum(),
              dbFile.getImageType(),
              fileDownloadUri,
              dbFile.getData().length);
    }).collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(files);
  }

  @GetMapping("/files/{id}")
  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
    Image fileDB = storageService.getFile(id);

    return ResponseEntity.ok().body(fileDB.getData());
  }

  @GetMapping("/files/basicInfoId")
  public ResponseEntity<List<byte[]>> getFileByBasicInfoId(@RequestParam() long basicInfoId) {
    List<byte[]> fileDB = storageService.getFileByBaicInfoId(basicInfoId).map(Image::getData).collect(Collectors.toList());;

    return ResponseEntity.ok().body(fileDB);
  }
}
