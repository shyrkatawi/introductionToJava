package unit3.stringOrStringbuilder.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void getNumberOfChar_a() {
        assertEquals(0, Task5.getNumberOfCharSelectedChar('a', ""));
        assertEquals(0, Task5.getNumberOfCharSelectedChar('a', "qwe"));
        assertEquals(1, Task5.getNumberOfCharSelectedChar('a', "a"));
        assertEquals(1, Task5.getNumberOfCharSelectedChar('a', "gAa"));
        assertEquals(3, Task5.getNumberOfCharSelectedChar('a', "gaaa"));
    }
}