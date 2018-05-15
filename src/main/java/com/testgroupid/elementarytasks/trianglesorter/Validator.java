package com.testgroupid.elementarytasks.trianglesorter;

public class Validator {

    private String triangleName;
    private double[] sides;

    private void validate(String[] args) throws IllegalArgumentException {
        if (args.length == 0 || (args.length == 1 && args[0].equals(""))) {
            throw new IllegalArgumentException("Please, enter the name of a triangle and its " +
                    " sides in centimeters, separating them by commas! For example: MyTriangle 12, 12, 12\n");
        }

        if (args.length < 4) {
            throw new IllegalArgumentException("There are too few arguments!\n");
        }

        if (args.length == 4) {
            triangleName = args[0];

            sides = new double[3];
            sides[0] = Double.parseDouble(args[1]);
            sides[1] = Double.parseDouble(args[2]);
            sides[2] = Double.parseDouble(args[3]);

            if(Triangle.isDegenerateTriangle(sides)){
                throw new DegenerateTriangleException("Please, write correct values for sides of triangle!\n");
            }
        }

        if (args.length > 4) {
            throw new IllegalArgumentException("There are too many arguments!\n");
        }
    }

    Triangle getValidatedTriangleFrom(String[] args) throws IllegalArgumentException {

        validate(args);

        return new Triangle(triangleName, sides);
    }
}