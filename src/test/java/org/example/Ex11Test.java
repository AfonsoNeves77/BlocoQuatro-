package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex11Test {

    @Test
    void numberOfMultiples() {
        int[] expected = Ex11.numberOfMultiples(5,10,new int[]{1,2,5});
        assertArrayEquals(expected,new int[]{5,6,7,8,9,10});
    }

    @Test
    void numberOfMultiplesInvalidZero() {
        int[] expected = Ex11.numberOfMultiples(5,10,new int[]{1,2,0,5});
        assertArrayEquals(expected,new int[]{});
    }

    @Test
    void isCapucua() {
        boolean expected = Ex11.isCapucua(121);
        assertTrue(expected);
    }

    @Test
    void isCapucuaZero() {
        boolean expected = Ex11.isCapucua(0);
        assertTrue(expected);
    }
}