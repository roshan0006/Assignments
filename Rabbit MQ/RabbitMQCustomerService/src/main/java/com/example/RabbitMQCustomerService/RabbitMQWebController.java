package com.example.RabbitMQCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("customerName") String customerName,@RequestParam("customerId") String customerId,@RequestParam("customerProduct") String customerProduct) {
	
	Customer cus=new Customer();
	cus.setCustomerId(customerId);
	cus.setCustomerName(customerName);
	cus.setCustomerProduct(customerProduct);
		rabbitMQSender.send(cus);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}

}
