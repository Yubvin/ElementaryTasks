package com.testgroupid.elementarytasks.trianglesorter;

import java.util.Arrays;

public class Triangle{
    private String name;
    private double[] sides;

    Triangle(String name, double[] sides){
        this.name = name;
        this.sides = Arrays.copyOf(sides, sides.length);
    }

    Triangle(String name, double side1, double side2, double side3){

        this.name = name;

        sides = new double[3];
        sides[0] = side1;
        sides[1] = side2;
        sides[2] = side3;
    }

    public double getPerimeter(){
        return sides[0]+sides[1]+sides[2];
    }

    public double getArea(){
        double sp = getPerimeter()/2;
        return Math.sqrt(sp*(sp - sides[0])*(sp - sides[1])*(sp - sides[2]));
    }

    public static boolean isDegenerateTriangle(double[] sides){
        return 2*Util.max(sides) >= Util.sum(sides);
    }

    public static boolean isDegenerateTriangle(double side1, double side2, double side3){
        return 2*Util.max(side1, side2, side3) >= Util.sum(side1, side2, side3);
    }

    @Override
    public String toString() {
        return "[Triangle " + name + "]: " + getArea() + " cm";
    }
}
