package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component("deathcoreMusic")
public class Deathcore implements Music {

    List<String> songs;

    private Deathcore() {
        this.songs = new LinkedList<>();
        this.songs.add("AngelMaker - Godless");
        this.songs.add("AngelMaker - Leech");
        this.songs.add("AngelMaker - I long for Rest");
    }

    @Override
    public String getSongs(int songNumber) {
        return songs.get(songNumber) + "\n";
    }

    @Override
    public int getSongListSize() {
        return songs.size();
    }

//    void doMyInit() {
//        System.out.println("INITIALIZATION");
//    }
//
//    private void doMyDestroy() {
//        System.out.println("DESTROY");
//    }
}
