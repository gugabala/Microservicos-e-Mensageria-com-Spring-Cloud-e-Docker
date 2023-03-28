package br.net.garcez.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
//  ./mvnw clean package -DskipTests

//Criar network
//docker network create cursoms-network

// Controe Imagem
// docker build --tag cursoms-eureka .

// Publica no Docker
// docker run --name cursoms-eureka -p 8761:8761 --network cursoms-network cursoms-eureka

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
