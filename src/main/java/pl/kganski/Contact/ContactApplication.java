package pl.kganski.Contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "pl.kganski.Contact.repository")
@SpringBootApplication
public class ContactApplication {

	public static void main(String[] args) {

		SpringApplication.run(ContactApplication.class, args);
	}
}
