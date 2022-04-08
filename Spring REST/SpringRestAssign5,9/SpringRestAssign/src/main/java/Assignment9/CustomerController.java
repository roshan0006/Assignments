package Assignment9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Assignment5.Users;



@RestController
@RequestMapping("/customer")

public class CustomerController {
	@Autowired
	private CustomerCrudRepository customercrudrepository;
	
	@GetMapping("/all")
	public Iterable<Customer> findAll() {
		return customercrudrepository.findAll();
		
	}
	@GetMapping(value = "/{customerName}")
	public String findByName(@PathVariable final String CustomerName) {
		return customercrudrepository.findByCustomerName(CustomerName);
		
	}
	
	@PostMapping("/load")
	public Customer toLoad(@RequestBody final Customer customer) {
			return customercrudrepository.save(customer);
			
			
			
	}
	
	@RequestMapping(value="/delete/{CustomerId}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long CustomerId) {
	     customercrudrepository.deleteById(CustomerId);
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestBody Customer customer) {
		customercrudrepository.save(customer);

	}
	

}