package com.testgroupid.elementarytasks.trianglesorter;

import java.io.InputStream;
import java.util.Scanner;

public class UserConsoleInput {
    Scanner input;

    UserConsoleInput(){
        input = new Scanner(System.in);
    }

    UserConsoleInput(InputStream inputStream){
        input = new Scanner(inputStream);
    }

    public boolean isEnd(){
        System.out.println("\nDo you want to enter one more Triangle?Type y"
                + " or yes if you do.");
        String answer = readInputLine();
        return !(answer.equals("y") ||
                answer.equals("yes"));
    }

    public String[] getArgumentsFromInput(){
        System.out.println("\nPlease, enter the name of a triangle and its "
                + "sides in centimeters, separating them by commas:");
        return readInputLine().split("\\,");
    }

    private String readInputLine(){
        return input.nextLine().toLowerCase().replaceAll("\\s+", "");
    }

}
