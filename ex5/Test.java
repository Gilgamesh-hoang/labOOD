package ex5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Song song1 = new Song("Song 1", "Lyric 1", "Composer 1", "Genre 1");
        Song song2 = new Song("Song 2", "Lyric 2", "Composer 2", "Genre 2");
        Song song3 = new Song("Song 3", "Lyric 3", "Composer 3", "Genre 3");
        Song song4 = new Song("Song 4", "Lyric 4", "Composer 1", "Genre 2");
        Song song5 = new Song("Song 5", "Lyric 5", "Composer 5", "Genre 2");
        Song song6 = new Song("Song 6", "Lyric 6", "Composer 6", "Genre 1");

        MusicFile musicFile1 = new MusicFile(song1, "Singer 1", "Path 1", 10);
        MusicFile musicFile2 = new MusicFile(song2, "Singer 2", "Path 2", 5);
        MusicFile musicFile3 = new MusicFile(song3, "Singer 3", "Path 3", 7);
        MusicFile musicFile4 = new MusicFile(song4, "Singer 4", "Path 4", 20);
        MusicFile musicFile5 = new MusicFile(song5, "Singer 5", "Path 5", 30);
        MusicFile musicFile6 = new MusicFile(song6, "Singer 4", "Path 6", 20);

        List<MusicFile> musicFiles = new ArrayList<>();
        musicFiles.add(musicFile1);
        musicFiles.add(musicFile2);
        musicFiles.add(musicFile3);
        musicFiles.add(musicFile4);
        musicFiles.add(musicFile5);
        musicFiles.add(musicFile6);
        Album album1 = new Album("Album 1", new Date(), "Publisher 1", musicFiles);

//        album1.setSearchStrategy(new SearchBySinger());
//        List<MusicFile> search1 = album1.searchByKeyword("Singer 4");
//        album1.print(search1);
//        System.out.println("----------------");
//
//        album1.setSearchStrategy(new SearchByComposer());
//        List<MusicFile> search2 = album1.searchByKeyword("Composer 7");
//        album1.print(search2);
//        System.out.println("----------------");
//
//        album1.setSearchStrategy(new SearchBySongName());
//        List<MusicFile> search3 = album1.searchByKeyword("Song");
//        album1.print(search3);
//        System.out.println("----------------");

//        album1.setMusicSortStrategy(new SortBySongName());
//        List<MusicFile> sort1 = album1.sort(Order.ASC);
//        album1.print(sort1);
//        System.out.println("----------------");
//        List<MusicFile> sort11 = album1.sort(Order.DESC);
//        album1.print(sort11);
//        System.out.println("----------------");
//        album1.setMusicSortStrategy(new SortBySinger());
//        List<MusicFile> sort2 = album1.sort(Order.DESC);
//        album1.print(sort2);
//        System.out.println("----------------");

//        album1.print(album1.getTopAccessedMusicFiles(4));

    }
}
