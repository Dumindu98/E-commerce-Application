package com.mtit.it18062502.invoiceservice.controller;

import org.springframework.web.bind.annotation.*;

import com.mtit.it18062502.invoiceservice.objects.InvoiceRequest;
import com.mtit.it18062502.invoiceservice.objects.InvoiceResponse;

import java.util.UUID;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {


    @PostMapping(consumes = "application/json",produces ="application/json" )
    public @ResponseBody InvoiceResponse CreateInvoice(@RequestBody InvoiceRequest request){

        System.out.println("Invoice Details:" +request);
        InvoiceResponse invoiceResponse = new InvoiceResponse();
        invoiceResponse.setInvoiceId(UUID.randomUUID().toString());
        invoiceResponse.setMessage("Invoice Created Sucessfully");

        return  invoiceResponse;
    }

}
