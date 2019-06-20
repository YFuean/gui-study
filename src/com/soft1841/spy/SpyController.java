package com.soft1841.spy;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class SpyController {
    @FXML
    private FlowPane spyPane;

    @FXML
    private VBox bossBox;

    @FXML
    private VBox bossBox1;

    public void showPrincess(){
        //移除之前的所有内容
        ObservableList<Node> list = spyPane.getChildren();
        spyPane.getChildren().removeAll(list);
        //..面板可见，..面板隐藏
        spyPane.setVisible(true);
        bossBox.setVisible(false);
        //创建特工数组
        Spy[] spise = new Spy[] {
                new Spy("爱洛","princess1.jpg"),
                new Spy("白雪","princess2.jpg"),
                new Spy("贝儿","princess3.jpg"),
                new Spy("花木兰","princess4.jpg"),
                new Spy("茉莉","princess5.jpg"),
                new Spy("仙杜瑞拉","princess6.jpg"),
        };
        for (Spy spy:spise) {
            //给每个特工对象创建一个容器，用来来放名字和头像
            VBox vBox = new VBox();
            //创建文本组件，同时将歌手名字作为文本内容
            Label nameLabel = new Label(spy.getName());
            //创建图片组件
            Image image = new Image("/img/" +spy.getAvatar());
            ImageView imageView = new ImageView(image);
            vBox.getChildren().add(imageView);
            vBox.getChildren().add(nameLabel);

            spyPane.getChildren().add(vBox);
        }
    }

    public void showBoss1(){
        //移除之前的所有内容
        ObservableList<Node> list = bossBox1.getChildren();
        bossBox1.getChildren().removeAll(list);
        //..面板可见，..面板隐藏
        spyPane.setVisible(true);
        bossBox1.setVisible(false);

        Image image = new Image("/img/boss.jpg");
        ImageView imageView = new ImageView(image);
        Label nameLabel = new Label("BOSS");

        VBox vBox = new VBox();
        vBox.getChildren().add(imageView);
        vBox.getChildren().add(nameLabel);

        bossBox1.getChildren().add(vBox);
    }

    public void showBoss(){
        ObservableList<Node> list = bossBox.getChildren();
        bossBox.getChildren().removeAll(list);
        spyPane.setVisible(false);
        bossBox.setVisible(true);

        Boss boss = new Boss("猪小弟","BOSS",
                "http://www.kugou.com/song-36/2bjhe2.html#hash=E2A1B11EF03DEFC9694D008487FAC878&album_id=0",
                "voice.png",
                "02:30");
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setMinWidth(700);
        hBox.setPadding(new Insets(20,20,20,20));
        Image image = new Image("/img/voice.png");
        ImageView imageView = new ImageView(image);
        //设置图片鼠标悬停样式：手型
        imageView.setStyle("-fx-cursor: hand;");
        //点击图片通过webview加载音乐网址
        imageView.setOnMouseClicked(event -> {
            Stage stage = new Stage();
            stage.setTitle("BOSS留言");
            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            webEngine.load(boss.getBossUrl());
            Scene scene = new Scene(webView,100,600);
            stage.setScene(scene);
            stage.show();
        });

        Label bossNameLabel = new Label(boss.getBossName());
        Label timeLabel = new Label(boss.getTime());
        Label singerNameLabel = new Label(boss.getSinger());
        hBox.getChildren().addAll(imageView,bossNameLabel,timeLabel,singerNameLabel);
        bossBox.getChildren().add(hBox);
    }
}