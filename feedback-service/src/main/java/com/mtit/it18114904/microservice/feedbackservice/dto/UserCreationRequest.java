package com.mtit.it18114904.microservice.feedbackservice.dto;

public class UserCreationRequest {

    private String FullName;
    private String age;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
