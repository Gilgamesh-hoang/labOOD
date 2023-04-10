package ex5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByGenre extends MusicSortStrategy{


    public Comparator<MusicFile> sortBy() {
        Comparator<MusicFile> sortByGenre = new Comparator<MusicFile>() {
            @Override
            public int compare(MusicFile o1, MusicFile o2) {
                return o1.getSong().getGenre().compareTo(o2.getSong().getGenre());
            }
        };
        return sortByGenre;
    }
}
