package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component("violaMusic")
public class ViolaMusic implements Music {
    List<ViolaMusic> songs = new LinkedList<>();

    @Override
    public String getSongs(int songNumber) {
        return songs.get(songNumber) + "\n";
    }

    @Override
    public int getSongListSize() {
        return songs.size();
    }
}
