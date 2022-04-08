package SpringSecurityAssign2;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
    protected void configure(HttpSecurity http) throws Exception {    
            
          http
          .authorizeRequests()
          .anyRequest().authenticated()  
          .and()  
          .formLogin()  
          .loginPage("/login")
          .permitAll()
          .and();
           
         
          
	}  
	
	  protected void configure( AuthenticationManagerBuilder auth) throws Exception
	  {
	  
	  auth.inMemoryAuthentication()
	  .withUser("user")
	  .password("pass")
	  .roles("USER")
	  .and()
	  .withUser("admin")
	  .password("pass") 
	  .roles("Admin");
	  }
	   
    
	@Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }


}
