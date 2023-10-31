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

    @Test
    void multiplesOfAnyNumberInAGivenRange() {
        int[] expected = ExrciseNine.multiplesOfAnyNumberInAGivenRange(10,1,5);
        assertArrayEquals(expected,new int[]{5,10});
    }

    @Test
    void multiplesOfOneInAGivenRange() {
        int[] expected = ExrciseNine.multiplesOfAnyNumberInAGivenRange(10,1,1);
        assertArrayEquals(expected,new int[]{1,2,3,4,5,6,7,8,9,10});
    }

    @Test
    void multiplesOfZeroInAGivenRangeInvalid() {
        int[] expected = ExrciseNine.multiplesOfAnyNumberInAGivenRange(10,1,0);
        assertArrayEquals(expected,new int[]{});
    }
}