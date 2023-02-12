package com.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class AdminManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminManagement1Application.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate()
	{
	return new RestTemplate();
	}
	public static final String Admin_TAG1 = "admin service";

   
	@Bean
    public Docket swaggerConfiguration()
    {
        return new    Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/admin/**"))
                .apis(RequestHandlerSelectors.basePackage("com.admin")) .build()
                .tags(new Tag(Admin_TAG1, "the admin API with description api tag"));
}
}


