package unit2.decomposition.task15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {
    @Test
    void task15() {
        assertEquals(Arrays.asList(0, 35, 7, 12), Task15.task15(0, 35, 96, 666, 7, 12));
        assertEquals(Arrays.asList(1, 12, 456), Task15.task15(21, 33, 1, 12, 321, 456));
    }

    @Test
    void isIncreasingSequence() {
        assertTrue(Task15.isIncreasingSequence(0));
        assertTrue(Task15.isIncreasingSequence(1));
        assertTrue(Task15.isIncreasingSequence(123));

        assertFalse(Task15.isIncreasingSequence(11));
        assertFalse(Task15.isIncreasingSequence(21));
        assertFalse(Task15.isIncreasingSequence(121));
        assertFalse(Task15.isIncreasingSequence(321));
    }
}