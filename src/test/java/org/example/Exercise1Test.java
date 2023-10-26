package org.example;

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
}