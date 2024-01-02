package pl.javastart.fxproperties.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class VolumePaneController {

    @FXML
    private Label volumeLevelLabel;

    @FXML
    private Slider volumeSlider;

    public void initialize() {
        volumeLevelLabel.textProperty().bind(volumeSlider.valueProperty().asString());
        volumeSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            Double volume = (Double) newValue;
            if (volume > 75)
                System.out.println("ZA GŁOŚNO !!");
            else if (volume < 15)
                System.out.println("ZA CICHO !!");
        } );
    }
}
