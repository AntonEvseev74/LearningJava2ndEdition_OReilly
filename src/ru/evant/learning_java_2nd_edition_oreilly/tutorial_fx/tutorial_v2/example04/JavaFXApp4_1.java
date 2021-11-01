package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.tutorial_v2.example04;

import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JavaFXApp4_1 extends Application {

    String defaultText = "Текст по умолчанию";
    String contentText = "Привет!";

    Button btn1, btn2;
    Text text;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();

        text = new Text(defaultText);
        text.setTranslateX(100);
        text.setTranslateY(130);

        btn1 = new Button("Сказать, 'привет'");
        btn1.setAlignment(Pos.CENTER);
        btn1.setTranslateX(100);
        btn1.setTranslateY(80);
        btn1.setOnAction(event -> {
            myAnimation(); // 1* Анимация бегущая строка
            System.out.println("Log: Нажата кнопка btn1");
        });

        btn2 = new Button("Очистить");
        btn2.setAlignment(Pos.CENTER);
        btn2.setTranslateX(120);
        btn2.setTranslateY(100);
        btn2.setOnAction(event -> {
            text.setText("");
            System.out.println("Log: Нажата кнопка btn2");

        });

        // Создать анимацию
        // Создаем собственную анимацию
        // Animation anim = new Transition() {
        //     {
        //         setDelay(Duration.seconds(2)); // задержка анимации после запуска
        //         setCycleDuration(Duration.seconds(2)); // длительность анимации
        //     }
        //     @Override
        //     protected void interpolate(double frac) {
        //         int len = contentText.length(); // длинна строки
        //         int n = Math.round(len * (float)frac); // сколько букв будет видно
        //         text.setText(contentText.substring(0, n)); // показать символы строки с индексами от 0 до n
        //     }
        // };
        // anim.play();

        root.getChildren().addAll(btn1, btn2, text);
        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Привет!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // *1 Анимация, бегущая строка
    public void myAnimation () {
        // Создать анимацию
        // Создаем собственную анимацию
        Animation anim = new Transition() {
            {
                setDelay(Duration.seconds(2)); // задержка анимации после запуска
                setCycleDuration(Duration.seconds(2)); // длительность анимации
            }
            @Override
            protected void interpolate(double frac) {
                int len = contentText.length(); // длинна строки
                int n = Math.round(len * (float)frac); // сколько букв будет видно
                text.setText(contentText.substring(0, n)); // показать символы строки с индексами от 0 до n
            }
        };
        anim.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
