package wing.api.user.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wing.api.user.domain.User;

//import javax.persistence.Column;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;

// 구글에서 전달받은 정보를 담을 Dto
@Getter
@NoArgsConstructor
public class UserRequestDto {

    private String userId;
    private String email;
    private String name;
    private String imageUri;
    private String role;

    @Builder
    private UserRequestDto(String userId, String email, String name, String imageUri, String role){
        this.userId=userId;
        this.email = email;
        this.name = name;
        this.imageUri = imageUri;
        this.role =role;
    }

    public User toEntity(){
        return User.builder()
                .userId(userId)
                .name(name)
                .email(email)
                .imageUri(imageUri)
                .role(role)
                .build();
    }

}