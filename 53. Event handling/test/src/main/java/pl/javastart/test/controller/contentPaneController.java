package pl.javastart.test.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class contentPaneController {

    @FXML
    private Button clearButton;

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    public void initialize() {
        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent -> reverseTextArea(inputTextArea, outputTextArea));
        outputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent -> reverseTextArea(outputTextArea, inputTextArea));

        clearButton.setOnAction(actionEvent -> {
            inputTextArea.clear();
            outputTextArea.clear();
        });
    }
    private void reverseTextArea (TextArea source, TextArea target) {
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }
}
