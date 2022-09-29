package shilaev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("shilaev")
@PropertySource("classpath:solution.properties")
class SolutionConfiguration {

    @Bean
    @Autowired
    MusicPlayer musicPlayer(@Value("${song.name}") String songname) {
        return new MusicPlayer(deathcore(songname));
    }

    @Bean
    @Autowired
    Deathcore deathcore(@Value("${song.name}") String songname) {
        return new Deathcore(songname);
    }
}
