package shilaev.musicPlayerExampleAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
    private List<ViolaMusic> musicList;
    private Music music;
    private int volume;

    private Deathcore deathcoreMusic;
    private NeoClassic neoClassicMusic;

    @Autowired
    public MusicPlayer(Deathcore deathcoreMusic, NeoClassic neoClassicMusic) {
        this.deathcoreMusic = deathcoreMusic;
        this.neoClassicMusic = neoClassicMusic;
    }

    //    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
//
//    public void setMusicList(List<ViolaMusic> musicList) {
//        this.musicList = musicList;
//    }

    public String play() {
        return deathcoreMusic.getSong() + "\n"
                + neoClassicMusic.getSong();
//        for (int i = 0; i < musicList.size(); i++) {
//            System.out.println(musicList.get(i).getSong());
//        }
    }
}
