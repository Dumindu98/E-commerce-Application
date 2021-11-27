package com.mtit.it18114904.microservice.feedbackservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mtit.it18114904.microservice.feedbackservice.dto.FeedbackRequest;
import com.mtit.it18114904.microservice.feedbackservice.dto.Response;
import com.mtit.it18114904.microservice.feedbackservice.dto.UserCreationRequest;
import com.mtit.it18114904.microservice.feedbackservice.dto.UserCreationResponce;

import java.net.URL;
import java.util.UUID;

@Service
public class FeedbackService {


   @Autowired

   private RestTemplate restTemplate;



    public Response giveFeedback(FeedbackRequest feedbackRequest){

        var UserCreationRequest = new UserCreationRequest();
        UserCreationRequest.setFullName(feedbackRequest.getFullName());
        UserCreationRequest.setAge(feedbackRequest.getAge());
        ResponseEntity<UserCreationResponce> userCreationResponce = restTemplate.postForEntity("http://localhost:8070/users",UserCreationRequest, UserCreationResponce.class);

        var Response = new Response();
        Response.setFeedbackID(UUID.randomUUID().toString());
        Response.setUserID(userCreationResponce.getBody().getUserID());
        Response.setMassage("Feedback Successful");
        return Response;
    }

    @Bean
    public RestTemplate restTemplate (RestTemplateBuilder builder){
        return builder.build();
    }

    }


