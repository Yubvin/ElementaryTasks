package com.testgroupid.elementarytasks.trianglesorter;

public class Util {
    static double max(double side1, double side2, double side3){
        return Math.max(side1, Math.max(side2, side3));
    }

    static double max(double[] sides){
        return Math.max(sides[0], Math.max(sides[1], sides[2]));
    }

    static double sum(double[] sides){
        return sides[0] + sides[1] + sides[2];
    }

    static double sum(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }
}
