package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;

public class MainController {
    @FXML
    private ControlPaneController controlPaneController;
    @FXML
    private ContentPaneController contentPaneController;
    @FXML
    private MenuPaneController menuPaneController;

    public void initialize() {
        System.out.println("Main pane controller created");
        System.out.println(controlPaneController);
        System.out.println(contentPaneController);
        System.out.println(menuPaneController);
    }
}
