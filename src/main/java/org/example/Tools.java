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

    public static boolean arrayHasZeroOrNegNumbers(int[] array){
        for (int i = 0; i < array.length; i++){
            if(array[i] <= 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isIrregular(int[][] array){
        boolean isIrregular = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array[0].length) {
                isIrregular = true;
                break;
            }
        }
        return isIrregular;
    }

    public static boolean isaSquare(int[][] array){
        if(!isIrregular(array)){
            return array[0].length == array.length;
        }
        return false;
    }





}
