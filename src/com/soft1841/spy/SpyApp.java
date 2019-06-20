package com.soft1841.spy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SpyApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //读入外部的fxml布局文件
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        //给舞台设置标题
        primaryStage.setTitle("特工名单");
        //创建场景，并将外部读入的布局文件的根节点加入其中
        Scene scene = new Scene(root,1000,600);
        //将外部的样式表读入
        scene.getStylesheets().add(SpyApp.class.getResource("style.css").toExternalForm());
        //场景加入舞台，并可见
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
