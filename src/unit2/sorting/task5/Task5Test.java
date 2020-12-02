package unit2.sorting.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    void insertionSort() {
        int[] array1 = {3, 2, 1};
        Task5.insertionSort(array1);
        assertArrayEquals(new int[]{1,2,3}, array1);

        int[] array2 = {1, 2, 3};
        Task5.insertionSort(array2);
        assertArrayEquals(new int[]{1,2,3}, array2);

        int[] array3 = {2, 4, 3, 2, 1};
        Task5.insertionSort(array3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, array3);
    }
}