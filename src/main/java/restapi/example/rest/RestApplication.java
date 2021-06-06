package restapi.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.example.rest.user.User;

import java.util.List;

@SpringBootApplication
@RestController
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@GetMapping("/user")
	public List<User> hello(){
		return List.of(
				new User(1,"joram","bramuel","jorammanoah1@gmail","JoramWells18.","sjchkxhcjxhc",Boolean.TRUE)
		);
	}

}
