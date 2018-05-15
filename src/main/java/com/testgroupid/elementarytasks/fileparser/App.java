package com.testgroupid.elementarytasks.fileparser;

import java.io.FileNotFoundException;
import java.io.IOException;


public class App {

    public static void execute(String[] args){

        Validator validator = new Validator();
        FileParser fileParser = null;
        try{
            fileParser = validator.getValidatedFileParser(args);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (FileNotFoundException e){
            System.out.println("Invalid file path : " + e.getMessage());
        }

        if(args.length == 2 && fileParser != null){
            System.out.println("The \"" + args[1] + "\" string occurs " + fileParser.countOf(args[1]) + " times");
        }

        if(args.length == 3 && fileParser != null){
            try {
                fileParser.replaceAll(args[1], args[2]);
                System.out.println("Done.Check out the file!");
            }catch (IOException e){
                System.out.println("Issue with the file : " + e.getMessage());
            }
        }
    }

    public static void main( String[] args )
    {
        App.execute(args);
    }
}
