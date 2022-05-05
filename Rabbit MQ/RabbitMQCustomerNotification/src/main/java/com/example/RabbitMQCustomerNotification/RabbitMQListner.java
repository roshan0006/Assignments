package com.example.RabbitMQCustomerNotification;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListner{
	  @Autowired
	    private transactions Transactions;
	@RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Customer c) {
        System.out.println("Message recieved from queue : " + c);
        Customer customer = Transactions.saveCustomer(c);
	}

}
