package org.example;

public class Ex11 {

    public static int[] arrayInCrescentOrderNotMandatoryEX(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] numberOfMultiples(int nMin,int nMax, int[] multiples){
        if(Tools.isZeroOrNeg(nMin) || Tools.isZeroOrNeg(nMax) || Tools.isInverted(nMax,nMin)){
            return new int[]{};
        }
        if(Tools.arrayHasZeroOrNegNumbers(multiples)){
            return new int[]{};
        }
        int index = 0;
        int[] newArray = new int[0];
        for(int i = nMin; i <= nMax; i++){
            for(int j = 0; j < multiples.length; j++){
                if(i%multiples[j] == 0){
                    newArray = Tools.increaseSize(newArray);
                    newArray[index] = i;
                    index++;
                    break;
                }
            }
        }
        return newArray;
    }

    public static boolean isCapucua(int n){
        int digit = 0;
        int nCopy = n;
        int sum = 0;
        while(n!=0){
            digit = n%10;
            sum = (sum*10)+digit;
            n/=10;
        }
        return nCopy == sum;
    }



}
