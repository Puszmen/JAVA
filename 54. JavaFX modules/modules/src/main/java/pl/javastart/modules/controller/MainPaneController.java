package pl.javastart.modules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPaneController {
    @FXML
    private ControlPaneController controlPaneController;
    @FXML
    private ContentPaneController contentPaneController;

    public void initialize() {
        Button lowerCaseButton = controlPaneController.getLowerCaseButton();
        Button upperCaseButton = controlPaneController.getUpperCaseButton();
        TextArea mainTextArea = contentPaneController.getMainTextArea();

        lowerCaseButton.setOnAction(actionEvent -> mainTextArea.setText(mainTextArea.getText().toLowerCase()));
        upperCaseButton.setOnAction(actionEvent -> mainTextArea.setText(mainTextArea.getText().toUpperCase()));
    }

}
