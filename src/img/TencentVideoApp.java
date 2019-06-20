package img;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class TencentVideoApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/TencentVideo.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,800,600);
        primaryStage.setTitle("腾讯视频");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
