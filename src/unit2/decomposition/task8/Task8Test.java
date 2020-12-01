package unit2.decomposition.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    @Test
    void whenExceptionThrown_getSumOfThreeArrayElements() {
        assertThrows(IllegalArgumentException.class,
                () -> Task8.getSumOfThreeArrayElements(new int[0], 1, 3));
        assertThrows(IllegalArgumentException.class,
                () -> Task8.getSumOfThreeArrayElements(new int[5], 0, 3));
        assertThrows(IllegalArgumentException.class,
                () -> Task8.getSumOfThreeArrayElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 7, 37));
    }

    @Test
    void getSumOfThreeArrayElements() {
        assertEquals(6,
                Task8.getSumOfThreeArrayElements(new int[]{1, 2, 3}, 1, 3));
        assertEquals(15,
                Task8.getSumOfThreeArrayElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 7, 2));
    }
}