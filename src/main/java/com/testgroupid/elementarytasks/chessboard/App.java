package com.testgroupid.elementarytasks.chessboard;

public class App {

    private static void execute(String[] args){
        Validator userInput = new Validator(args);
        ChessBoard chessBoard;

        try {
            userInput.getValidatedChessBoard().show();
        }catch (NumberFormatException e){
            System.out.println("Value must be integer!");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        App.execute(args);
    }
}
