package com.testgroupid.elementarytasks.fibonacci;

import java.util.Arrays;

public class App {
    public void execute(String[] args ){
        Validator validator = new Validator();

        try {
            Fibonacci fibonacci = validator.getValidatedFibanacciFrom(args);
            System.out.println(Arrays.toString(fibonacci.getFibonacciFromRange()));
        }catch (NumberFormatException e){
            System.out.println("Invalid input " + "(" + e.getMessage() + ")");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        new App().execute(args);
    }
}
