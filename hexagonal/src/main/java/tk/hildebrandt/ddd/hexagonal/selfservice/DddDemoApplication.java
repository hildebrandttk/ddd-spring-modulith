package tk.hildebrandt.ddd.hexagonal.selfservice;

import org.jmolecules.architecture.hexagonal.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Application
@SpringBootApplication
public class DddDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddDemoApplication.class, args);
	}

}
