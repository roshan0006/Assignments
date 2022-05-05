package com.example.RabbitMQCustomerNotification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/employee")
public class employeeController {
	@Autowired
	private transactions employeejparepository;
	
    @RequestMapping(value="/all")
	public List<Customer> findAll(){
		return (List<Customer>) employeejparepository.findAll();
	}
	
	

}
