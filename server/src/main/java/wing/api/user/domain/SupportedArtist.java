package wing.api.user.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupportedArtist {
    private String id;
    private String userId;
    private String artistId;
    private String amount;
    private String datetime;
    private String uid;

    // 추가로 원하는 값
    private String artistName;
}
