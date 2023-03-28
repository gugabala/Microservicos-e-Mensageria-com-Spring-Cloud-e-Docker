package br.net.garcez.mscartoes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableRabbit
@Slf4j
public class MscartoesApplication {
// Controe Imagem
// docker build --tag cursoms-cartoes .

// Publica no Docker
// //docker run --name cursoms-cartoes --network cursoms-network -e RABBITMQ_SERVER=cursoms-rabbitmq  -e EUREKA_SERVER=cursoms-eureka -d  cursoms-cartoes

//Criar network
//docker network create cursoms-network

	public static void main(String[] args) {



		log.info("Informação : {} ", "teste info");
		log.error("Erro : {} ", "teste info");
		log.warn("Aviso : {} ", "teste info");
		SpringApplication.run(MscartoesApplication.class, args);
	}

}
