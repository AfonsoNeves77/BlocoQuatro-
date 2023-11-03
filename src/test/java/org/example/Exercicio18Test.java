package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio18Test {

    @Test
    void mediumValueElement() {

        int[][] a = {
                {1,1,2,1},
                {1,2,4,5},
                {1,2,4,5},
        };
        double actual = Exercicio18.mediumValueElement(a);

        assertEquals(2.41,actual,0.01);

    }

    @Test
    void mediumValueElementIrregularMat() {

        int[][] a = {
                {1,1},
                {1,2,5},
                {4,5},
        };
        double actual = Exercicio18.mediumValueElement(a);

        assertEquals(2.71,actual,0.01);

    }

    @Test
    void productValueElement() {

        int[][] a = {
                {0,1},
                {1,2,5},
                {4,5},
        };

        double actual = Exercicio18.productValueElement(a);

        assertEquals(200,actual,0.01);
    }

    @Test
    void nonRepElements() {
        int[] array = {0,0,1,1,2,5,4,9,10,10,11,11,78,5};
        int[] actual = Exercicio18.nonRepElements(array);
        int[] expected = {0,1,2,5,4,9,10,11,78};
        assertArrayEquals(actual,expected);
    }

    @Test
    void nonRepElementsMat() {
        int[][] mat = {
                {1, 9, 5, 6},
                {3, 1, 9, 1},
                {3, 3, 1, 1},
                {3, 3, 0, 0},

        };
        int[] actual = Exercicio18.nonRepElementsMat(mat);
        int[] expected = {1,9,5,6,3,0};
        assertArrayEquals(actual,expected);


    }

    @Test
    void princiapalDiagonal() {
        int[][] mat = {
                {1, 9, 5, 6},
                {3, 1, 9, 1},
                {3, 3, 1, 1},
                {3, 3, 0, 0},

        };
        int[] actual = Exercicio18.princiapalDiagonal(mat);
        int[] expected = {1,1,1,0};
        assertArrayEquals(actual,expected);
    }

    @Test
    void secundaryDiagonal() {
        int[][] mat = {
                {1, 9, 5, 6},
                {3, 1, 9, 1},
                {3, 3, 1, 1},
                {10, 3, 0, 0},

        };
        int[] actual = Exercicio18.secundaryDiagonal(mat);
        int[] expected = {6,9,3,10};
        assertArrayEquals(actual,expected);
    }

    @Test
    void identityMatMainDiagonalOnly() { //Only considering main diagonal with 1s...
        int[][] mat = {
                {1, 9, 5, 6},
                {3, 1, 9, 1},
                {3, 3, 1, 1},
                {10, 3, 0, 1},

        };
        boolean actual = Exercicio18.identityMatDiagonal(mat);
        assertTrue(actual);
    }

    @Test
    void identityMatMainDiagonalOnly_False() { //Only considering main diagonal with 1s...
        int[][] mat = {
                {1, 9, 5, 6},
                {3, 1, 9, 1},
                {3, 3, 1, 1},
                {10, 3, 0, 9},

        };
        boolean actual = Exercicio18.identityMatDiagonal(mat);
        assertFalse(actual);
    }

    @Test
    void identityMatComplete() { //Considering main diagonal with 1s and rest of mat with only 0s
        int[][] mat = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},

        };
        boolean actual = Exercicio18.identityMatComplete(mat);
        assertTrue(actual);
    }

    @Test
    void identityMatComplete_False() { //Considering main diagonal with 1s and rest of mat with only 0s
        int[][] mat = {
                {1, 9, 5, 6},
                {3, 1, 9, 1},
                {3, 3, 1, 1},
                {10, 3, 0, 1},

        };
        boolean actual = Exercicio18.identityMatComplete(mat);
        assertFalse(actual);
    }
}