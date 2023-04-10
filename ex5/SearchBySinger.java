package ex5;

import java.util.ArrayList;
import java.util.List;

public class SearchBySinger implements MusicSearchStrategy{

    @Override
    public List<MusicFile> search(List<MusicFile> listMusic, String keywork) {
        List<MusicFile> res = new ArrayList<>();
        for(MusicFile musicFile : listMusic) {
            if(musicFile.getSinger().contains(keywork))
                res.add(musicFile);
        }
        return res;
    }
}