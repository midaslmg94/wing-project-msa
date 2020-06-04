package wing.api.user.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import wing.api.user.domain.SupportedArtist;

import java.util.List;

@Component
public class SupportedArtistClient {
    public List<SupportedArtist> getSupportList(String userId){
        RestTemplate restTemplate = new RestTemplate();
        String serviceUri = String.format("http://localhost:8005/api/support/user/%s",userId);
        ResponseEntity<List<SupportedArtist>> restExchange = restTemplate.exchange(
                serviceUri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<SupportedArtist>>() {
                },
                userId
        );
        return restExchange.getBody();
    }
}
