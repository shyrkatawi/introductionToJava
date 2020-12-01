package unit2.arrays.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    @Test
    void whenExceptionThrown_findMostCommonNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Task9.findMostCommonNumber(new int[0]);
        });
    }

    @Test
    void findMostCommonNumber() {
        assertEquals(2, Task9.findMostCommonNumber(new int[]{1, 2, 2, 3}));
        assertEquals(1, Task9.findMostCommonNumber(new int[]{1, 1, 2, 2}));
        assertEquals(1, Task9.findMostCommonNumber(new int[]{1}));
        assertEquals(1, Task9.findMostCommonNumber(new int[]{1, 1}));
        assertEquals(1, Task9.findMostCommonNumber(new int[]{1, 1, 1, 1}));
    }

}