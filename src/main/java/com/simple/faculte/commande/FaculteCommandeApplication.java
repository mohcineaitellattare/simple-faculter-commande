package com.simple.faculte.commande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.simple.faculte.commande.rest")
public class FaculteCommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaculteCommandeApplication.class, args);
	}

}

