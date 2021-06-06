package restapi.example.rest.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository userRepository
    ){
        return args ->{

                    User joram = new User(1,"joram","bramuel","jorammanoah1@gmail","JoramWells18.","sjchkxhcjxhc",Boolean.TRUE);

                    userRepository.saveAll(
                            List.of(
                                    joram
                            )
                    );
        };

    }
}
