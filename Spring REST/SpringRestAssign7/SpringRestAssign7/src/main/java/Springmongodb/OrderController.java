package Springmongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/order")
@RestController

public class OrderController {
	@Autowired
	private OrderRepository orderrepository;
	
	@RequestMapping(value="/all")
	public List<Order>findAll(){
		return orderrepository.findAll();
	}
	
	@RequestMapping(value="/{item}")
	public Order findByItem(@PathVariable String item) {
		return orderrepository.findByItem(item);
	}
	
		
		
		@RequestMapping(value="/load",method=RequestMethod.POST)
		public Order load(@RequestBody Order order) {
			orderrepository.save(order);
		return orderrepository.findByItem(order.getItem());
		}
		
		
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		public void delete(@PathVariable Integer id) {
			orderrepository.deleteById(id);
		}
		
		@RequestMapping(value="/update",method=RequestMethod.PUT)
		public void update(@RequestBody Order order) {
			orderrepository.save(order);
		}
	}