package com.soft1841.sample2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class SingerController {
    @FXML
    private FlowPane singerPane;
    public void showAll(){
        //创建歌手数组
        Singer[] singers = new Singer[]{
                new Singer("歌手排行榜","singer0.png"),
                new Singer("薛之谦","singer1.png"),
                new Singer("花粥","singer2.png"),
                new Singer("陈奕迅","singer3.png"),
                new Singer("林俊杰","singer4.png"),
                new Singer("邓紫棋","singer5.png"),
                new Singer("林宥嘉","singer6.png"),
                new Singer("王贰浪","singer7.png"),
        };
        for (Singer singer:singers) {
            //给每个歌手对象创建一个容器，用来来放名字和头像
            BorderPane borderPane = new BorderPane();
            //创建文本组件，同时将歌手名字作为文本内容
            Label nameLabel = new Label(singer.getName());
            //创建图片组件
            Image image = new Image("/img/" +singer.getAvatar());
            ImageView imageView = new ImageView(image);
            borderPane.setCenter(imageView);
            borderPane.setBottom(nameLabel);

            singerPane.getChildren().add(borderPane);
        }
    }
}
