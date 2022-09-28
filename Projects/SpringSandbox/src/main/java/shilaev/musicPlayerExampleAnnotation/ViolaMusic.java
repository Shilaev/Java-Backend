package shilaev.musicPlayerExampleAnnotation;

import org.springframework.stereotype.Component;

//@Component("violaMusic")
public class ViolaMusic implements Music{
    @Override
    public String getSong() {
        return "Paganini - kaprise №24";
    }
}
