package com.example.demo.assessment.image;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ImageController {

    @Autowired
    ImageRepository imageRepository;

    @RequestMapping("/welcome-4")
    public String welcomepage() {
        return "Welcome to Demo";
    }

    @GetMapping("/images")
    public ResponseEntity<List<Image>> getAllImages() {
        try {
            List<Image> images = new ArrayList<>();

            images.addAll(imageRepository.findAll());

            if (images.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(images, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/images/{id}")
    public ResponseEntity<Image> getImageById(@PathVariable("id") long id) {
        Optional<Image> imageData = imageRepository.findById(id);

        return imageData.map(image -> new ResponseEntity<>(image, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/images")
    public ResponseEntity<Image> createImage(@RequestBody Image image) {
        try {
            Image _image = imageRepository
                    .save(new Image(image.getImageNum(),image.getEntryTime(),image.getMrNum(),
                            image.getHeadVesselMriMra(),image.getHeadVesselMriMraFolder(),image.getCranialSpectroscopy(),
                            image.getCtcta(),image.getVascularUltrasound(),image.getTcd()));
            return new ResponseEntity<>(_image, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/images/{id}")
    public ResponseEntity<Image> updateImage(@PathVariable("id") long id, @RequestBody Image image) {
        Optional<Image> imageData = imageRepository.findById(id);

        if (imageData.isPresent()) {
            Image _image = imageData.get();
            _image.setImageNum(image.getImageNum());
            _image.setEntryTime(image.getEntryTime());
            _image.setMrNum(image.getMrNum());
            _image.setHeadVesselMriMra(image.getHeadVesselMriMra());
            _image.setHeadVesselMriMraFolder(image.getHeadVesselMriMraFolder());
            _image.setCranialSpectroscopy(image.getCranialSpectroscopy());
            _image.setCtcta(image.getCtcta());
            _image.setVascularUltrasound(image.getVascularUltrasound());
            _image.setTcd(image.getTcd());

            return new ResponseEntity<>(imageRepository.save(_image), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/images/{id}")
    public ResponseEntity<HttpStatus> deleteImage(@PathVariable("id") long id) {
        try {
            imageRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/images")
    public ResponseEntity<HttpStatus> deleteAllImages() {
        try {
            imageRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}

