package com.example.RabbitMQCustomerNotification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
   @Id
   @GeneratedValue
   private int id;
   
   private String customerId;
   
   private String customerName;
   private String customerProduct;


}
