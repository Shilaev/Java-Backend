package shilaev.musicPlayerExampleAnnotation.MusicClasses;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
    public String getSongs() {
        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());

        return songs.get(randomIndex) + "\n";
    }
//
//    void doMyInit() {
//        System.out.println("INITIALIZATION");
//    }
//
//    private void doMyDestroy() {
//        System.out.println("DESTROY");
//    }
}
