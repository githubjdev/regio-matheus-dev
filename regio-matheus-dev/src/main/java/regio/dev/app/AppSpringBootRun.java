package regio.dev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"regio.dev.*"})
@EntityScan(basePackages = {"regio.dev.model"})
@ComponentScan(basePackages = {"regio.dev.*"})
@EnableJpaRepositories(basePackages = {"regio.dev.repository"})
public class AppSpringBootRun {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringBootRun.class, args);
	}

}
