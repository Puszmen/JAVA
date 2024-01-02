package pl.javastart.fxcss.app.controller;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseButton;

import java.util.Locale;

public class MainPaneController {

    @FXML
    private Button cleanButton;

    @FXML
    private Button lowerCaseButton;

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button upperCaseButton;

    public void initialize() {
        System.out.println("Main Pane Controller created");
        buttonController();
    }
    private void buttonController() {
        cleanButton.setOnAction(actionEvent -> {
            System.out.println("Tekst usunięto");
            mainTextArea.clear();
        });
        lowerCaseButton.setOnAction(actionEvent -> {
            System.out.println("Tekst zmieniono (lower case)");
            mainTextArea.setText(mainTextArea.getText().toLowerCase());
        });
        upperCaseButton.setOnAction(actionEvent -> {
            System.out.println("Tekst zmieniono (UPPER CASE)");
            mainTextArea.setText(mainTextArea.getText().toUpperCase());
        });
    }

}
