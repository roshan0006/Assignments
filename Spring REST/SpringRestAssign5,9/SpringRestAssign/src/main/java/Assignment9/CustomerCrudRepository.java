package Assignment9;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface CustomerCrudRepository extends CrudRepository<Customer,Long> {

	String findByCustomerName(String CustomerName);

}