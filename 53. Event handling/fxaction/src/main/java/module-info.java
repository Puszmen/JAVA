module fxaction {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports pl.javastart.fxaction.main to javafx.graphics;
    opens pl.javastart.fxaction.controller to javafx.fxml;
}