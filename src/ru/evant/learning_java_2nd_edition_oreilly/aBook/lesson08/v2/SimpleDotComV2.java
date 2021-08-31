package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v2;

import java.util.ArrayList;

public class SimpleDotComV2 {
    // int[] locationCells;
    // int numOfHits = 0;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> location) {   //int[] location) {
        locationCells = location;
    }

    /*
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
     */

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
