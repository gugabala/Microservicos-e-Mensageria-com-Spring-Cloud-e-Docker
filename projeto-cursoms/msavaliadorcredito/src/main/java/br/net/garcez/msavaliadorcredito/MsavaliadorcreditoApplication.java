package br.net.garcez.msavaliadorcredito;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableRabbit
public class MsavaliadorcreditoApplication {
	// Controe Imagem
// docker build --tag cursoms-avaliadorcredito .

// Publica no Docker
// docker run --name cursoms-avaliadorcredito --network cursoms-network -e RABBITMQ_SERVER=cursoms-rabbitmq  -e EUREKA_SERVER=cursoms-eureka -d  cursoms-avaliadorcredito

//Criar network
//docker network create cursoms-network

	public static void main(String[] args) {
		SpringApplication.run(MsavaliadorcreditoApplication.class, args);
	}

}
