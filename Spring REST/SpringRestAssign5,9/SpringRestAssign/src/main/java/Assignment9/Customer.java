package Assignment9;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	private Long CustomerId;
	private String CustomerName;
	private String CustomerDepartment;
	
	@Id
	@GeneratedValue
	public Long getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Long customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerDepartment() {
		return CustomerDepartment;
	}
	public void setCustomerDepartment(String customerDepartment) {
		CustomerDepartment = customerDepartment;
	}
}