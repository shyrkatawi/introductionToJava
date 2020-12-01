package unit2.decomposition.task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {
    @Test
    void task10() {
        assertArrayEquals(new int[]{0}, Task10.task10(0));
        assertArrayEquals(new int[]{1,2,3,4}, Task10.task10(1234));
        assertArrayEquals(new int[]{1,2}, Task10.task10(12));
    }

    @Test
    void getAmountOfDigits() {
        assertEquals(1,Task10.getAmountOfDigits(0));
        assertEquals(2,Task10.getAmountOfDigits(12));
        assertEquals(4,Task10.getAmountOfDigits(1111));
    }
}