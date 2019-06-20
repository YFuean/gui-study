package com.soft1841.sample2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SingerApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //读入外部的fxml布局文件
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        //给舞台设置标题
        primaryStage.setTitle("歌手");
        //创建场景，并将外部读入的布局文件的根节点加入其中
        Scene scene = new Scene(root,1000,600);
        //将外部的样式表读入
        scene.getStylesheets().add(SingerApp.class.getResource("style.css").toExternalForm());
        //场景加入舞台，并可见
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) { launch(args); }
}
