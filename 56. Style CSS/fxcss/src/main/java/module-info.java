module fxcss {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.fxcss.app.main to javafx.graphics;
    opens pl.javastart.fxcss.app.controller to javafx.fxml;
}