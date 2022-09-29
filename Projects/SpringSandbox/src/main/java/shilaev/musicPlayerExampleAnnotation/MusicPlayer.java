package shilaev.musicPlayerExampleAnnotation;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.Music;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.MusicGenres;

import java.util.Random;

@Scope("singleton")
@Component("musicPlayer")
public class MusicPlayer {
    private final Music deathcore;
    private final Music neoclassic;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(@Qualifier("deathcoreMusic") Music deathcore,
                       @Qualifier("neoclassicMusic") Music neoclassic) {
        this.deathcore = deathcore;
        this.neoclassic = neoclassic;
    }

    public String printVolume() {
        return "name= " + name +
                " " +
                "volume= " + volume;
    }

    public String playRandomSong(@NotNull MusicGenres musicGenres) {
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
