package com.example.javafxprac;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import jdk.internal.icu.util.CodePointMap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HomeController {

    public AnchorPane homeview;
    public VBox pnHome;
    public GridPane pnLogOut;

    public ColorPicker cpPicker;

    public void onSignOutClick() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("home-view.fxml"));

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("hello.css").getPath()));
            bw.write(".root { -fx-background-image: url(\"backg.jpg\"); }");
            bw.newLine();
            bw.write(".button { -fx-background-color: #" + cpPicker.getValue().toString().substring(2,8) + "; }");
            bw.close();
        }catch (IOException e){}

        Parent pnMain = FXMLLoader.load(LoginApplication.class.getResource("login-view.fxml"));
        AnchorPane pane = (AnchorPane) pnHome.getParent();
        pane.getChildren().remove(pnHome);
        pane.getChildren().add(pnMain);

    }
}
