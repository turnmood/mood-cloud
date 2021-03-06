package com.mood.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MoodCloudEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoodCloudEurekaClientApplication.class, args);
	}
}
