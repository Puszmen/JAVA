import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MusicCollection {
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

        int totalPOPLength = countLengthByGenre(songs, Song.Genre.POP);
        System.out.println("Łączny czas piosenek popowych na playliście (w sekundach): " + totalPOPLength);
        long totalMetallicaSongs = countSongsByArtist(songs, "Metallica");
        System.out.println("Liczba piosenek Metalliki na playliście: " + totalMetallicaSongs);
        System.out.println("Piosenki na playliście bez POPu:");
        List<Song> songsWithoutPOP = countSongsByGenre(songs, Song.Genre.POP);
        songsWithoutPOP.forEach(System.out::println);
    }

    static int countLengthByGenre (List<Song> songs, Song.Genre genre) {
        return songs.stream()
                .filter(song -> song.getGenre() == genre)
                .mapToInt(Song::getLength)
                .sum();
    }

    static long countSongsByArtist (List<Song> songs, String artist) {
        return songs.stream()
                .filter(song -> artist.equals(song.getArtist()))
                .count();
    }

    static List<Song> countSongsByGenre (List<Song> songs, Song.Genre removeGenre) {
        return songs.stream()
                .filter(song -> song.getGenre() != removeGenre)
                .distinct()
                .collect(Collectors.toList());
    }
}