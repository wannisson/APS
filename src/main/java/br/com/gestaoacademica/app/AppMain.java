package br.com.gestaoacademica.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gestaoacademica.app.utils.AppContext;

@SpringBootApplication
public class AppMain {
	
	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}

}
