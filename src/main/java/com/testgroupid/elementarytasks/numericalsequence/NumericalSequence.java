package com.testgroupid.elementarytasks.numericalsequence;

public class NumericalSequence {
    private int number;

    NumericalSequence(int number){
        this.number = number;
    }

    public void show(){
        for (int i = 1; i*i < number; i++){
            if((i+1)*(i+1) > number){
                System.out.println(i + ".");
            }else{
                System.out.print(i + ", ");
            }
        }
    }
}
