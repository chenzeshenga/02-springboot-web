package com.chenzeshenga.springboot;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// 启动spring容器加上Tomcat
		SpringApplication.run(Application.class, args);
		System.out.println(new Date());
	}
}
