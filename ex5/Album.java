package ex5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
    private String title;
    private Date releaseDate;
    private String publisher;
    private List<MusicFile> listMusic;
    private MusicSearchStrategy searchStrategy;
    private MusicSortStrategy sortStrategy;

    public Album(String title, Date releaseDate, String publisher, List<MusicFile> listMusic) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.publisher = publisher;
        this.listMusic = listMusic;
    }

    public List<MusicFile> searchByKeyword(String keyword) {
        return searchStrategy.search(listMusic, keyword);
    }

    public List<MusicFile> sort(Order order) {
        return sortStrategy.sort(listMusic, order);
    }

    public List<MusicFile> getTopAccessedMusicFiles(int top) {
        MusicSortStrategy sortBy = new SortByHits();
        List<MusicFile> sorted = sortBy.sort(listMusic, Order.DESC);
        List<MusicFile> res  = new ArrayList<>();
        for (int i = 0; i < top; i++) {
            res.add(sorted.get(i));
        }
        return res;
    }


    public void setSearchStrategy(MusicSearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void setMusicSortStrategy(MusicSortStrategy musicSortStrategy) {
        this.sortStrategy = musicSortStrategy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<MusicFile> getListMusic() {
        return listMusic;
    }

    public void setListMusic(List<MusicFile> listMusic) {
        this.listMusic = listMusic;
    }

    public void print(List<MusicFile> list) {
        if (list.isEmpty())
            System.out.println("list music is empty");
        else
            for(MusicFile music : list)
                System.out.println(music.toString());
    }
}
