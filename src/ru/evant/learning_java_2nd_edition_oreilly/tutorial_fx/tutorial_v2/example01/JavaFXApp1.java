package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.tutorial_v2.example01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXApp1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        button.setText("Сказать, 'привет'");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Привет!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root,300,300);

        primaryStage.setTitle("Привет!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
