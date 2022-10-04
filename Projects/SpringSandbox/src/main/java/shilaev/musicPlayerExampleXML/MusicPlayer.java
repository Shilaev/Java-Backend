package shilaev.musicPlayerExampleXML;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList;
    private int volume;

    public MusicPlayer() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void play() {
        System.out.println(volume);
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println(musicList.get(i).getSong());
        }
    }
}
