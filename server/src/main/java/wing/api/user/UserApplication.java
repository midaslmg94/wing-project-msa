package wing.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import wing.api.user.domain.user.User;

@SpringBootApplication
public class UserApplication {
    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {
            // 값 받아오기
            User user = new User();


        }
    }
}
