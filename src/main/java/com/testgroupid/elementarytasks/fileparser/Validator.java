package com.testgroupid.elementarytasks.fileparser;

import java.io.FileNotFoundException;

/**
 * The Validator class
 */
public class Validator {

    private FileParser validFileParser;

    private void validate(String[] args) throws IllegalArgumentException, FileNotFoundException {
        if(args.length == 0){
            throw new IllegalArgumentException("The valid command arguments are:\n" +
                    "\t<filepath><string for counting>\n" +
                    "OR\n" +
                    "\t<filepath><string to be replaced><string to replace>");
        }

        if(args.length < 2){
            throw new IllegalArgumentException("There are too few arguments!");
        }

        if(args.length == 2 || args.length == 3){
            validFileParser = new FileParser(args[0]);
            validFileParser.parse();
        }

        if(args.length > 3){
            throw new IllegalArgumentException("There are too many arguments!");
        }
    }

    FileParser getValidatedFileParser(String[] args) throws IllegalArgumentException, FileNotFoundException {

        validate(args);

        return validFileParser;
    }
}
