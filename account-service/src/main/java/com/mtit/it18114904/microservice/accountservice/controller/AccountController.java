package com.mtit.it18114904.microservice.accountservice.controller;

import org.springframework.web.bind.annotation.*;

import com.mtit.it18114904.microservice.accountservice.dto.UserRequest;
import com.mtit.it18114904.microservice.accountservice.dto.UserResponce;

import java.util.UUID;

@RestController
@RequestMapping("/users")

public class AccountController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody UserResponce createuser(@RequestBody UserRequest userRequest){

        System.out.println("User Details : "+ userRequest);

        var userresponce = new UserResponce();
        userresponce.setUserID(UUID.randomUUID().toString());
        userresponce.setMassage("Successfully Created the User");

        return userresponce;

    }

}

