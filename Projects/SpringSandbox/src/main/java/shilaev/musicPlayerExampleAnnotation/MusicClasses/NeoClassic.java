package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Component("neoclassicMusic")
public class NeoClassic implements Music {

    List<String> songs;

    private NeoClassic() {
        this.songs = new LinkedList<>();
        this.songs.add("Lukas King - Sociopath");
        this.songs.add("Lukas King - The Force Theme");
        this.songs.add("Lukas King - Paint it black");
    }

    @Override
    public String getSongs() {
        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());

        return songs.get(randomIndex) + "\n";
    }
}
