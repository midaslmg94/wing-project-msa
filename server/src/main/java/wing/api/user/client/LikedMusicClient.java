package wing.api.user.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import wing.api.user.domain.LikedMusic;

import java.util.List;

@Component
public class LikedMusicClient {
    public List<LikedMusic> getLikedMusicList(String userId){
        RestTemplate restTemplate = new RestTemplate();
        String serviceUri = String.format("http://localhost:8003/api/user/liked/%s",userId);
        ResponseEntity<List<LikedMusic>> restExchange = restTemplate.exchange(
                serviceUri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<LikedMusic>>() {
                },
                userId
        );
        return restExchange.getBody();
    }
}
