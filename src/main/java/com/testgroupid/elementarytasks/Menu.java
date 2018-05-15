package com.testgroupid.elementarytasks;

public class Menu {

    private String[] args;
    private final String[] menuItems = {"1. Chess board", "2. ", "3. ", "4. ", "5. ", "6. ", "7. ", "8. "};

    public Menu(String[] args){
        this.args = args.clone();
    }

    private void showHelp(){

    }

    private void parseArgs(){

    }

    public void run(){
        if (args.length == 0){
            showHelp();
        }

        if (args.length > 0){
            parseArgs();
        }
    }
}
