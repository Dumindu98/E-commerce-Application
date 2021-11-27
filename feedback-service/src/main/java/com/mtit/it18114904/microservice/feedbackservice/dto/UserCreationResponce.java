package com.mtit.it18114904.microservice.feedbackservice.dto;

public class UserCreationResponce {

    private String userID;
    private String massage;


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
