package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button previousButton;

    @FXML
    private Slider progressSlider;

    @FXML
    private Slider volumeSlider;

    public void initialize() {
        configureVolume();
        configureButtons();
    }

    private void configureButtons() {
        nextButton.setOnAction(actionEvent -> System.out.println("Następna piosenka"));
        previousButton.setOnAction(actionEvent -> System.out.println("Poprzednia piosenka"));
        playButton.setOnAction(actionEvent -> {
            if (playButton.isSelected())
                System.out.println("Play");
            else
                System.out.println("Pause");
        });
    }

    private void configureVolume() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED,
                mouseEvent -> System.out.println("Wciśnięto przycisk głośności"));
    }

}
