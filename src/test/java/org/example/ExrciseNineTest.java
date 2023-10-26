package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExrciseNineTest {

    @Test
    void multiplesOfThree() {
        int[] expected = ExrciseNine.multiplesOfThree(10,4);
        assertArrayEquals(expected,new int[]{6,9});

    }

    @Test
    void multiplesOfThreeInvertedNmaxNmin() {
        int[] expected = ExrciseNine.multiplesOfThree(9,12);
        assertArrayEquals(expected,new int[]{});

    }
}