package restapi.example.rest.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> hello(){
        return List.of(
                new User(1,"joram","bramuel","jorammanoah1@gmail","JoramWells18.","sjchkxhcjxhc",Boolean.TRUE)
        );
    }
}
