package shilaev;

import java.util.LinkedList;
import java.util.List;

class MusicPlayer {
    Playable deathcoreMusic;

    List<String> musicList = new LinkedList<>();
    public MusicPlayer(List<String> music) {
        this.musicList.addAll(music);
    }

    public List<String> getMusicList() {
        return musicList;
    }
}
