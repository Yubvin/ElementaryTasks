package com.testgroupid.elementarytasks.envelope;

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
        System.out.println("\nDo you want to enter one more Envelopes?Type y"
                + " or yes if you do.");
        String answer = readInputLine();
        return !(answer.equals("y") ||
                answer.equals("yes"));
    }

    public String[] getArgumentsFromInput(){
        String[] args = new String[4];
        System.out.println("Please, enter a width of the first envelope:");
        args[0] = readInputLine();

        System.out.println("Please, enter a height of the first envelope:");
        args[1] = readInputLine();

        System.out.println("Please, enter a width of the second envelope:");
        args[2] = readInputLine();

        System.out.println("Please, enter a height of the second envelope:");
        args[3] = readInputLine();

        return args;
    }

    private String readInputLine(){
        return input.nextLine();
    }

}
