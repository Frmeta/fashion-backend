package com.frmeta.fashion.fashion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
@EnableJpaRepositories("com.frmeta.fashion.fashion.repository")
public class FashionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FashionApplication.class, args);
	}

}
