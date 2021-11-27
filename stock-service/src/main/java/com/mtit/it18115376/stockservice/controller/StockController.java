package com.mtit.it18115376.stockservice.controller;

import org.springframework.web.bind.annotation.*;

import com.mtit.it18115376.stockservice.objects.StockRequest;
import com.mtit.it18115376.stockservice.objects.StockResponse;

import java.util.UUID;

@RestController
@RequestMapping("/stocks")
public class StockController {


    @PostMapping(consumes = "application/json",produces ="application/json" )
    public @ResponseBody StockResponse CreateStock(@RequestBody StockRequest request){

        System.out.println("Stock Details:" +request);
        StockResponse stockResponse = new StockResponse();
        stockResponse.setStockId(UUID.randomUUID().toString());
        stockResponse.setMessage("Stock Created Successfully!");

        return  stockResponse;
    }

}
