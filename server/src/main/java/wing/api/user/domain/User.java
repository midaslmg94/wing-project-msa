package wing.api.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
//@Document(collection = "user")
@Entity
public class User {

    @Id
    private String userId;

    @Column
    private String name;

    @Column
    private String email;
    @Column
    private String imageUri;
    //@Enumerated(EnumType.STRING)
    private String role;

    // 후원 아티스트 리스트
//    @Transient
//    private List<SupportedArtist> supportedArtistList;
//    public User withSupportedArtistList(List<SupportedArtist> supportedArtistList){
//        this.setSupportedArtistList(supportedArtistList);
//        return this;
//    }

    // 좋아요 음악 리스트 -> 음악의 id값만
//    @Transient
//    private List<LikedMusic> likedMusicList;
//    public User withLikedMusicList(List<LikedMusic> likedMusicList){
//        this.setLikedMusicList(likedMusicList);
//        return this;
//    }


    @Builder
    private User(String userId, String name, String email, String imageUri, String role){
        this.userId=userId;
        this.name = name;
        this.email = email;
        this.imageUri = imageUri;
        this.role =role;
    }
}
