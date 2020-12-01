package unit2.arrays.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    void getArrayWithNumbersGreaterThanItsIndex() {
        assertArrayEquals(new int[0], Task5.getArrayWithNumbersGreaterThanItsIndex(new int[0]));
        assertArrayEquals(new int[0], Task5.getArrayWithNumbersGreaterThanItsIndex(new int[]{-1, -2, -3}));
        assertArrayEquals(new int[]{1, 3, 4}, Task5.getArrayWithNumbersGreaterThanItsIndex(new int[]{1, 0, 3, 4, 0, 0, -1, -2, -3}));
    }
}