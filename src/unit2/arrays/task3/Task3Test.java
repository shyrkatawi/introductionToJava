package unit2.arrays.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    void countNegativeZeroPositiveNumbers() {
        assertArrayEquals(new int[]{0, 0, 0}, Task3.countNegativeZeroPositiveNumbers(new double[0]));
        assertArrayEquals(new int[]{3, 0, 0}, Task3.countNegativeZeroPositiveNumbers(new double[]{-1, -2, -3}));
        assertArrayEquals(new int[]{0, 2, 0}, Task3.countNegativeZeroPositiveNumbers(new double[]{0, 0}));
        assertArrayEquals(new int[]{0, 0, 3}, Task3.countNegativeZeroPositiveNumbers(new double[]{1, 2, 3}));
        assertArrayEquals(new int[]{3, 2, 4}, Task3.countNegativeZeroPositiveNumbers(new double[]{1, 2, 3, 4, 0, 0, -1, -2, -3}));
    }
}