package pl.javastart.fxaction.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneController {

    @FXML
    private Button lowerCaseButton;

    @FXML
    private TextArea mainTextArea;

    public void initialize() {

    }
    @FXML
    private void toLowerCaseAction(ActionEvent action) {
        System.out.println("Wciśnięto przycisk");
        System.out.println(action.getEventType());
        String originalText = mainTextArea.getText();
        String lowerCaseText = originalText.toLowerCase();
        mainTextArea.setText(lowerCaseText);
    }
}
