package com.mtit.it18114904.microservice.feedbackservice.controller;
import com.mtit.it18114904.microservice.feedbackservice.dto.FeedbackRequest;
import com.mtit.it18114904.microservice.feedbackservice.dto.Response;
import com.mtit.it18114904.microservice.feedbackservice.service.FeedbackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {


    @Autowired
    private FeedbackService feedbackService;


    @PostMapping(consumes = "application/json", produces = "application/json")

    public @ResponseBody Response giveFeedback(@RequestBody FeedbackRequest request){

        System.out.println("Feedback details :" + request);

        return feedbackService.giveFeedback(request);

        //var Response = new Response();
        //Response.setFeedbackID(UUID.randomUUID().toString());
        //Response.setMassage("Feedback successful");
        //return Response;
    }


}
