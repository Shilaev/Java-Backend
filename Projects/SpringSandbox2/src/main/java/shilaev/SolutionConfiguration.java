package shilaev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.Collections;

@Configuration
@ComponentScan("shilaev")
@PropertySource("classpath:solution.properties")
class SolutionConfiguration {

    @Bean
    @Autowired
    @Scope("prototype")
    MusicPlayer musicPlayer(@Value("${song.listOfValues}") String songname) {
        return new MusicPlayer(Collections.singletonList(songname));
    }

    @Bean
    @Autowired
    Deathcore deathcore(@Value("${song.name}") String songname) {
        return new Deathcore(songname);
    }
}
