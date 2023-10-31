package org.example;

public class Exercise13 {
    public static int elementOfMinorValue(int[] array){
        int minor = array[0];
        for (int j : array) {
            if (minor > j) {
                minor = j;
            }
        }
        return minor;
    }

    public static int biggerElementValue(int[] array){
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int productOfElementsOfAnArray(int[] array){
        if(Tools.emptyArray(array)){
            return -1;
        }
        int product = 1;
        for( int j : array){
            if(j == 0){
               return 0;
            }
            product *=j;
        }
        return product;
    }

    public static double mediaOfElementsOfAnArray(int[] array){
        int sum = 0;
        if(Tools.emptyArray(array)){
            return -1;
        }
        int product = 1;
        for( int j : array){
            sum+=j;

        }
        return (double) sum /array.length;
    }

    public static int[] inversedVector(int[] array){
        if (Tools.emptyArray(array)){
            return array;
        }
        int[] newArray = new int[array.length];
        int index = 0;
        for(int i = array.length-1; i >= 0; i--){
            newArray[index] = array[i];
            index++;

        }
        return newArray;
    }

    public static int[] notDuplicated (int[] array){
        int[] newArr = new int[array.length];
        for(int i = 0; i < array.length; i++){
            for(int j = i +1; j < array.length; j++) {
                if (array[i] != array[j]){
                    newArr[i] = array[i];

                }
            }
        }
        return newArr;
    }

    public static int[] primusNumbers(int[] array){
        int[] newArr = new int[array.length];
        int numDiv = 0;
        int index = 0;

        for(int obj : array){
            numDiv = 0;
            for(int i = 1; i <= obj; i++){
                if(obj%i == 0 && obj > 1){
                    numDiv++;
                }
            }
            if(numDiv == 2){
                newArr[index] = obj;
                index++;
            }
        }
        int[] finalArr = new int[index];

        for(int i = 0; i < finalArr.length; i++){
            finalArr[i] = newArr[i];
        }
        return finalArr;
    }







}
