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
}
