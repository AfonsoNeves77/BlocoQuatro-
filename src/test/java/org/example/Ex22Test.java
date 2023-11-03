package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex22Test {

    @Test
    void isFullMatrixFalse() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {3,6,9},
        };
        boolean actual = Ex22.isFullMatrix(sudokuMat);
        assertFalse(actual);
    }

    @Test
    void fullMatrix() {
        int[][] sudokuMat = {
                {1,4,7},
                {2,5,8},
                {3,6,9},
        };
        boolean actual = Ex22.isFullMatrix(sudokuMat);
        assertTrue(actual);
    }

    @Test
    void showMaskMat(){
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {3,6,9},
        };
        int[][] expected = Ex22.maskMat(1,sudokuMat);
        int[][] actual = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        assertArrayEquals(expected,actual);
    }

    @Test
    void insertNumber() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {3,6,9},
        };
        int[][] expected = Ex22.insertNumber(4,0,1,sudokuMat);
        int[][] actual = {
                {1,-4,7},
                {2,5,8},
                {3,6,9},
        };
        assertArrayEquals(actual,expected);
    }

    @Test
    void insertNumberFullMat() {
        int[][] sudokuMat = {
                {1,4,7},
                {2,5,8},
                {3,6,9},
        };
        int[][] expected = Ex22.insertNumber(4,0,1,sudokuMat);
        assertNull(expected);
    }

    @Test
    void insertNumberRepeatedNumber() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {-3,6,9},
        };
        int[][] expected = Ex22.insertNumber(3,0,1,sudokuMat);
        assertNull(expected);
    }

    @Test
    void insertInvalidNumber() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {-3,6,9},
        };
        int[][] expected = Ex22.insertNumber(10,0,1,sudokuMat);
        assertNull(expected);
    }



    @Test
    void tryingToRetrieveNumberInAnEmptyCell() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {3,6,9},
        };

        int[][] expected = Ex22.retrieveNumber(0,1,sudokuMat);
        assertNull(expected);
    }

    @Test
    void tryingToRetrieveNumberNotPresent() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {3,6,9},
        };

        int[][] expected = Ex22.retrieveNumber(0,1,sudokuMat);
        assertNull(expected);
    }

    @Test
    void tryingToRetrieveNumberInsertedByPlayer() {
        int[][] sudokuMat = {
                {-1,0,7},
                {2,5,8},
                {3,6,9},
        };

        int[][] expected = Ex22.retrieveNumber(0,0,sudokuMat);
        int[][] actual = {
                {0,0,7},
                {2,5,8},
                {3,6,9},
        };
        assertArrayEquals(actual,expected);
    }


    @Test
    void validGameOver() {
        int[][] sudokuMat = {
                {1,-4,7},
                {2,5,8},
                {3,6,-9},
        };

        boolean expected = Ex22.validGameOver(sudokuMat);

        assertTrue(expected);
    }

    @Test
    void invalidGameOverRepInsertedNumbers() {
        int[][] sudokuMat = {
                {1,-4,7},
                {2,5,8},
                {3,6,-4},
        };

        boolean expected = Ex22.validGameOver(sudokuMat);

        assertFalse(expected);
    }

    @Test
    void invalidGameOverRepInsertedNumber() {
        int[][] sudokuMat = {
                {1,-4,7},
                {2,5,8},
                {3,6,4},
        };

        boolean expected = Ex22.validGameOver(sudokuMat);

        assertFalse(expected);
    }

    @Test
    void invalidGameOverNotFullMat() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {3,6,4},
        };

        boolean expected = Ex22.validGameOver(sudokuMat);

        assertFalse(expected);
    }

    @Test
    void invalidGameOverNotSquareMat() {
        int[][] sudokuMat = {
                {1,0,7},
                {2,5,8},
                {3,6,9},
                {4,7,1},
        };

        boolean expected = Ex22.validGameOver(sudokuMat);

        assertFalse(expected);
    }





}