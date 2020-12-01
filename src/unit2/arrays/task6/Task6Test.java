package unit2.arrays.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @Test
    void sumOfNumbersWhosePositionIsPrimeNumber() {
        assertEquals(0.0, Task6.sumOfNumbersWhosePositionIsPrimeNumber(new double[0]), 0);
        assertEquals(15.0, Task6.sumOfNumbersWhosePositionIsPrimeNumber(new double[]{0.0, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5}), 0);
    }

    @Test
    void isPrimeNumber() {
        assertTrue(Task6.isPrimeNumber(2));
        assertTrue(Task6.isPrimeNumber(3));
        assertTrue(Task6.isPrimeNumber(5));
        assertTrue(Task6.isPrimeNumber(13));
        assertTrue(Task6.isPrimeNumber(137));

        assertFalse(Task6.isPrimeNumber(1));
        assertFalse(Task6.isPrimeNumber(4));
        assertFalse(Task6.isPrimeNumber(100));
        assertFalse(Task6.isPrimeNumber(133));
    }
}