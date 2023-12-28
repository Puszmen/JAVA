module fxctrl {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.fxctrl.main to javafx.graphics;
    opens pl.javastart.fxctrl.controller to javafx.fxml;

}