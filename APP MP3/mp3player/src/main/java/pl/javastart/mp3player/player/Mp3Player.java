package pl.javastart.mp3player.player;

import javafx.collections.ObservableList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import pl.javastart.mp3player.mp3.Mp3Song;

import java.io.File;

public class Mp3Player {
    private ObservableList<Mp3Song> songList;
    private Media media;
    private MediaPlayer mediaPlayer;

    public Mp3Player(ObservableList<Mp3Song> songList) {
        this.songList = songList;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void play() {
        if (mediaPlayer != null && (mediaPlayer.getStatus() == MediaPlayer.Status.READY) || mediaPlayer.getStatus() == MediaPlayer.Status.PAUSED) {
            mediaPlayer.play();
        }
    }

    public void stop() {
        if (mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            mediaPlayer.pause();
        }
    }

    public double getLoadedSongLength() {
        if (media != null) {
            return media.getDuration().toSeconds();
        } else {
            return 0;
        }
    }

    public void loadSong (int index) {
        if (mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            mediaPlayer.stop();
        }
        Mp3Song mp3s = songList.get(index);
        media = new Media(new File(mp3s.getFilePath()).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.statusProperty().addListener((observableValue, oldStatus, newStatus) -> {
            if (newStatus == MediaPlayer.Status.READY) {
                mediaPlayer.setAutoPlay(true);
            }
        });
    }
}
