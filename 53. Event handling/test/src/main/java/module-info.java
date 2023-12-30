module test {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.test.main to javafx.graphics;
    opens pl.javastart.test.controller to javafx.fxml;
}