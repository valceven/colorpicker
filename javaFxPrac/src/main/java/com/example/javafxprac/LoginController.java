package com.example.javafxprac;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class LoginController {

    public GridPane pnLogin;
    public AnchorPane pnMain;
    public VBox pnHome;
    public TextField username;
    public PasswordField password;
    @FXML
    public Label welcomeText;
    public void onSignInClick() throws IOException {
        Parent homeview = FXMLLoader.load(LoginApplication.class.getResource("home-view.fxml"));



        if(username.getText().toString().equals("valceven") && password.getText().toString().equals("gwapo") ||
                username.getText().toString().equals("keiru") && password.getText().toString().equals("cabili") ||
                username.getText().toString().equals("mars") && password.getText().toString().equals("benitez")){
            AnchorPane pane = (AnchorPane) pnHome.getParent();
            pnMain.getScene().getStylesheets().clear();
            pnMain.getScene().getStylesheets().add(getClass().getResource("hello.css").toExternalForm());
            pane.getChildren().remove(pnHome);
            pane.getChildren().add(homeview);

        }else{
            welcomeText.setText("WRONG");
        }

    }
}