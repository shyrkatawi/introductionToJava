package unit2.sorting.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @Test
    void shellSort() {
        int[] array1 = {3, 2, 1};
        Task6.shellSort(array1);
        assertArrayEquals(new int[]{1, 2, 3}, array1);

        int[] array2 = {1, 2, 3};
        Task6.shellSort(array2);
        assertArrayEquals(new int[]{1, 2, 3}, array2);

        int[] array3 = {2, 4, 3, 2, 1};
        Task6.shellSort(array3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, array3);
    }
}