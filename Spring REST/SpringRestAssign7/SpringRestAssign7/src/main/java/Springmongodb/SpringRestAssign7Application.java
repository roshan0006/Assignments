package Springmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories(basePackageClasses = OrderRepository.class)
@SpringBootApplication
public class SpringRestAssign7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAssign7Application.class, args);
	}

}
