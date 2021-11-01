package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.tutorial_v2.example05;

// Анимация
// Разлет из центра некоторого количества(NUM) объектов в разные стороны
// с использованием AnimationTimer

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class JavaFXApp5_2 extends Application {

    static final int NUM = 50000; // количество
    final Rectangle[] rectangles = new Rectangle[NUM]; // массив фигур
    final double[] alfa = new double[NUM]; // массив углов
    final Random random = new Random();

    @Override
    public void start(Stage primaryStage) throws Exception {
        for (int i = 0; i < NUM; i++) {
            rectangles[i] = new Rectangle(3, 3, Color.RED);
            alfa[i] = random.nextDouble() * 2 * Math.PI;
        }

        Scene scene = new Scene(new Group(rectangles), 600, 600, Color.BLUE);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Анимация
        new AnimationTimer() {
            public void handle(long now) {
                double radius = Math.sqrt(2) * 300;
                for (int i = 0; i < NUM; i++) {
                    long t = now % 1500000000;
                    double d = t * radius / 1500000000.0;

                    rectangles[i].setTranslateX(Math.cos(alfa[i]) * d + 300);
                    rectangles[i].setTranslateY(Math.sin(alfa[i]) * d + 300);
                }
            }
        }.start();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
