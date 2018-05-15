package com.testgroupid.elementarytasks.envelope;

public class Envelope{
    private double width;
    private double height;

    Envelope(double width, double height){
        this.height = height;
        this.width = width;
    }

    public static boolean isNested(Envelope env1, Envelope env2){
        return env1.width >= env2.width && env1.height >= env2.height ||
                env1.width <= env2.width && env1.height <= env2.height ||
                env1.width >= env2.height && env1.height >= env2.width ||
                env1.width <= env2.height && env1.height <= env2.width;
    }
}
