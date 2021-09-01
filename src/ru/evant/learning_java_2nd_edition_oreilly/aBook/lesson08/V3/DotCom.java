package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.V3;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locationCells){
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourSelf(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + this.name + "   :( ");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
