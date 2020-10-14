package com.purnima.jain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.purnima.jain.service.BusinessDomainService;

@SpringBootApplication
public class PortsAndAdaptersKafkaPubSubApplication implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(PortsAndAdaptersKafkaPubSubApplication.class);
	
	@Autowired
	BusinessDomainService businessDomainService;
	
	public static void main(String[] args) {
		SpringApplication.run(PortsAndAdaptersKafkaPubSubApplication.class, args);
		logger.info("PortsAndAdaptersKafkaPubSubApplication started.......");
	}
	
	@Override
	public void run(String... args) throws Exception {
		businessDomainService.generateAndSendMessage();
	}

}
