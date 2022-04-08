package Assignment5;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserJpaRepository extends JpaRepository <Users, Long> {

	Users findByemployeeName(String employeeName);

}