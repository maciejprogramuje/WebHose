package pl.maciejprogramuje.webhose;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String APP_VERSION = "0.1";
    public static final String APP_NAME = "WebIO";
    public static final String API_KEY = "5e4f2b3f-7b67-4646-b8ca-a661bc1be8c0";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
        primaryStage.setTitle(APP_NAME + " " + APP_VERSION);
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
