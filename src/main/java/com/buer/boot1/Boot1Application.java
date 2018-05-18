package com.buer.boot1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.buer.boot1.dao")
public class Boot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot1Application.class, args);
	}
}
