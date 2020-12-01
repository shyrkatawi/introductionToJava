package unit2.decomposition.task11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {
    @Test
    void compareNumbersByNumberOfDigits() {
        assertEquals(-1, Task11.compareNumbersByNumberOfDigits(1, 11));
        assertEquals(-1, Task11.compareNumbersByNumberOfDigits(133, 12312));

        assertEquals(0, Task11.compareNumbersByNumberOfDigits(1, 9));
        assertEquals(0, Task11.compareNumbersByNumberOfDigits(133, 123));

        assertEquals(1, Task11.compareNumbersByNumberOfDigits(33, 1));
        assertEquals(1, Task11.compareNumbersByNumberOfDigits(131233, 32));
    }

    @Test
    void getAmountOfDigits() {
        assertEquals(1, Task11.getAmountOfDigits(1));
        assertEquals(2, Task11.getAmountOfDigits(11));
        assertEquals(4, Task11.getAmountOfDigits(1234));
    }
}