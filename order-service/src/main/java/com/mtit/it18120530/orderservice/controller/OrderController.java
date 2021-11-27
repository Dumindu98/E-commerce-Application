package com.mtit.it18120530.orderservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtit.it18120530.orderservice.dto.OrderRequest;
import com.mtit.it18120530.orderservice.dto.OrderResponse;


@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@PostMapping(consumes = "application/json",produces = "application/json" )
	public @ResponseBody OrderResponse createUser(@RequestBody OrderRequest orderRequest) {
		
System.out.println("Odrer Deatils: " +orderRequest);
		
		var orderResponse = new OrderResponse();
		orderResponse.setOrderID(UUID.randomUUID().toString());
		orderResponse.setMessage("Succesfully created the order");
		return orderResponse;
		
		
	}

}
