package shilaev.musicPlayerExampleAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.Music;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.MusicGenres;

import java.util.LinkedList;
import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
    Music deathcore;
    Music neoclassic;

    public MusicPlayer(@Qualifier("deathcoreMusic") Music deathcore,
                       @Qualifier("neoclassicMusic") Music neoclassic) {
        this.deathcore = deathcore;
        this.neoclassic = neoclassic;
    }

    // TODO: 28.09.2022 Inject Classical Deathcore music
//
    public String play(MusicGenres musicGenres) {
        switch (musicGenres) {
            case DEATHCORE -> {
                return deathcore.getSongs();
            }
            case NEOCLASSIC -> {
                return neoclassic.getSongs();
            }
        }
        return null;
    }
}
