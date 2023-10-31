package org.example;

import java.util.Arrays;
import java.util.Objects;

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
        int[] newArray = new int[0];

        int counter = 0;
        int digit = 0;
        while(n!=0){
            digit = n%10;
            newArray = Tools.increaseSize(newArray);
            newArray[counter] = digit;
            counter++;
            n/=10;

        }
        return Tools.arrayInverter(newArray);

    }

    public static int sumOfElementsOfAnArray(int[] n){
        if(Arrays.equals(n, new int[]{0})){
            return 0;
        }
        if(Tools.emptyArray(n)){
            return -1;
        }
        int sum = 0;
        for(int i = 0; i < n.length; i++){
            sum += n[i];
        }
        return sum;

    }




}
