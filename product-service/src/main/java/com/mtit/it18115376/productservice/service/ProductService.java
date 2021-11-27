package com.mtit.it18115376.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mtit.it18115376.productservice.objects.StockRequest;
import com.mtit.it18115376.productservice.objects.StockResponse;
import com.mtit.it18115376.productservice.objects.ProductRequest;
import com.mtit.it18115376.productservice.objects.ProductResponse;

import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    public ProductResponse createProduct(ProductRequest request){


        StockRequest stockRequest = new StockRequest();
        stockRequest.setTotalAmount(request.getQty());
        stockRequest.setStockremoveDate(request.getExDate());
        stockRequest.setStockkeeperName(request.getStockkeeperName());

        ResponseEntity <StockResponse> responseEntity = restTemplate.postForEntity("http://localhost:8085/stocks",stockRequest, StockResponse.class);

        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductid(UUID.randomUUID().toString());
        productResponse.setStockId(responseEntity.getBody().getStockId());
        productResponse.setMessage("Create Product Successully !");


        return  productResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
       return builder.build();
    }
}
