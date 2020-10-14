package com.purnima.jain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.purnima.jain.domain.model.Person;

@Service
public class BusinessDomainService {

	private static final Logger logger = LoggerFactory.getLogger(BusinessDomainService.class);

	@Autowired
	ProducerService producerService;

	public void generateAndSendMessage() {
		for (int i = 0; i < 5; i++) {
			Faker faker = new Faker();
			Person person = Person.builder()
					.firstName(faker.name().firstName())
					.lastName(faker.name().lastName())
					.build();
			logger.info("Generating Person data to sent to ProducerService :: person :: {}", person);
			producerService.sendMessage(person);
		}
	}

	public void postProcessReceivedMessage(Person person) {
		logger.info("Post Processing the received message from Kafka-Consumer :: person :: {}", person);
	}

}
