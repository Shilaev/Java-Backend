package shilaev;

class Deathcore implements Playable{

    private String songName;

    Deathcore(String songName) {
        this.songName = songName;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public void setSongName(String newSongName) {
        this.songName = newSongName;
    }
}
