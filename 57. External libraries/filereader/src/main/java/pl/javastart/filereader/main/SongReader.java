package pl.javastart.filereader.main;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3v2;

import java.io.File;
import java.io.IOException;

public class SongReader {
    public static void main(String[] args) throws TagException, IOException {

        File sourceFile = new File("scott_holmes_music_stylish_groove.mp3");
        MP3File mp3file = new MP3File(sourceFile);
        if (mp3file.hasID3v2Tag()) {
            AbstractID3v2 tag = mp3file.getID3v2Tag();
            String songTitle = tag.getSongTitle();
            String leadArtist = tag.getLeadArtist();
            String albumTitle = tag.getAlbumTitle();
            System.out.println(albumTitle);
            System.out.println(songTitle);
            System.out.println(leadArtist);
        } else
            System.out.println("Brak tagów dla wybranego utworu");
    }
}
