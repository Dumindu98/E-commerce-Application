package com.mtit.it18120530.cartservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtit.it18120530.cartservice.dto.CartRequest;
import com.mtit.it18120530.cartservice.dto.CartResponse;
import com.mtit.it18120530.cartservice.service.CartServiceImpl;

@RestController
@RequestMapping("/carts")
public class CartController {
	
	@Autowired
	private CartServiceImpl cartService;
	
	
	@PostMapping(consumes = "application/json",produces = "application/json" )
	public @ResponseBody CartResponse cartOrder(@RequestBody CartRequest request ) {
		
		System.out.println("Carts Deatils: " +request);
		return cartService.cartOrder(request);
		
	}

}
