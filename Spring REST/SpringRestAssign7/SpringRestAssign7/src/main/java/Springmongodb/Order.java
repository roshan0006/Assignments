package Springmongodb;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Order")
public class Order {
	@Id
	private Integer id;
	private String item;
	private Integer amountpaid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getAmountpaid() {
		return amountpaid;
	}
	public void setAmountpaid(Integer amountpaid) {
		this.amountpaid = amountpaid;
	}

}