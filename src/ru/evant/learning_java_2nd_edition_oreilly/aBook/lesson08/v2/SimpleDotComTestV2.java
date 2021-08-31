package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v2;

import java.util.ArrayList;

public class SimpleDotComTestV2 {
    public static void main(String[] args) {
        SimpleDotComV2 dot = new SimpleDotComV2();

        //int[] locations = {2,3,4};
        ArrayList locations = new ArrayList();
        locations.add(2);
        locations.add(3);
        locations.add(4);
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        System.out.println(result);
    }
}
