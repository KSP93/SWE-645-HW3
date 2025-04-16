package com.example.studentsurvey.controller;

import com.example.studentsurvey.model.Survey;
import com.example.studentsurvey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    @PostMapping("/create")
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyService.saveSurvey(survey);
    }

    @GetMapping("/search")
    public List<Survey> searchSurveys(@RequestParam String name) {
        return surveyService.getAllSurveysByName(name);
    }

    @PostMapping("/update")
    public Survey updateSurvey(@RequestBody Survey survey) {
        return surveyService.updateSurvey(survey);
    }

    @PostMapping("/delete")
    public void deleteSurvey(@RequestBody int id) {
    surveyService.deleteSurveyById((long) id);
    }

    
}
