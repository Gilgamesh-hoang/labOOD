package ex5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class MusicSortStrategy {
    public List<MusicFile> sort(List<MusicFile> listMusic, Order order) {
        if(order == Order.DESC) {
            Collections.sort(listMusic, sortBy().reversed());
        }else if(order == Order.ASC) {
            Collections.sort(listMusic, sortBy());
        }
        return listMusic;

    }

    public abstract Comparator<MusicFile> sortBy();
}
