package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.tutorial_v2.example03;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JavaFXApp3_1 extends Application {

    String defaultText = "Текст по умолчанию";
    String contentText = "Привет!";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text(defaultText);

        Button btn1 = new Button("Сказать, 'привет'");
        btn1.setAlignment(Pos.CENTER);
        btn1.setOnAction(event -> {
            text.setText(contentText);
            System.out.println("Log: Нажата кнопка btn1");
        });

        Button btn2 = new Button("Очистить");
        btn2.setAlignment(Pos.CENTER);
        btn2.setOnAction(event -> {
            text.setText("");
            System.out.println("Log: Нажата кнопка btn2");
        });

        VBox root = new VBox();
        root.getChildren().addAll(btn1, btn2, text);

        RotateTransition rt = new RotateTransition(Duration.seconds(2), btn2);
        rt.setFromAngle(0);
        rt.setToAngle(360);
        rt.setCycleCount(3);
        rt.play();

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Привет!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
