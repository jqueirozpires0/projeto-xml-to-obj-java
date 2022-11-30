package com.apiunicred.apispringunicred;

import com.apiunicred.apispringunicred.banco.*;
import com.apiunicred.apispringunicred.repository.XmlToObjRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiSpringUnicredApplication {

	@Bean
	CommandLineRunner runner(XmlToObjRepository jsonXml){
		ConvertXmlToObj obj = new ConvertXmlToObj();
		return args -> {
			RootResponse root = new RootResponse(null,obj.returnObj());
			jsonXml.insert(root);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringUnicredApplication.class, args);
	}

}
