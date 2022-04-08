package Assignment5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/login5")
	public String login() {
		return "login5" ;
		
	}

}
