package com.mtit.it18115376.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mtit.it18115376.productservice.objects.ProductRequest;
import com.mtit.it18115376.productservice.objects.ProductResponse;
import com.mtit.it18115376.productservice.service.ProductService;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody ProductResponse createProduct(@RequestBody ProductRequest request){

        System.out.println("Product Details :" +request);

        return   productService.createProduct(request);
    }

}
