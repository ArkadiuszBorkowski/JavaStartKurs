package Stream.cw2;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

public class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        String genre = "POP";
        int totalLengthGenre = totalLengthByGenre(songs, genre);
        System.out.println("Łączny czas trwania piosenek z gatunku " + genre + " wynosi = " + totalLengthGenre);

        String artist = "Metallica";
        long countSongsArtist = countSongsByArtist(songs, artist);
        System.out.println("Łączny liczba utworów wykonawcy " + artist + " wynosi = " + countSongsArtist);

        List<Song> songsWithGenre = songsWithGenreFiltered(songs, Song.Genre.POP);
        //songsWithGenre.forEach(System.out::println);
        System.out.println(songsWithGenre.toString());

    }

    static int totalLengthByGenre (List<Song> songs, String genre) {
        int sum = songs.stream()
                .filter(song -> song.getGenre().toString().equals(genre))
                .mapToInt(Song::getLength)
                .sum();
        return sum;
    }

    static long countSongsByArtist(List<Song> songs, String artist) {
        return songs.stream()
                .filter(song -> artist.equals(song.getArtist()))
                .count();
    }


    static List<Song> songsWithGenreFiltered(List<Song> songs, Song.Genre genreToRemove) {
        return songs.stream()
                .filter(song -> song.getGenre() != genreToRemove)
                .distinct()
                .collect(Collectors.toList());
    }
}
