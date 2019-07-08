package com.nse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nse.zuul.PostFilter;



@SpringBootApplication
@EnableZuulProxy
public class BootStrapingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStrapingApplication.class, args);

	}
	
	 @Bean
	    public PostFilter postFilter() {
	        return new PostFilter();
	    }

}
