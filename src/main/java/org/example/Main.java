package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {-3,6,9},
        };

        int[][] expected = Ex22.insertNumber(10,0,1,sudokuMat);
        System.out.println(Arrays.deepToString(expected));

    }









}




