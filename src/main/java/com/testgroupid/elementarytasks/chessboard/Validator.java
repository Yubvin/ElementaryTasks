package com.testgroupid.elementarytasks.chessboard;

import java.util.Arrays;

/**
 * The Validator class
 */
public class Validator {

    private String[] args;
    private int[] valid_args = new int[2];

    Validator(String[] args){
        this.args = Arrays.copyOf(args, args.length);
    }

    private void validate() throws IllegalArgumentException{
        if(args.length == 0){
            throw new IllegalArgumentException("Enter the height and the width of the chess-board as "
                    + "the arguments of command line and chess-board will be"
                    + " printed out in the console!");
        }

        if(args.length < 2){
            throw new IllegalArgumentException("There are too few arguments!");
        }

        if(args.length == 2){
            valid_args[0] = Integer.parseInt(args[0]);
            valid_args[1] = Integer.parseInt(args[1]);
        }

        if(args.length > 2){
            throw new IllegalArgumentException("There are too many arguments!");
        }
    }

    ChessBoard getValidatedChessBoard() throws IllegalArgumentException{

        validate();

        return new ChessBoard(valid_args[0], valid_args[1]);
    }
}
