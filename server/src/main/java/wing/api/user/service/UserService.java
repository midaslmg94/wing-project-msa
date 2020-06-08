package wing.api.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wing.api.user.client.SupportedArtistClient;
import wing.api.user.domain.SupportedArtist;
import wing.api.user.domain.User;
import wing.api.user.domain.UserRepository;
import wing.api.user.web.dto.UserRequestDto;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final SupportedArtistClient supportedArtistClient;

    // 유저 등록 -> 리액트와 연동
    @Transactional
    public String save(UserRequestDto userRequestDto) {
        userRepository.save(userRequestDto.toEntity());
        return userRequestDto.getName();
    }
    // 모든 유저 조회 -> findAll
    public List<User> findAll(){
        List<User> userList = userRepository.findAll();
//        for (User user : userList) {
//            System.out.println("hello"+user.getUserId());
//            System.out.println("========================");
//            //user.withSupportedArtistList(supportedArtistClient.getSupportList(user.getUserId()));
//        }
        return userList;
    }

    // 개별 유저 조회 -> findById
    public User findByUserId(String userId){
        return userRepository.findByUserId(userId);
    }

    // 유저가 좋아요 한 음악 -> 외부에 있는 음악 DB와 연동


    // 유저가 후원한 아티스트

}
