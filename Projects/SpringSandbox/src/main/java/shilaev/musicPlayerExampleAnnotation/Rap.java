package shilaev.musicPlayerExampleAnnotation;

import org.springframework.stereotype.Component;

//@Component("rapMusic")
public class Rap implements Music {
    @Override
    public String getSong() {
        return "Eminem - I don't afraid";
    }
}
