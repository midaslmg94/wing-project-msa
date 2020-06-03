package wing.api.user.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@Entity
@Document(collection = "users")
public class User {
    @Id
    private String userId;

    private String name;

    private String email;

    private String imageUri;

    //@Enumerated(EnumType.STRING)
    private String role;

    @Builder
    private User(String userId, String name, String email, String imageUri, String role){
        this.userId=userId;
        this.name = name;
        this.email = email;
        this.imageUri = imageUri;
        this.role =role;
    }

}
