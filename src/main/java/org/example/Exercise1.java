package org.example;

public class Exercise1 {

    public static int numberCounter(int n){
        if(n <= 0){
            return -1;
        }
        int counter = 0;
        while(n!=0){
            n/=10;
            counter++;
        }
        return counter;
    }

    
}
