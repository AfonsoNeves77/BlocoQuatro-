package org.example;

public class Exercise4 {

    public static int[] evenNumberVector(int[] n){

        //14,15,16 - My exercises, 13g,18ab

        if (Tools.emptyArray(n)){
            return n;
        }
        int[] evenNumber = new int[0];
        int counter = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] % 2 == 0){
                evenNumber = Tools.increaseSize(evenNumber);
                evenNumber[counter] = n[i];
                counter++;
            }
        }
        return evenNumber;
    }

    public static int[] oddNumberVector(int[] n){

        if (Tools.emptyArray(n)){
            return n;
        }
        int[] evenNumber = new int[0];
        int counter = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] % 2 != 0){
                evenNumber = Tools.increaseSize(evenNumber);
                evenNumber[counter] = n[i];
                counter++;
            }
        }
        return evenNumber;
    }

    public static int sumEvenNumbers(int n){
        if(Tools.isZeroOrNeg(n)){
            return -1;
        }
        int digit = 0;
        int sum = 0;
        while(n!=0){
            digit =n%10;
            if(digit%2==0){
                sum+= digit;
            }
            n/=10;
        }
        return sum;
    }

    public static int sumOddNumbers(int n){
        if(Tools.isZeroOrNeg(n)){
            return -1;
        }
        int digit = 0;
        int sum = 0;
        while(n!=0){
            digit =n%10;
            if(digit%2!=0){
                sum+= digit;
            }
            n/=10;
        }
        return sum;
    }

    public static int[] returningParcialArray(int[] array, int n){
        if(Tools.isZeroOrNeg(n)){
            return new int[0];
        }
        int[] arrayNew = new int[n];
        for(int i = 0; i < n; i++){
            arrayNew[i] = array[i];
        }
        return arrayNew;
    }

}
