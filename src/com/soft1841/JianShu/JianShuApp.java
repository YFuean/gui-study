package com.soft1841.JianShu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class JianShuApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("简书");
        Scene scene = new Scene(root,1800,950);
        scene.getStylesheets().add(JianShuApp.class.getResource("style.css").toExternalForm());

        primaryStage.getIcons().add(new Image("/img/logo.png"));


        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
