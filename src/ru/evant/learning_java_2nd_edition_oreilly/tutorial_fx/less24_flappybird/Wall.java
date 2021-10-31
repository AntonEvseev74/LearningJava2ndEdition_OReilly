package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.less24_flappybird;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Wall extends Pane {
    Rectangle rect;
    public int height;

    public Wall (int height) {
        this.height = height;
        rect = new Rectangle(20, height);
        getChildren().add(rect);
    }
}
