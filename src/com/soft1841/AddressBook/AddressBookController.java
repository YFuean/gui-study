package com.soft1841.AddressBook;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class AddressBookController implements Initializable {
    @FXML
    private ComboBox<String> genderAndDormBox;
    @FXML
    private ListView<VBox> addressBookListView;
    @FXML
    private TextField keywordsField;

    Contact[] contacts ={
            new Contact("汤萌慧","江苏南通","17826020148",
                    "tx1.jpg","女","346"),
            new Contact("曾月","江苏宿迁","17826022173",
                    "tx2.jpg","女","346"),
            new Contact("王欢乐","甘肃平凉","17748986841",
                    "tx3.jpg","女","346"),
            new Contact("夏铭慧","江苏宿迁","13218926189",
                    "tx4.jpg","女","346"),
            new Contact("徐鹏","江苏宿迁","13585099125",
                    "tx5.jpg","男","113"),
            new Contact("孟妮","安徽宿州","15556224828",
                    "tx6.jpg","女","346"),
            new Contact("蔡一帆","江苏南通","18251384353",
                    "tx7.jpg","男","114"),
            new Contact("陈宇航","江苏常州","18932386185",
                    "tx8.jpg","男","114"),
            new Contact("柳磊磊","甘肃庆阳","18793403808",
                    "tx9.jpg","男","112"),
    };
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        genderAndDormBox.getItems().setAll("男","女","112","113","114","115","116","346","347");
        for (Contact contact:contacts) {
            HBox hBox = new HBox();
            hBox.setSpacing(20);
            Image image = new Image("/img/" + contact.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox.getChildren().add(imageView);
            Label labelName = new Label(contact.getName());
            hBox.getChildren().add(labelName);

            VBox vBox = new VBox();
            vBox.getChildren().add(hBox);
            addressBookListView.getItems().add(vBox);
        }

        genderAndDormBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                search(newValue);
            }
        });
    }

    public void search(String keywords){
        ObservableList<VBox> list = addressBookListView.getItems();
        addressBookListView.getItems().removeAll(list);

        for (Contact contact : contacts) {
            HBox hBox1 = new HBox();
            hBox1.setSpacing(20);
            Image image = new Image("/img/" + contact.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox1.getChildren().add(imageView);

            Label labelName = new Label(contact.getName());
            hBox1.getChildren().add(labelName);

            Label labelGender = new Label(contact.getGender());
            hBox1.getChildren().add(labelGender);

            Label labelAddress = new Label(contact.getAddress());
            hBox1.getChildren().add(labelAddress);

            Label labelPhone = new Label(contact.getPhoneNumber());
            hBox1.getChildren().add(labelPhone);

            Label labelDorm = new Label(contact.getDormID());
            hBox1.getChildren().add(labelDorm);

            VBox vBox1 = new VBox();
            vBox1.getChildren().add(hBox1);
            if (contact.getGender().contains(keywords)) {
                addressBookListView.getItems().add(vBox1);
            }
            if (contact.getDormID().contains(keywords)){
                addressBookListView.getItems().add(vBox1);
            }

        }

    }

    public void enter(){
        keywordsField.setText("");
    }
    public void searchByKeywords(){
        ObservableList<VBox> list = addressBookListView.getItems();
        addressBookListView.getItems().removeAll(list);
        String keywords =keywordsField.getText().trim();
        for (Contact contact:contacts) {
            HBox hBox2 = new HBox();
            hBox2.setSpacing(20);
            Image image = new Image("/img/" + contact.getAvatar());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox2.getChildren().add(imageView);

            Label labelName = new Label(contact.getName());
            hBox2.getChildren().add(labelName);

            Label labelGender = new Label(contact.getGender());
            hBox2.getChildren().add(labelGender);

            Label labelAddress = new Label(contact.getAddress());
            hBox2.getChildren().add(labelAddress);

            Label labelPhone = new Label(contact.getPhoneNumber());
            hBox2.getChildren().add(labelPhone);

            Label labelDorm = new Label(contact.getDormID());
            hBox2.getChildren().add(labelDorm);

            VBox vBox2 = new VBox();
            vBox2.getChildren().add(hBox2);

            if (contact.getAddress().contains(keywords)){
                addressBookListView.getItems().add(vBox2);
            }
            if (contact.getName().contains(keywords)){
                addressBookListView.getItems().add(vBox2);
            }
        }
    }
    @FXML
    private BorderPane mainContainer;
    public void showCardOne() throws Exception{
        Parent cardOne = FXMLLoader.load(getClass().getResource("card1.fxml"));
        mainContainer.setCenter(cardOne);
    }
}
