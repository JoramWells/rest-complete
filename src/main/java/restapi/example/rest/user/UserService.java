package restapi.example.rest.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(1,"joram","bramuel","jorammanoah1@gmail","JoramWells18.","sjchkxhcjxhc",Boolean.TRUE)
        );
    }
}
