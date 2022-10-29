package com.sqlserver.fabletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.sqlserver.controller","com.sqlserver.service"})
@EnableJpaRepositories(basePackages="com.sqlserver.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.sqlserver.model")
public class FabletestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FabletestApplication.class, args);
	}

}
