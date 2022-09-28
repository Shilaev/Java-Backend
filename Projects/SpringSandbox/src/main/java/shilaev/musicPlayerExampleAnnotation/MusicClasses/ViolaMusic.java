package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

@Component("violaMusic")
public class ViolaMusic implements Music{
    @Override
    public String getSongs() {
        return "Paganini - kaprise №24";
    }
}
