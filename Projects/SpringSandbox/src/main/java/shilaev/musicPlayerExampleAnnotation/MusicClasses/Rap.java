package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component("rapMusic")
public class Rap implements Music {
    List<Rap> songs = new LinkedList<>();

    @Override
    public String getSongs(int songNumber) {
        return songs.get(songNumber) + "\n";
    }

    @Override
    public int getSongListSize() {
        return songs.size();
    }
}
