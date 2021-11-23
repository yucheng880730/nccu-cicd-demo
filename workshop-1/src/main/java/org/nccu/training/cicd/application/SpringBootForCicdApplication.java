package org.nccu.training.cicd.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.nccu.training.cicd")
//@EnableJpaRepositories(basePackages = "org.nccu.training.cicd.dao")
//@EntityScan(basePackages = "org.nccu.training.cicd.model")
public class SpringBootForCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootForCicdApplication.class, args);
	}

}
