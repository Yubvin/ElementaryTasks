package com.testgroupid.elementarytasks.fibonacci;

public class Validator {
    private int validBeginInd;
    private int validEndInd;

    private void validate(String[] args) throws IllegalArgumentException{
        if(args.length == 0){
            throw new IllegalArgumentException("Enter the range in a form of two parameters as the arguments");
        }

        if(args.length == 1){
            throw new IllegalArgumentException("There are too few arguments!");
        }

        if(args.length == 2){
            validBeginInd = Integer.parseInt(args[0]);
            validEndInd = Integer.parseInt(args[1]);

            if(validBeginInd < 1 || validEndInd < 1) throw new IllegalArgumentException("Parameters must be greater than 1!");

            if(validEndInd - validBeginInd <= 0) throw new IllegalArgumentException("Enter valid range!");
        }

        if(args.length > 2){
            throw new IllegalArgumentException("There are too many arguments!");
        }
    }

     Fibonacci getValidatedFibanacciFrom(String[] args) throws IllegalArgumentException{

        validate(args);

        return new Fibonacci(validBeginInd, validEndInd);
    }
}
