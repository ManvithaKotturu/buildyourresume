package com.example.resumemaker;

public class Resume {

    private String name;
    private String title;
    private String contact;
    private String education;
    private String skills;
    private String experience;

    // Default constructor required for Firebase
    public Resume() {}

    // Parameterized constructor to initialize the values
    public Resume(String name, String title, String contact, String education, String skills, String experience) {
        this.name = name;
        this.title = title;
        this.contact = contact;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
    }

    // Getter and Setter methods for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
