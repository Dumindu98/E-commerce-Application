package com.mtit.it18062502.paymentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mtit.it18062502.paymentservice.objects.InvoiceRequest;
import com.mtit.it18062502.paymentservice.objects.InvoiceResponse;
import com.mtit.it18062502.paymentservice.objects.PaymentRequest;
import com.mtit.it18062502.paymentservice.objects.PaymentResponse;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private RestTemplate restTemplate;

    public PaymentResponse createPayment(PaymentRequest request){


        InvoiceRequest invoiceRequest = new InvoiceRequest();
        invoiceRequest.setTotalAmount(request.getAmount());
        invoiceRequest.setInvoicedate(request.getExDate());
        invoiceRequest.setCustomerName(request.getCustomerName());

        ResponseEntity <InvoiceResponse> responseEntity = restTemplate.postForEntity("http://localhost:8080/invoice",invoiceRequest, InvoiceResponse.class);

        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentid(UUID.randomUUID().toString());
        paymentResponse.setInvoiceId(responseEntity.getBody().getInvoiceId());
        paymentResponse.setMessage("Payment Success!");


        return  paymentResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
       return builder.build();
    }
}
