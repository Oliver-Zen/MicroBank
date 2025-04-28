package com.olizen.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.olizen.loans.controller") })
@EnableJpaRepositories("com.olizen.loans.repository")
@EntityScan("com.olizen.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "MicroBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Olizen",
						email = "olizen.lollapa@gmail.com",
						url = "https://github.com/Oliver-Zen"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/Oliver-Zen"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "MicroBank Loans microservice REST API Documentation",
				url = "https://github.com/Oliver-Zen"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
