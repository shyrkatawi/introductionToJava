package unit2.arrays.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    @Test
    void task8() {
        assertArrayEquals(new int[0], Task8.task8(new int[0]));
        assertArrayEquals(new int[0], Task8.task8(new int[]{2}));
        assertArrayEquals(new int[0], Task8.task8(new int[]{2, 2, 2, 2}));
        assertArrayEquals(new int[]{1}, Task8.task8(new int[]{1, -22}));
        assertArrayEquals(new int[]{2, 4}, Task8.task8(new int[]{1, 1, 2, 4}));
    }
}