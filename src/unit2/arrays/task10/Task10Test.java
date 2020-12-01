package unit2.arrays.task10;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void compressArray() {
        int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = source.clone();
        Task10.compressArray(result);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 0, 0, 0, 0}, result);

        source = new int[]{1, 2};
        result = source.clone();
        Task10.compressArray(result);
        assertArrayEquals(new int[]{1, 0}, result);
    }
}