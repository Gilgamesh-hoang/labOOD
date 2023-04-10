package ex5;

import java.util.Comparator;

public class SortByHits extends MusicSortStrategy{

    public Comparator<MusicFile> sortBy() {
        Comparator<MusicFile> sortByHits = new Comparator<MusicFile>() {
            @Override
            public int compare(MusicFile o1, MusicFile o2) {
                return Integer.compare(o1.getNumberOfHits(), o2.getNumberOfHits());
            }
        };
        return sortByHits;
    }

}
