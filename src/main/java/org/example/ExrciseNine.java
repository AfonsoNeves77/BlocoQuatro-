package org.example;

public class ExrciseNine {

    public static int[] multiplesOfThree(int nMax,int nMin){
        if(Tools.isZeroOrNeg(nMin) || Tools.isZeroOrNeg(nMax) || Tools.isInverted(nMax,nMin)){
            return new int[]{};
        }
        int[] newAray = new int[nMax-nMin];
        int count = 0;

        for(int i = nMin; i <= nMax; i++){
            if(i % 3 == 0){
                newAray[count] = i;
                count++;
            }
        }
        int[] finalAray = new int[count];
        for (int i = 0; i < count; i++){
            finalAray[i] = newAray[i];
        }
        return finalAray;
    }

    public static int[] multiplesOfAnyNumberInAGivenRange(int nMax,int nMin,int n){
        if(Tools.isZeroOrNeg(nMin) || Tools.isZeroOrNeg(nMax) || Tools.isInverted(nMax,nMin)){
            return new int[]{};
        }
        if(Tools.isZeroOrNeg(n)) {
            return new int[]{};
        }
        int[] newAray = new int[nMax-nMin+1]; //Plus 1, or else it is out of bounds
        int count = 0;

        for(int i = nMin; i <= nMax; i++){
            if(i % n == 0){
                newAray[count] = i;
                count++;
            }
        }
        int[] finalAray = new int[count];
        for (int i = 0; i < count; i++){
            finalAray[i] = newAray[i];
        }
        return finalAray;
    }

    public static void main(String[] args) {

        char[][] mat = {
                {'9','0','r','c','o'},
                {'9','v','0','r','v'},
                {'o','v','a','r','c'},
                {'c','v','0','0','r'},
                {'o','v','i','o','c'},
        };

        char[] b = {'c','r','a','v','o'};
        System.out.println(wordExists(b, mat));
    }
    public static boolean wordExists(char[] b, char[][] mat){
//        if(!CustomTools.isaSquareChar(mat) || mat.length == 0){ //If mat has 0 lines it can't have >0 columns
//            return false;
//        }

        int[][] newChar = maskMat(b[0],mat);

        if(horizontalRight(mat,b)){
            return true;
        }
        if (horizontalLeft(mat,b)){
            return true;
        }
        if(verticalDown(mat,b)){
            return true;
        }
        if(verticalUp(mat,b)){
            return true;
        }
        if(diagonalUpperRight(mat,b)){
            return true;
        }
        if(diagonalUpperLeft(mat,b)){
            return true;
        }
        if(diagonalDownRight(mat,b)){
            return true;
        }

        return diagonalDownLeft(mat, b);
    }

    //-------------------------------------------------------------------------------

    public static boolean horizontalRight(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j + b.length <= mat[i].length) {
                    boolean found = true;
                    for (int k = 1; k < b.length; k++) {
                        if (mat[i][j + k] != b[k]) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        return true;
                    }
                }    }
        }
        return false;
    }

    public static boolean horizontalLeft(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                //Horizontal left
                if(mat[i][j] == b[0] && j >= b.length-1){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i][j-k] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean verticalDown(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == b[0] && i + b.length <= mat.length){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i+k][j] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean verticalUp(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == b[0] && i >= b.length-1){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i-k][j] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean diagonalUpperRight(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == b[0] && j + b.length <= mat[i].length && i-(b.length-1) >= 0){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i-k][j+k] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean diagonalUpperLeft(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == b[0] && i-(b.length-1) >= 0 && j >= b.length-1){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i-k][j-k] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public static boolean diagonalDownRight(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == b[0] && j + b.length <= mat[i].length && i + b.length <= mat.length){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i+k][j+k] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean diagonalDownLeft(char[][] mat,char[] b){
        for(int i = 0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == b[0] && i + b.length <= mat.length && j >= b.length-1){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i+k][j-k] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int[][] maskMat(char a, char[][] mat){

        int[][] newChar = new int[mat.length][mat[0].length];

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == a){
                    newChar[i][j] = 1;
                }
            }
        }

        return newChar;
    }






}
