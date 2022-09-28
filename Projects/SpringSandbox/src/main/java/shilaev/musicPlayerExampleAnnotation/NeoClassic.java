package shilaev.musicPlayerExampleAnnotation;

import org.springframework.stereotype.Component;

@Component("neoclassicMusic")
public class NeoClassic implements Music {

    @Override
    public String getSong() {
        return "Lukas King - Sociopath";
    }
}
