package pl.javastart.hellofxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainHelloFx extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane mainPaine = FXMLLoader.load(getClass().getResource("/helloFxml.fxml"));
        Scene scene = new Scene(mainPaine);
        stage.setScene(scene);
        stage.show();
    }
}
