package ru.evant.learning_java_2nd_edition_oreilly.tutorial_fx.tutorial_v1.less20_gamemenu2.image;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;

public class BackgroundImage extends Pane {

    public BackgroundImage(String path) throws Exception{
        Image image = new Image(new FileInputStream(path));
        ImageView img = new ImageView(image);
        img.setFitWidth(900);
        img.setFitHeight(600);
        getChildren().addAll(img);
    }
}
