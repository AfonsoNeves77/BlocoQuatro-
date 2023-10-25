package org.example;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @org.junit.jupiter.api.Test
    void numberCounter() {
        int expected = Exercise1.numberCounter(126098);
        assertEquals(expected,6);
    }
}