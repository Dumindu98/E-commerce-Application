package com.mtit.it18062502.invoiceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class InvoiceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceServiceApplication.class, args);
	}

}
