package ex5;

public class Song {
    private String title;
    private String lyric;
    private String composer;
    private String genre;

    public Song(String title, String lyric, String composer, String genre) {
        this.title = title;
        this.lyric = lyric;
        this.composer = composer;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" + title + ", " + lyric + ", " + composer + ", " + genre + "}";
    }
}
