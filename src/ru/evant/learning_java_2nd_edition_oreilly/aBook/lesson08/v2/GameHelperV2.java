package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelperV2 {
    public String getUserInput (String promt){
        String inputLine = null;
        System.out.println(promt + "  ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOExeption: " + e);
        }
        return inputLine;
    }
}
