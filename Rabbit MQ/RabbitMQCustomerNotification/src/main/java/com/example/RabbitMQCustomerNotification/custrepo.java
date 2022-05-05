package com.example.RabbitMQCustomerNotification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface custrepo extends CrudRepository<Customer,String> {

}
