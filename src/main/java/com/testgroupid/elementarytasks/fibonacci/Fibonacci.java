package com.testgroupid.elementarytasks.fibonacci;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    private int bInd;
    private int eInd;

    public Fibonacci(int bInd, int eInd){
        this.bInd = bInd;
        this.eInd = eInd;
    }

    public BigInteger[] getFibonacciFromRange(){

        List<BigInteger> fibRange = new ArrayList<>();

        BigInteger fib0 = BigInteger.ZERO;
        BigInteger fib1 = BigInteger.ONE;
        BigInteger fib2;

        if(bInd == 1){
            fibRange.add(fib1);
        }

        for (int i = 2; i < eInd; i++) {

            fib2 = fib1.add(fib0);
            fib0 = fib1;
            fib1 = fib2;
            if(i >= bInd){
                fibRange.add(fib2);
            }
        }

        return fibRange.toArray(new BigInteger[fibRange.size()]);
    }
}
