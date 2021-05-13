package com.duo.remakeProject;

import com.duo.remakeProject.model.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemakeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemakeProjectApplication.class, args);

		Usuario user = new Usuario();

	}


}
