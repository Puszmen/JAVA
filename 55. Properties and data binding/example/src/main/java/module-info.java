module example {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports main to javafx.graphics;
    opens main to javafx.fxml;
}