package com.example.demo.testing;

import com.example.demo.testing.Testing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingRepository extends JpaRepository<Testing, Long> {
}