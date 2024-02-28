package br.com.jvneves.gestao_vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Gestão de Vagas", description = "API responsavel pela gestão de Vagas", version = "1"))
public class GestaoVagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoVagasApplication.class, args);
	}

}
