module fxmedia {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;

    exports pl.javastart.fxmedia.main to javafx.graphics;
    opens pl.javastart.fxmedia.controll to javafx.fxml;

}