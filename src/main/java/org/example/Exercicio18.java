package org.example;

public class Exercicio18 {

    //a)
    public static double mediumValueElement(int[][] mat){
        int sum = 0;
        int counter = 0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                sum += anInt;
                counter++;
            }
        }

        return (double) sum /counter;

    }

    public static int productValueElement(int[][] mat){
        int produt = 1;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 0){
                    mat[i][j] = 1;
                }
                produt *= mat[i][j];
            }
        }
        return produt;

    }


    public static int[] nonRepElements(int[] mat){

        int[] a = new int[mat.length];
        int index = 0;
        for(int i = 0; i < mat.length; i++){
            boolean is = false;
            for(int j = 0; j < i; j++){
                if (mat[i] == mat[j]) {
                    is = true;
                    break;
                }
            }
            if(!is) {
                a[index] = mat[i];
                index++;
            }
        }

        int[] nonRepeated = new int[index];
        System.arraycopy(a, 0, nonRepeated, 0, index);
        return nonRepeated;

    }

    public static int[] nonRepElementsMat(int[][] mat){

        int[] temp = new int[25];
        int index = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                temp[index] = mat[i][j];
                index++;
            }
        }

        int[] a = nonRepElements(temp);
        int[] b = new int[a.length];
        for(int i = 0; i < b.length; i++){
            b[i] = a[i];
        }
        return b;

    }

    public static int[] princiapalDiagonal(int[][] mat){
        //is regular is square
        int[] temp = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j){
                    temp[i] = mat[i][j];
                }
            }
        }
        return temp;
    }

    public static int[] secundaryDiagonal(int[][] mat){
        //is regular is square
        int[] temp = new int[mat.length];
        int z = mat[0].length-1;
        for(int i = 0; i < mat.length; i++){
            temp[i] = mat[i][z];
            z--;

        }
        return temp;
    }


    public static boolean identityMatDiagonal(int[][] mat){
        //TEM DE SER QUADRADA

        int[] array = princiapalDiagonal(mat);
        for (int j : array) {
            if(j != 1 ){
                return false;
            }
        }
        return true;
    }
    public static boolean identityMatComplete(int[][] mat){ //Assuming an identity mat has principal diagonal with only 1s and rest of it is zero
        if(!identityMatDiagonal(mat)){
            return false;
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j){
                    continue;
                }
                if(mat[i][j] != 0){
                    return false;
                }
            }
        }
        return true;

    }






}
