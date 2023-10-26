package org.example;

import java.util.Arrays;

public class Tools {

    public static boolean isZeroOrNeg(int n){
        return n <= 0;
    }

    public static int[] increaseSize(int[] n) {
        int[] tempArray = new int[n.length +1];

        for (int i = 0; i < n.length; i++) {
                tempArray[i]=n[i];
            }
        return tempArray;
    }

    public static int[] arrayInverter(int[] n){
        int newCounter = 0;
        int[] finalArray = new int[n.length];
        for(int i = n.length-1; i >= 0; i--){
            finalArray[newCounter] = n[i];
            newCounter++;
        }
        return finalArray;
    }
    public static boolean emptyArray(int[] n){
        return Arrays.equals(n, new int[0]);
    }

    public static boolean isInverted(int nMax,int nMin){
        return nMin > nMax;
    }





}
