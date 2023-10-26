package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    void evenNumberVector() {
        int[] expected = Exercise4.evenNumberVector(new int[]{0,1,2,3,4,5,6});
        assertArrayEquals(expected,new int[]{0,2,4,6});
    }

    @Test
    void evenNumberEmptyVect() {
        int[] expected = Exercise4.evenNumberVector(new int[]{});
        assertArrayEquals(expected,new int[]{});
    }

    @Test
    void evenNumberZeroEvenNumbers() {
        int[] expected = Exercise4.evenNumberVector(new int[]{1,5,7});
        assertArrayEquals(expected,new int[]{});
    }

    @Test
    void evenNumberOnlyZero() {
        int[] expected = Exercise4.evenNumberVector(new int[]{0});
        assertArrayEquals(expected,new int[]{0});
    }

    @Test
    void oddNumberVector() {
        int[] expected = Exercise4.oddNumberVector(new int[]{0,1,2,3,4,5,6});
        assertArrayEquals(expected,new int[]{1,3,5});
    }

    @Test
    void oddNumberOnlyZeroOddNumbers() {
        int[] expected = Exercise4.oddNumberVector(new int[]{0});
        assertArrayEquals(expected,new int[]{});
    }

    @Test
    void evenNumbers() {
        int expected = Exercise4.sumEvenNumbers(1782);
        assertEquals(expected,10);
    }

    @Test
    void oddNumbers() {
        int expected = Exercise4.sumOddNumbers(1782);
        assertEquals(expected,8);
    }

    @Test
    void oddNumbersNegative() {
        int expected = Exercise4.sumOddNumbers(-1782);
        assertEquals(expected,-1);
    }

    @Test
    void returningParcialArray() {
        int[] expected = Exercise4.returningParcialArray(new int[]{0,1,2,3,4,5,6,7},4);
        assertArrayEquals(new int[]{0,1,2,3},expected);
    }

    @Test
    void returningParcialArrayZero() {
        int[] expected = Exercise4.returningParcialArray(new int[]{0,1,2,3,4,5,6,7},-0);
        assertArrayEquals(new int[]{},expected);
    }
}