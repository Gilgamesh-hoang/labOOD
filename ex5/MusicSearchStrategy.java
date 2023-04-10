package ex5;

import java.util.List;

public interface MusicSearchStrategy {
    List<MusicFile> search(List<MusicFile> listMusic, String keywork);
}
