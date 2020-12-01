package unit2.arrays.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void task2() {
        assertEquals(10, Task2.task2(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, -1));
        assertEquals(8, Task2.task2(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2));
        assertEquals(4, Task2.task2(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6));
        assertEquals(0, Task2.task2(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 11));
    }
}