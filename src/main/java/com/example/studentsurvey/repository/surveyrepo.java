package com.example.studentsurvey.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentsurvey.model.Survey;

public interface surveyrepo extends JpaRepository<Survey, Long> {
    // Custom finder method to search by first name (case-insensitive partial match)
    List<Survey> findByFirstNameContainingIgnoreCase(String firstName);
}