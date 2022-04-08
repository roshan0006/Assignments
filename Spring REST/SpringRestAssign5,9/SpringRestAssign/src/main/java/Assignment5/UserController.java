package Assignment5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class UserController {
	@Autowired
	private UserJpaRepository userJpaRepository;

	@GetMapping(value = "/all")
	public List<Users> findAll(){
		return userJpaRepository.findAll();
	}
	
	@GetMapping(value = "/{employeeName}")
	public Users findByName(@PathVariable final String employeeName) {
		return userJpaRepository.findByemployeeName(employeeName);
		
	}
	
	@PostMapping(value="/load")
	public Users loadByData(@RequestBody final Users users) {
		userJpaRepository.save(users);
		return userJpaRepository.findByemployeeName(users.getEmployeeName());
		
	}
	
	@RequestMapping(value="/delete/{employeeId}",method=RequestMethod.DELETE)
	public void delete(@PathVariable Long employeeId) {
	     userJpaRepository.deleteById(employeeId);
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestBody Users users) {
	     userJpaRepository.save(users);

	}
}