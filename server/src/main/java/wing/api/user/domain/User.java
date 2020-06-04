package wing.api.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Document(collection = "user")
public class User {
    @Id
    private ObjectId _id;
    private String userId;
    private String name;
    private String email;
    private String imageUri;
    //@Enumerated(EnumType.STRING)
    private String role;

    @Transient
    private List<SupportedArtist> supportedArtistList;

    public User withSupportedArtistList(List<SupportedArtist> supportedArtistList){
        this.setSupportedArtistList(supportedArtistList);
        return this;
    }

    @Builder
    private User(String userId, String name, String email, String imageUri, String role){
        this.userId=userId;
        this.name = name;
        this.email = email;
        this.imageUri = imageUri;
        this.role =role;
    }
}
