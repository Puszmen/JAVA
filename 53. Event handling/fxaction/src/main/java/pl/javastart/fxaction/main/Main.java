package pl.javastart.fxaction.main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
        Scene scene = new Scene(mainPane);

//        scene.setOnMouseEntered(mouseEvent -> System.out.println("Najechano kursorem na scenę"));
//        scene.setOnMouseExited(mouseEvent -> System.out.println("Kursor opuścił scenę"));

        scene.addEventFilter(MouseEvent.MOUSE_ENTERED, mouseEvent ->
                System.out.println("Kursor najechał na scenę"));
        scene.addEventFilter(MouseEvent.MOUSE_EXITED, mouseEvent ->
                System.out.println("Kursor opuścił scenę"));
        scene.addEventFilter(KeyEvent.KEY_PRESSED, keyEvent ->
                System.out.println("Klawiatura"));

        stage.setScene(scene);
        stage.setTitle("Event example");
        stage.show();
    }
}
