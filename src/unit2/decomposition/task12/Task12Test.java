package unit2.decomposition.task12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {
    @Test
    void task12() {
        assertArrayEquals(new int[0], Task12.task12(3, 0));
        assertArrayEquals(new int[0], Task12.task12(0, 11));
        assertArrayEquals(new int[]{3}, Task12.task12(3, 11));
        assertArrayEquals(new int[]{2, 11}, Task12.task12(2, 12));
        assertArrayEquals(new int[]{6, 15, 24, 33}, Task12.task12(6, 36));
    }

    @Test
    void getSumOfDigits() {
        assertEquals(1, Task12.getSumOfDigits(1));
        assertEquals(2, Task12.getSumOfDigits(11));
        assertEquals(5, Task12.getSumOfDigits(104));
    }
}