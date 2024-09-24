package pe_edu.cibertec.examen01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Examen01Application {

	public static void main(String[] args) {
		SpringApplication.run(Examen01Application.class, args);
	}

}
