package org.example;

public class Ex22 {

    public static boolean isFullMatrix(int[][] sudokuMat){
        if(!Tools.isaSquare(sudokuMat)){
            return false;
        }
        for (int[] chars : sudokuMat) {
            for (int aChar : chars) {
                if (aChar == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] maskMat(int numberToFind, int[][] sudokuMat) {
        if(!Tools.isaSquare(sudokuMat)){ //Craefull returning null or null pointer exception
            return new int[][]{{-1},{-1}};
        }

        int[][] newInt = new int[sudokuMat.length][sudokuMat[0].length];

        for (int i = 0; i < sudokuMat.length; i++) {
            for (int j = 0; j < sudokuMat[i].length; j++) {
                if (sudokuMat[i][j] == numberToFind || sudokuMat[i][j] == -numberToFind) {
                    newInt[i][j] = 1;
                }
            }
        }

        return newInt;
    }

    public static int[][] insertNumber(int numberToInsert,int x,int y,int[][] sudokuMat){
        if(isFullMatrix(sudokuMat) || !Tools.isaSquare(sudokuMat) || numberToInsert > 9 || numberToInsert < 1){
            return null;
        }
        if(maskMat(numberToInsert,sudokuMat)[x][y] == 0){
            boolean exists = false;//se a mm naquela casa for 0 significa que esta disponi
            for (int[] ints : sudokuMat) {
                for (int anInt : ints) {
                    if (numberToInsert == anInt || numberToInsert == -anInt) {
                        exists = true;
                        break;
                    }

                }
            }
            if(exists){
                return null;
            }
            sudokuMat[x][y] = -numberToInsert;
            return sudokuMat;
        }
        return null;

    }

    public static int[][] retrieveNumber(int x,int y,int[][] sudokumat){
        if(!Tools.isaSquare(sudokumat)){
            return null;
        }
        if(sudokumat[x][y] < 0){ //nao pode tirar 0 nem numeros positivos
            sudokumat[x][y] = 0;
            return sudokumat;

        }
        return null;

    }

    public static boolean validGameOver(int[][] sudokumat){
        if(isFullMatrix(sudokumat) && Tools.isaSquare(sudokumat)){//nao pode tirar 0 nem numeros positivos
            int[] temp = new int[sudokumat.length*3];
            int index = 0;

            for (int[] ints : sudokumat) {
                for (int anInt : ints) {
                    temp[index] = anInt;
                    index++;
                }
            }

            for(int i = 0; i < temp.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (temp[i] == temp[j] || temp[i] == -temp[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;

    }



}
