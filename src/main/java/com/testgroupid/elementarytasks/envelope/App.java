package com.testgroupid.elementarytasks.envelope;

public class App {
    public void execute(){

        UserConsoleInput userConsoleInput = new UserConsoleInput();
        Validator validator = new Validator();
        Envelope[] envelopes;

        do{
            String[] args = userConsoleInput.getArgumentsFromInput();

            try {
                envelopes = validator.getValidatedEnvelopes(args);

                if (Envelope.isNested(envelopes[0], envelopes[1])) {
                    System.out.println("You can put one envelope to another");
                } else {
                    System.out.println("Sorry, you can't put one envelope into another");
                }
            }catch (NumberFormatException e){
                System.out.println("Values must be double!");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while (!userConsoleInput.isEnd());
    }

    public static void main(String[] args){
        new App().execute();
    }
}
