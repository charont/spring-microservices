//package com.eaztbytes.configserver.config;
//
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class ConfigRabbitmq {
//	@Bean
//	ConnectionFactory connectionFactory() {
//	    CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
//	    connectionFactory.setUsername("guest");
//	    connectionFactory.setPassword("guest");
//	    connectionFactory.setHost("localhost");
//	    connectionFactory.setPort(5672);
//	    return connectionFactory;
//	}
//
//	@Bean
//	RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
//	    RabbitTemplate rabbitTemplate = new RabbitTemplate();
//	    rabbitTemplate.setConnectionFactory(connectionFactory);
//	    return rabbitTemplate;
//	}
//}
