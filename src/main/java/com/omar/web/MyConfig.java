package com.omar.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {

	//Jersey Deploiment in spring app
	//@Bean
	public ResourceConfig getJersey() {
		ResourceConfig config = new ResourceConfig();
		config.register(EtudiantRestService.class);
		return config;
	}
	
	//SOAP Web Service Configuration
	@Bean
	public SimpleJaxWsServiceExporter getJWS() {
		SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://0.0.0.0:8282/service");
		return exporter;
	}
}
