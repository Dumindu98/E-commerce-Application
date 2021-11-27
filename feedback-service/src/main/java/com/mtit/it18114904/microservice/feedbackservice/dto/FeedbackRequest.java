package com.mtit.it18114904.microservice.feedbackservice.dto;

import java.util.StringJoiner;

public class FeedbackRequest {

    private String FullName;
    private String rating;
    private String descrip;
    private String age;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FeedbackRequest.class.getSimpleName() + "[", "]")
                .add("FullName='" + FullName + "'")
                .add("rating='" + rating + "'")
                .add("descrip='" + descrip + "'")
                .add("age='" + age + "'")
                .toString();
    }
}
