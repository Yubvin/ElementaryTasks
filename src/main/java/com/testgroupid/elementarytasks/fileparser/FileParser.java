package com.testgroupid.elementarytasks.fileparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParser {
    private String fileText;
    private String filePath;

    FileParser(String filePath){
        this.filePath = filePath;
    }

    public void parse() throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File(filePath));

        StringBuilder bfileText = new StringBuilder();
        while(fileScanner.hasNextLine()){
            bfileText.append(fileScanner.nextLine()).append('\n');
        }
        fileScanner.close();

        fileText = bfileText.toString();
    }

    public int countOf(String searchedString){

        Pattern pattern = Pattern.compile(searchedString);
        Matcher matcher = pattern.matcher(fileText);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public void replaceAll(String str, String repStr) throws IOException {
        fileText = fileText.replaceAll(str, repStr);
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(fileText);
        fileWriter.close();
    }

    @Override
    public String toString() {
        return fileText;
    }
}
