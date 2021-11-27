package com.mtit.it18062502.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mtit.it18062502.paymentservice.objects.PaymentRequest;
import com.mtit.it18062502.paymentservice.objects.PaymentResponse;
import com.mtit.it18062502.paymentservice.service.PaymentService;

import java.util.UUID;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody PaymentResponse createPayment(@RequestBody PaymentRequest request){

        System.out.println("Payment Details :" +request);

        return   paymentService.createPayment(request);
    }

}
