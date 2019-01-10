package com.soumyadeep.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.soumyadeep.microservices.filter.ErrorFilter;
import com.soumyadeep.microservices.filter.PostFilter;
import com.soumyadeep.microservices.filter.PreFilter;
import com.soumyadeep.microservices.filter.RouteFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EmployeeZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeZuulServiceApplication.class, args);
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}

