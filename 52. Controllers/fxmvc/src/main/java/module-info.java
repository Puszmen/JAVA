module fxmvc {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.mvc to javafx.graphics;
    opens pl.javastart.mvc to javafx.fxml;
}