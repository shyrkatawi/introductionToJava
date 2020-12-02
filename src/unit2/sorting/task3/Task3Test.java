package unit2.sorting.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    void sortingByChoiceInDescendingOrder() {
        int[] array1 = {3, 2, 1};
        Task3.sortingByChoiceInDescendingOrder(array1);
        assertArrayEquals(new int[]{3,2,1}, array1);

        int[] array2 = {1, 2, 3};
        Task3.sortingByChoiceInDescendingOrder(array2);
        assertArrayEquals(new int[]{3,2,1}, array2);

        int[] array3 = {2, 4, 3, 2, 1};
        Task3.sortingByChoiceInDescendingOrder(array3);
        assertArrayEquals(new int[]{4, 3, 2, 2, 1}, array3);
    }
}