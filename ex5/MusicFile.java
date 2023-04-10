package ex5;

public class MusicFile {
    private Song song;
    private String singer;
    private String path;
    private int numberOfHits;

    public MusicFile(Song song, String singer, String path, int numberOfHits) {
        this.song = song;
        this.singer = singer;
        this.path = path;
        this.numberOfHits = numberOfHits;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public void setNumberOfHits(int numberOfHits) {
        this.numberOfHits = numberOfHits;
    }

    @Override
    public String toString() {
        return "MusicFile{" +song.toString() +", "+ singer + ", "+ numberOfHits +'}';
    }
}
