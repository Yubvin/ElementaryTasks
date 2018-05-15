package com.testgroupid.elementarytasks.envelope;

import com.testgroupid.elementarytasks.chessboard.ChessBoard;

import java.util.Arrays;

/**
 * The Validator class
 */
public class Validator {

    private double[] valid_args_env1 = new double[2];
    private double[] valid_args_env2 = new double[2];

    private void validate(String[] args) throws IllegalArgumentException{
        if(args.length == 0){
            throw new IllegalArgumentException("Enter the height and the width of the envelopes. " +
                    "First two parameters are width and height of a first envelope" +
                    "Second two parameters are width and height of second envelope");
        }

        if(args.length < 4){
            throw new IllegalArgumentException("There are too few arguments!");
        }

        if(args.length == 4){
            valid_args_env1[0] = Double.parseDouble(args[0]);
            valid_args_env1[1] = Double.parseDouble(args[1]);

            valid_args_env2[0] = Double.parseDouble(args[2]);
            valid_args_env2[1] = Double.parseDouble(args[3]);
        }

        if(args.length > 4){
            throw new IllegalArgumentException("There are too many arguments!");
        }
    }

    Envelope[] getValidatedEnvelopes(String[] args) throws IllegalArgumentException{

        validate(args);

        return new Envelope[]{new Envelope(valid_args_env1[0], valid_args_env1[1]),
                    new Envelope(valid_args_env2[0],valid_args_env2[1])};
    }
}
