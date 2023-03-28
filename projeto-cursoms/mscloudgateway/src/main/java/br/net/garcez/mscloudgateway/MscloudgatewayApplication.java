package br.net.garcez.mscloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MscloudgatewayApplication {

// Controe Imagem
// docker build --tag cursoms-gateway .

// Publica no Docker
//docker run --name docker run --name cursoms-gateway -p 8080:8080 --network cursoms-network  -e EUREKA_SERVER=cursoms-eureka -e KEYCLOAK_SERVER=curso
//ms-keycloak -e KEYCLOAK_PORT=8080 -d  cursoms-gateway
	public static void main(String[] args) {
		SpringApplication.run(MscloudgatewayApplication.class, args);
	}

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder){
		return builder
				.routes()
				.route( r -> r.path("/clientes/**").uri("lb://msclientes") )
				.route( r -> r.path("/cartoes/**").uri("lb://mscartoes") )
				.route( r -> r.path("/avaliacoes-credito/**").uri("lb://msavaliadorcredito") )
				.build();
	}
}
