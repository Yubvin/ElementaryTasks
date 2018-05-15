package com.testgroupid.elementarytasks.numericalsequence;

import java.io.InputStream;

public class Validator {

    private int validNumber;

    private void validate(String[] args) throws IllegalArgumentException{
        if(args.length == 0){
            throw new IllegalArgumentException("Enter an integer n as command line argument");
        }

        if(args.length == 1){
            validNumber = Integer.parseInt(args[0]);
        }

        if(args.length > 1){
            throw new IllegalArgumentException("There are too many arguments!");
        }
    }

    NumericalSequence getValidatedNumSequenceFrom(String[] args) throws IllegalArgumentException{

        validate(args);

        return new NumericalSequence(validNumber);
    }
}
