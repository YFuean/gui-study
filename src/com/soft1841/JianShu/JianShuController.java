package com.soft1841.JianShu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class JianShuController implements Initializable {
    @FXML
    private Button write;
    @FXML
    private Button follow1;
    @FXML
    private Button follow2;
    @FXML
    private Button follow3;
    @FXML
    private Button follow4;
    @FXML
    private Button follow5;
    @FXML
    private Button change;

    @FXML
    private Button comment1;
    @FXML
    private Button comment2;
    @FXML
    private Button comment3;

    @FXML
    private Button like1;
    @FXML
    private Button like2;
    @FXML
    private Button like3;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image btnImg = new Image("/img/feather.png");
        ImageView imageView = new ImageView(btnImg);
        write.setGraphic(imageView);

        Image plus1 = new Image("/img/plus.png");
        ImageView plusView1 = new ImageView(plus1);
        follow1.setGraphic(plusView1);
        Image plus2 = new Image("/img/plus.png");
        ImageView plusView2 = new ImageView(plus2);
        follow2.setGraphic(plusView2);
        Image plus3 = new Image("/img/plus.png");
        ImageView plusView3 = new ImageView(plus3);
        follow3.setGraphic(plusView3);
        Image plus4 = new Image("/img/plus.png");
        ImageView plusView4 = new ImageView(plus4);
        follow4.setGraphic(plusView4);
        Image plus5 = new Image("/img/plus.png");
        ImageView plusView5 = new ImageView(plus5);
        follow5.setGraphic(plusView5);

        Image changeImg =new Image("/img/change.png");
        ImageView changeView = new ImageView(changeImg);
        change.setGraphic(changeView);

        Image commentImg1 = new Image("/img/comment.png");
        ImageView commentView1 = new ImageView(commentImg1);
        comment1.setGraphic(commentView1);
        Image commentImg2 = new Image("/img/comment.png");
        ImageView commentView2 = new ImageView(commentImg2);
        comment2.setGraphic(commentView2);
        Image commentImg3 = new Image("/img/comment.png");
        ImageView commentView3 = new ImageView(commentImg3);
        comment3.setGraphic(commentView3);


        Image likeImg1 = new Image("/img/heart.png");
        ImageView likeView1 = new ImageView(likeImg1);
        like1.setGraphic(likeView1);
        Image likeImg2 = new Image("/img/heart.png");
        ImageView likeView2 = new ImageView(likeImg2);
        like2.setGraphic(likeView2);
        Image likeImg3 = new Image("/img/heart.png");
        ImageView likeView3 = new ImageView(likeImg3);
        like3.setGraphic(likeView3);

    }
}
