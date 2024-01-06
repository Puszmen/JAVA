package pl.javastart.fxbrowser;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    private Button backButton;

    @FXML
    private WebView mainWebView;

    @FXML
    private Button nextButton;

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/browserPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Przeglądarka");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void initialize() {
        WebEngine engine = mainWebView.getEngine();
        engine.load("https://www.google.com/");
        nextButton.setOnAction(actionEvent -> engine.executeScript("history.forward();"));
        backButton.setOnAction(actionEvent -> engine.executeScript("history.back();"));
    }
}
