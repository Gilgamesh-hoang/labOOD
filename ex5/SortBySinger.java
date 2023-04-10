package ex5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBySinger extends MusicSortStrategy{

    public Comparator<MusicFile> sortBy() {
        Comparator<MusicFile> sortBySinger = new Comparator<MusicFile>() {
            @Override
            public int compare(MusicFile o1, MusicFile o2) {
                return o1.getSinger().compareTo(o2.getSinger());
            }
        };
        return sortBySinger;
    }
}