package com.example.studentsurvey.service;

import com.example.studentsurvey.model.Survey;
import com.example.studentsurvey.repository.surveyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {
    @Autowired
    private surveyrepo surveyRepository;

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public Survey updateSurvey(Survey survey) {
        Optional<Survey> existing = surveyRepository.findById(survey.getId());
        if (existing.isPresent()) {
            Survey s = existing.get();
            s.setFirstName(survey.getFirstName());
            s.setLastName(survey.getLastName());
            s.setEmail(survey.getEmail());
            s.setStreetAddress(survey.getStreetAddress());
            s.setCity(survey.getCity());
            s.setState(survey.getState());
            s.setZip(survey.getZip());
            s.setPhoneNumber(survey.getPhoneNumber());
            s.setDateOfSurvey(survey.getDateOfSurvey());
            s.setLikedMost(survey.getLikedMost());
            s.setInterestedIn(survey.getInterestedIn());
            s.setLikelihood(survey.getLikelihood());
            return surveyRepository.save(s);
        }
        return null;
    }

    public void deleteSurveyById(Long id) {
        surveyRepository.deleteById(id);
    }

    public List<Survey> getAllSurveysByName(String name) {
        return surveyRepository.findByFirstNameContainingIgnoreCase(name);
    }
}
