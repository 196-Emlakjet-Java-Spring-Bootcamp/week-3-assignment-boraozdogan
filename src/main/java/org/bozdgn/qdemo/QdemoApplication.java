package org.bozdgn.qdemo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class QdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QdemoApplication.class, args);
	}

}
