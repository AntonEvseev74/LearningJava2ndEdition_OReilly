package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson08.v1;

import java.io.*;

public class GameHelperV1 {
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
