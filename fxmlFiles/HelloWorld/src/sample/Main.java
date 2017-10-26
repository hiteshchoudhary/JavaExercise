package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setHgap(10);
//        root.setVgap(10);



        primaryStage.setTitle("** Avengers **");
        primaryStage.setScene(new Scene(root, 600, 300));

//        Label hello = new Label("Hello World");
//        root.getChildren().add(hello);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
