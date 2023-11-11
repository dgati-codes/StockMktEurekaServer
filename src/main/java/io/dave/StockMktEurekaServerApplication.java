package io.dave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StockMktEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMktEurekaServerApplication.class, args);
	}

}
