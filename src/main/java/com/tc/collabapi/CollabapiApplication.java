package com.tc.collabapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
	@Info(title = "Collaboration API", version = "1.0", description = "Collaboration & Community API for travel"))
public class CollabapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(CollabapiApplication.class, args);
	}

}
