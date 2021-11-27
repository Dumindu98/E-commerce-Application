package com.mtit.it18120530.cartservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mtit.it18120530.cartservice.dto.CartRequest;
import com.mtit.it18120530.cartservice.dto.CartResponse;
import com.mtit.it18120530.cartservice.dto.OrderCreationRequest;
import com.mtit.it18120530.cartservice.dto.OrderCreationResponse;

@Service
public class CartServiceImpl {

	@Autowired
	private RestTemplate restTemplate;
	
	public CartResponse cartOrder(CartRequest cartRequest) {
		
		var orderCreationRequest = new OrderCreationRequest();
		orderCreationRequest.setProductName(cartRequest.getProductName());
		orderCreationRequest.setQuantity(cartRequest.getQuantity());
		ResponseEntity<OrderCreationResponse> orderCreationResponse = restTemplate.postForEntity("http://localhost:8182/orders",orderCreationRequest,OrderCreationResponse.class);
		
		var cartResponse = new CartResponse();
		cartResponse.setCartID(UUID.randomUUID().toString());
		cartResponse.setOrderID(orderCreationResponse.getBody().getOrderID());
		cartResponse.setMessage("Succesfully added the cart items to order");
		
		return cartResponse;
		
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		
		return builder.build();
		
	}
	
	
}
