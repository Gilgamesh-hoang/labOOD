package ex5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBySongName extends MusicSortStrategy{


    public Comparator<MusicFile> sortBy() {
        Comparator<MusicFile> sortByName = new Comparator<MusicFile>() {
            @Override
            public int compare(MusicFile o1, MusicFile o2) {
                return o1.getSong().getTitle().compareTo(o2.getSong().getTitle());
            }
        };
        return sortByName;
    }
}