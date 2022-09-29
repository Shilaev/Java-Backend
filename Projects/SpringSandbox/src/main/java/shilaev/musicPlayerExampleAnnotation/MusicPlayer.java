package shilaev.musicPlayerExampleAnnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.Music;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.MusicGenres;

import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {
    private final Music deathcore;
    private final Music neoclassic;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(@Qualifier("deathcoreMusic") Music deathcore,
                       @Qualifier("neoclassicMusic") Music neoclassic) {
        this.deathcore = deathcore;
        this.neoclassic = neoclassic;
    }

    public String printVolume() {
        return "volume=" + volume;
    }

    public String playRandomSong(MusicGenres musicGenres) {
        Random random = new Random();

        switch (musicGenres) {
            case DEATHCORE -> {
                return deathcore.getSongs(random.nextInt(deathcore.getSongListSize()));
            }
            case NEOCLASSIC -> {
                return neoclassic.getSongs(random.nextInt(neoclassic.getSongListSize()));
            }
        }
        return null;
    }
}
