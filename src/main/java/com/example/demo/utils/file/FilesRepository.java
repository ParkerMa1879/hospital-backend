package com.example.demo.utils.file;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<FileInfo, Long> {
}
