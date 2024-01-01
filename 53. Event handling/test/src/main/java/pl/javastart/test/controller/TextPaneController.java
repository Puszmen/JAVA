package pl.javastart.test.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class TextPaneController {
    @FXML
    private TextArea inputTextArea;
    @FXML
    private TextArea outputTextArea;

    public TextArea getInputTextArea() {
        return inputTextArea;
    }

    public TextArea getOutputTextArea() {
        return outputTextArea;
    }

    public void initialize() {
        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent -> reverseTextArea(inputTextArea, outputTextArea));
        outputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent -> reverseTextArea(outputTextArea, inputTextArea));
    }
    private void reverseTextArea (TextArea source, TextArea target) {
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }
}

