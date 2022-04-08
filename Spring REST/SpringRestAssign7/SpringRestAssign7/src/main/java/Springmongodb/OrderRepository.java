package Springmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface OrderRepository extends MongoRepository<Order, Integer> {

	Order findByItem(String item);

}