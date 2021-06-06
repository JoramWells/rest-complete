package restapi.example.rest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

//    Get all users
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

//    Register all users
    @PostMapping("/register")
    public void registerNewUser(@RequestBody User user){
        userService.addUser(user);
    }
}
