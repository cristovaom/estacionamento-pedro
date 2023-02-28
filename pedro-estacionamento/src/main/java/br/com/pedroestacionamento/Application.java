package br.com.pedroestacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = "br.com.pedroestacionamento" )  // force scan JPA entities
public class Application {
	private static ConfigurableApplicationContext applicationContext;
	public static void main(String[] args) {
		Application.applicationContext = SpringApplication.run(Application.class, args);
	}
}