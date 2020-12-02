package unit2.sorting.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void task2() {
        assertArrayEquals(new int[]{1,2,3,4,5}, Task2.task2(new int[]{2,4},new int[]{1,3,5}));
        assertArrayEquals(new int[]{1,1,2,3,4,5,9,9}, Task2.task2(new int[]{1,2,4,9},new int[]{1,3,5,9}));
    }

    @Test
    void arraySort() {
        int[] array1 = {3, 2, 1};
        Task2.arraySort(array1);
        assertArrayEquals(new int[]{1, 2, 3}, array1);
        int[] array2 = {2, 4, 3, 2, 1};
        Task2.arraySort(array2);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, array2);
    }
}