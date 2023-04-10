package ex5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByComposer extends MusicSortStrategy{

    public Comparator<MusicFile> sortBy() {
        Comparator<MusicFile> sortByComposer = new Comparator<MusicFile>() {
            @Override
            public int compare(MusicFile o1, MusicFile o2) {
                return o1.getSong().getComposer().compareTo(o2.getSong().getComposer());
            }
        };
        return sortByComposer;
    }

}
