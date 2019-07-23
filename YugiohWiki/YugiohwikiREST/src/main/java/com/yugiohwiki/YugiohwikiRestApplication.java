package com.yugiohwiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YugiohwikiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(YugiohwikiRestApplication.class, args);
	}
	
//	@Bean
//	public PasswordEncoder configurePasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
}
