package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.tutorial_v2.example03;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JavaFXApp3_3 extends Application {

    String defaultText = "Текст по умолчанию";
    String contentText = "Привет!";

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();

        Text text = new Text(defaultText);
        text.setTranslateX(100);
        text.setTranslateY(130);

        Button btn1 = new Button("Сказать, 'привет'");
        btn1.setAlignment(Pos.CENTER);
        btn1.setTranslateX(100);
        btn1.setTranslateY(80);
        btn1.setOnAction(event -> {
            text.setText(contentText);
            System.out.println("Log: Нажата кнопка btn1");
        });

        Button btn2 = new Button("Очистить");
        btn2.setAlignment(Pos.CENTER);
        btn2.setTranslateX(120);
        btn2.setTranslateY(100);
        btn2.setOnAction(event -> {
            text.setText("");
            System.out.println("Log: Нажата кнопка btn2");
            rotate(2,root,2);
        });

        root.getChildren().addAll(btn1, btn2, text);
        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Привет!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void rotate(int second, Node node, int count) {
        RotateTransition rt = new RotateTransition(Duration.seconds(second), node);
        rt.setFromAngle(0);
        rt.setToAngle(360);
        rt.setCycleCount(count);
        rt.setAutoReverse(true);
        rt.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
