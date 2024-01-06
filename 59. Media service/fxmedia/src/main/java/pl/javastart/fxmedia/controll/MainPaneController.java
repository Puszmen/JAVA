package pl.javastart.fxmedia.controll;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
public class MainPaneController {

    @FXML
    private MediaView mediaView;

    @FXML
    private Button playButton;

public void initialize() {
        Media media = new Media("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaPlayer.setOnError(() -> System.out.println("Error " + mediaPlayer.getError()));
        System.out.println(media.getDuration());
        playButton.setText("pause");

        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (mediaPlayer.getStatus() == MediaPlayer.Status.READY || mediaPlayer.getStatus() == MediaPlayer.Status.PAUSED) {
                    mediaPlayer.play();
                    playButton.setText("pause");
                } else {
                    mediaPlayer.pause();
                    playButton.setText("play");
                }
            }
        });

    }

}
