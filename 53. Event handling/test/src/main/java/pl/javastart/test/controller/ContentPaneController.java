package pl.javastart.test.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ContentPaneController {

    @FXML
    private Button clearButton;
    @FXML
    private TextPaneController textPaneController;

    public void initialize() {
        var inputTextArea = textPaneController.getInputTextArea();
        var outputTextArea = textPaneController.getOutputTextArea();

        clearButton.setOnAction(actionEvent -> {
            inputTextArea.clear();
            outputTextArea.clear();
        });
    }
}
