package wing.api.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class UserApplication {
    // 유저의 행동(좋아요, 후원)을 저장하는 mongo DB와 연동
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
