package org.example;

public class Tools {

    public static boolean isZeroOrNeg(int n){
        return n <= 0;
    }

    public static int[][] increaseSize(int[][] n) {
        int[][] tempArray = new int[1][n[0].length + 1];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n[0].length; j++){
                tempArray[i][j] = n[0][j];
            }

        }
        return tempArray;
    }

}
