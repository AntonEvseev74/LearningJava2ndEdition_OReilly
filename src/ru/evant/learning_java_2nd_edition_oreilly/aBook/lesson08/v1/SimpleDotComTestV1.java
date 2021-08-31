package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v1;

public class SimpleDotComTestV1 {
    public static void main(String[] args) {
        SimpleDotComV1 dot = new SimpleDotComV1();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        System.out.println(result);
    }
}
