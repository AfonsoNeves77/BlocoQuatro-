package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfMultiples(4, 12, new int[]{2, 4})));

    }


    public static int[][] numberOfMultiples(int nMin,int nMax, int[] multiples){
        int index = 0;
        int[][] newArray = new int[1][0];
        for(int i = nMin; i <= nMax; i++){
            for(int j = 0; j < multiples.length; j++){
                if(i%multiples[j] == 0){
                   newArray = Tools.increaseSize(newArray);
                    newArray[0][index] = i;
                    index++;
                }
            }
        }

        return newArray;
    }

    public static int[] removingDuplicateValues(int[] array){
        int index = 0;
        int[] normalizedArray = new int[0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    array[i] = array[i+1];

                }

            }

        }
        return normalizedArray;
    }



}