package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

@Component("rapMusic")
public class Rap implements Music {
    @Override
    public String getSongs() {
        return "Eminem - I don't afraid";
    }
}
