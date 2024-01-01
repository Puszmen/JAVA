module modules {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports pl.javastart.modules.main to javafx.graphics;
    opens pl.javastart.modules.control to javafx.fxml;
}