module examplecss {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.app.main to javafx.graphics;
    opens pl.javastart.app.controller to javafx.fxml;
}