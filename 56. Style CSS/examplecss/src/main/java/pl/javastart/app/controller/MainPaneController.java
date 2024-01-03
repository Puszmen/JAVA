package pl.javastart.app.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPaneController {

    @FXML
    private Button clearButton;

    @FXML
    private TextArea mainTextArea;

    public void initialize() {
        clearButton.setOnAction(actionEvent -> {
            System.out.println("Tekst wyczyszczono");
            mainTextArea.clear();
        });
    }
}
