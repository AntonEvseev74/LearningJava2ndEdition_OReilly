package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.tutorial_v2.example05;

// Анимация
// Разлет из центра некоторого количества(NUM) объектов в разные стороны
// с использованием TimeLine
// Использует очень большое количество памяти
// При NUM > 50000, программа может зависнуть или не запуститься вовсе,
// зависит от пк на котором программа запускается

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class JavaFXApp5_1 extends Application {

    static final int NUM = 5000; // количество
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
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        double radius = Math.sqrt(2) * 300;
        double dx, dy; // смещение
        for (int i = 0; i < NUM; i++) {
            rectangles[i].setX(300);
            rectangles[i].setY(300);
            dx = Math.cos(alfa[i]) * radius + 300;
            dy = Math.sin(alfa[i]) * radius + 300;

            KeyValue kvX = new KeyValue(rectangles[i].xProperty(), dx);
            KeyFrame kfX = new KeyFrame(Duration.seconds(1),kvX);
            timeline.getKeyFrames().add(kfX);

            KeyValue kvY =new KeyValue(rectangles[i].yProperty(), dy);
            KeyFrame kfY = new KeyFrame(Duration.seconds(1),kvY);
            timeline.getKeyFrames().add(kfY);
        }
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
