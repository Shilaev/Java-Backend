package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

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
    public String getSongs(int songNumber) {
        return songs.get(songNumber) + "\n";
    }

    @Override
    public int getSongListSize() {
        return songs.size();
    }
}
