package pl.javastart.mp3player.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import pl.javastart.mp3player.mp3.Mp3Song;
import pl.javastart.mp3player.player.Mp3Player;

import java.io.File;
import java.io.IOException;

public class MainController {
    @FXML
    private ControlPaneController controlPaneController;
    @FXML
    private ContentPaneController contentPaneController;
    @FXML
    private MenuPaneController menuPaneController;
    private Mp3Player player;

    public void initialize() {
        createPlayer();
        configureTableClick();
        configureButtons();
        addTestMp3();
    }

    private void createPlayer() {
        ObservableList<Mp3Song> items = contentPaneController.getContentTable().getItems();
        player = new Mp3Player(items);
    }

    private void configureTableClick() {
        TableView<Mp3Song> contentTable = contentPaneController.getContentTable();
        contentTable.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if (mouseEvent.getClickCount() == 2) {
                int selectedIndex = contentTable.getSelectionModel().getSelectedIndex();
                playSelectedSong(selectedIndex);
            }
        });
    }

    private void playSelectedSong(int selectedIndex) {
        player.loadSong(selectedIndex);
        configureProgressBar();
        configureVolume();
        controlPaneController.getPlayButton().setSelected(true);
    }

    private void configureProgressBar() {
        Slider progressSlider = controlPaneController.getProgressSlider();
        player.getMediaPlayer().setOnReady(() -> progressSlider.setMax(player.getLoadedSongLength()));
        player.getMediaPlayer().currentTimeProperty().addListener((observableValue, oldValue, newValue) -> {
            if (progressSlider.isValueChanging()) {
                player.getMediaPlayer().seek(Duration.seconds(newValue.toSeconds()));
            }
        });
        progressSlider.valueProperty().addListener((observableValue, aldValue, newValue) -> {
            if (progressSlider.isValueChanging()) {
                player.getMediaPlayer().seek(Duration.seconds(newValue.doubleValue()));
            }
        });
    }

    private void configureVolume() {
        Slider volumeSlider = controlPaneController.getVolumeSlider();
        volumeSlider.valueProperty().unbind();
        volumeSlider.setMax(1.0);
        volumeSlider.valueProperty().bindBidirectional(player.getMediaPlayer().volumeProperty());
    }

    private void configureButtons() {
        TableView<Mp3Song> contentTable = contentPaneController.getContentTable();
        ToggleButton playButton = controlPaneController.getPlayButton();
        Button nextButton = controlPaneController.getNextButton();
        Button previousButton = controlPaneController.getPreviousButton();

        playButton.setOnAction(actionEvent -> {
            if (playButton.isSelected()) {
                player.play();
            } else {
                player.stop();
            }
        });

        nextButton.setOnAction(actionEvent -> {
            contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex() + 1);
            playSelectedSong(contentTable.getSelectionModel().getSelectedIndex());
        });

        previousButton.setOnAction(actionEvent -> {
            contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex() - 1);
            playSelectedSong(contentTable.getSelectionModel().getSelectedIndex());
        });

    }

    private void addTestMp3() {
        ObservableList<Mp3Song> items = contentPaneController.getContentTable().getItems();
        Mp3Song mp3SongFromPath = createSongFromPath("Kayah - Tańcuj.mp3");
        items.add(mp3SongFromPath);
        items.add(mp3SongFromPath);
        items.add(mp3SongFromPath);
    }

    private Mp3Song createSongFromPath(String filePath) {
        File file = new File(filePath);
            try {
                MP3File mp3File = new MP3File(file);
                String absolutePath = file.getAbsolutePath();
                String title = mp3File.getID3v2Tag().getSongTitle();
                String author = mp3File.getID3v2Tag().getLeadArtist();
                String album = mp3File.getID3v2Tag().getAlbumTitle();
                return new Mp3Song(title, author, album, absolutePath);
            } catch (IOException | TagException e) {
                e.printStackTrace();
                return null;
            }
    }


}
