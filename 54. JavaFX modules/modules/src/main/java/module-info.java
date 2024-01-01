module modules {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports pl.javastart.modules.main to javafx.graphics;
    opens pl.javastart.modules.controller to javafx.fxml;
}