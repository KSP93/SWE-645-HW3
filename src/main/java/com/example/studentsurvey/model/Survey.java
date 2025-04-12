package com.example.studentsurvey.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "student_survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "streetAddress")
    private String streetAddress;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "dateOfSurvey")
    private Date dateOfSurvey;
    @Column(name = "likedMost")
    private String likedMost;
    @Column(name = "interestedIn")
    private String interestedIn;
    @Column(name = "likelihood")
    private String likelihood;     // for "likelihood" rating

    // ----- Getters -----

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public String getLikedMost() {
        return likedMost;
    }

    public String getInterestedIn() {
        return interestedIn;
    }

    public String getLikelihood() {
        return likelihood;
    }

    // ----- Setters -----

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public void setLikedMost(String likedMost) {
        this.likedMost = likedMost;
    }

    public void setInterestedIn(String interestedIn) {
        this.interestedIn = interestedIn;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

}