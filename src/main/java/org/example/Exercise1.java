package org.example;

public class Exercise1 {

    public static int numberCounter(int n){
        if(Tools.isZeroOrNeg(n)){
            return -1;
        }
        int counter = 0;
        while(n!=0){
            n/=10;
            counter++;
        }
        return counter;
    }

    public static int[] numberToArrayTransformer(int n){
        if(Tools.isZeroOrNeg(n)){
            return new int[0];
        }
        int[] newArray = new int[1];
        int counter = 0;
        int digit = 0;
        while(n!=0){
            digit = n%10;
            newArray[counter] = digit;
//            newArray = Tools.increaseSize(newArray);
            counter++;
            n/=10;
        }
        return newArray;

    }


    
}
