package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @org.junit.jupiter.api.Test
    void numberCounter() {
        int expected = Exercise1.numberCounter(126098);
        assertEquals(expected,6);
    }

    @org.junit.jupiter.api.Test
    void numberCounterZero() {
        int expected = Exercise1.numberCounter(0);
        assertEquals(expected,-1);
    }

   @Test
   void numberToArrayTransformer(){
        int[] expected = Exercise1.numberToArrayTransformer(123);
        assertArrayEquals(expected,new int[]{1,2,3});
   }

    @Test
    void sumOfElementsOfAnArray() {
        int expected = Exercise1.sumOfElementsOfAnArray(new int[]{1,0,9,4});
        assertEquals(14,expected);
    }

    @Test
    void sumOfElementsOfAnArrayZero() {
        int expected = Exercise1.sumOfElementsOfAnArray(new int[]{0});
        assertEquals(0,expected);
    }

    @Test
    void sumOfElementsOfAnEmptyArray() {
        int expected = Exercise1.sumOfElementsOfAnArray(new int[]{});
        assertEquals(-1,expected);
    }
}