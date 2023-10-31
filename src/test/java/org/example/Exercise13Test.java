package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise13Test {

    @Test
    void elementOfMinorValue() {
        int actual = Exercise13.elementOfMinorValue(new int[]{-9,-6,8,-13,1,-10});
        int expected = -13;
        assertEquals(actual,expected);
    }

    @Test
    void elementOfMinorValuue() {
        int actual = Exercise13.elementOfMinorValue(new int[]{});
        int expected = -13;
        assertEquals(actual,expected);
    }

    @Test
    void biggerElementValue() {
        int actual = Exercise13.biggerElementValue(new int[]{9,6,8,13,1,10});
        int expected = 13;
        assertEquals(actual,expected);
    }

    @Test
    void productOfElementsOfAnArrayZeroIsAnArrayElement() {
        int actual = Exercise13.productOfElementsOfAnArray(new int[]{1,0,3,0,3});
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    void productOfElementsOfAnArray() {
        int actual = Exercise13.productOfElementsOfAnArray(new int[]{1,-1,3,1,3});
        int expected = -9;
        assertEquals(actual,expected);
    }

    @Test
    void productOfElementsOfAnEmptyArray() {
        int actual = Exercise13.productOfElementsOfAnArray(new int[]{});
        int expected = -1;
        assertEquals(actual,expected);
    }

    @Test
    void mediaOfElementsOfAnArray() {
        double actual = Exercise13.mediaOfElementsOfAnArray(new int[]{1,3,2,1,9});
        double expected = 3.2;
        assertEquals(actual,expected);
    }

    @Test
    void mediaOfElementsOfAnEmptyArray() {
        double actual = Exercise13.mediaOfElementsOfAnArray(new int[]{});
        double expected = -1;
        assertEquals(actual,expected);
    }

    @Test
    void mediaOfElementsOfAnArrayZero() {
        double actual = Exercise13.mediaOfElementsOfAnArray(new int[]{0});
        double expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    void inversedVector() {
        int[] actual = Exercise13.inversedVector(new int[]{1,2,3});
        int[] expected = new int[]{3,2,1};
        assertArrayEquals(actual,expected);
    }

    @Test
    void inversedEmpty() {
        int[] actual = Exercise13.inversedVector(new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(actual,expected);
    }

    @Test
    void primusNumbers() {
        int[] actual = Exercise13.primusNumbers(new int[]{0,-1,1,2,3,5,6,8,11,55,100,1,67});
        int[] expected = new int[]{2,3,5,11,67};
        assertArrayEquals(actual,expected);
    }

    @Test
    void noPrimusNumbers() {
        int[] actual = Exercise13.primusNumbers(new int[]{1,6,4,8});
        int[] expected = new int[]{};
        assertArrayEquals(actual,expected);
    }
}