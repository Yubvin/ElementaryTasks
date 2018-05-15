package com.testgroupid.elementarytasks.numericalsequence;

public class App {

    public void execute(String[] args){

        Validator validator = new Validator();
        NumericalSequence numericalSequence;
        try {
            numericalSequence = validator.getValidatedNumSequenceFrom(args);
            numericalSequence.show();
        }catch (NumberFormatException e){
            System.out.println("Invalid input " + "(" + e.getMessage() + ")");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main( String[] args )
    {
        new App().execute(args);
    }
}
