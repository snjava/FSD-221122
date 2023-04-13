package sb.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sb.learning.util.DbSetup;

@SpringBootApplication
public class SbIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbIntroApplication.class, args);
	}

	@Bean
	public DbSetup getDbSetupObject() {
		DbSetup setup = new DbSetup();
		setup.setDBConnection();
		return setup;
	}
	
	
	
}
