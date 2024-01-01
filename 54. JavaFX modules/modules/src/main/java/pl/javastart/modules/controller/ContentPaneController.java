package pl.javastart.modules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ContentPaneController {

    @FXML
    private TextArea mainTextArea;

    public TextArea getMainTextArea() {
        return mainTextArea;
    }
}
