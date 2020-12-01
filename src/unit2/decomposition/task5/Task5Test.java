package unit2.decomposition.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    void whenExceptionThrown_getSecondMaxFromArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            Task5.getSecondMaxFromArray(new int[0]);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Task5.getSecondMaxFromArray(new int[1]);
        });
    }

    @Test
    void getSecondMaxFromArray() {
        assertEquals(4, Task5.getSecondMaxFromArray(new int[]{1, 2, 3, 3, 5, 4}));
        assertEquals(1, Task5.getSecondMaxFromArray(new int[]{1, 1}));
        assertEquals(1, Task5.getSecondMaxFromArray(new int[]{1, 2}));
    }
}