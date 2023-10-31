package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char[][] mat = {
                {'u','i','u','a'},
                {'m','0','M','a'},
                {'a','o','7','u'},
                {'a','m','u','u'},
        };

        char[] b = {'o','l','a'};

        System.out.println(wordExists(b, mat));




    }
    public static boolean wordExists(char[] b, char[][] mat){
//        if(!CustomTools.isaSquareChar(mat) || mat.length == 0){ //If mat has 0 lines it can't have >0 columns
//            return false;
//        }

        char[] newChar = new char[mat.length];
        int index = 1;

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == b[0] && j + b.length <= mat[i].length){
                    boolean found = true;
                    for(int k = 1; k < b.length; k++){
                        if(mat[i][j+k] != b[k]){
                            found = false;
                            break;
                        }
                    }
                    if(found){
                        return true;
                    }
                }

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

                if(mat[i][j] == b[0] && j + b.length <= mat[i].length && i - (b.length-1) <= mat.length){
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
}




