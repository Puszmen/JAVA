package pl.javastart.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Label usernameLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button loginButton;

    public void initialize() {
        usernameTextField.setText("Tekst z kontrolera");
        loginButton.setText("Kliknij mnie !");
    }
}
