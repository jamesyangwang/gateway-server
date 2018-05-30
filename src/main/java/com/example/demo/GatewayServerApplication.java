package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}
}

//http://localhost:8765/{application-name [from eureka]}/{uri}
//http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/CNY
//http://localhost:8765/currency-conversion-service/currency-converter-feign/from/EUR/to/CNY/quantity/120
