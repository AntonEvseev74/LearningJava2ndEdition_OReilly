package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v1;

public class SimpleDotComV1 {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] location) {
        locationCells = location;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        return result;
    }
}
