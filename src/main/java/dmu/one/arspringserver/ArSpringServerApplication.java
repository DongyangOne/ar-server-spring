package dmu.one.arspringserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ArSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArSpringServerApplication.class, args);
	}

}
