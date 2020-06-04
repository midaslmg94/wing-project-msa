package wing.api.user.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import wing.api.user.domain.User;

import java.util.Set;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUserId(String userId);
}
