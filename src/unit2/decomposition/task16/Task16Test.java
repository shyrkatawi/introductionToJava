package unit2.decomposition.task16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {
    @Test
    void sumOfNumbersContainingOnlyOddDigits() {
        assertEquals(9, Task16.sumOfNumbersContainingOnlyOddDigits(1, 3, 5, 12, 22));
        assertEquals(41, Task16.sumOfNumbersContainingOnlyOddDigits(12, 11, 22, 17, 13));
    }

    @Test
    void isEven() {
        assertFalse(Task16.isEven(3));
        assertFalse(Task16.isEven(33));
        assertFalse(Task16.isEven(139));

        assertTrue(Task16.isEven(2));
        assertTrue(Task16.isEven(18));
        assertTrue(Task16.isEven(144));
    }

    @Test
    void getAmountOfEvenDigits() {
        assertEquals(0, Task16.getAmountOfEvenDigits(1137));
        assertEquals(0, Task16.getAmountOfEvenDigits(9));
        assertEquals(1, Task16.getAmountOfEvenDigits(4));
        assertEquals(2, Task16.getAmountOfEvenDigits(22));
        assertEquals(3, Task16.getAmountOfEvenDigits(1124116));
    }

    @Test
    void isContainsOnlyOddDigits() {
        assertTrue(Task16.isContainsOnlyOddDigits(1));
        assertTrue(Task16.isContainsOnlyOddDigits(99));
        assertTrue(Task16.isContainsOnlyOddDigits(137));

        assertFalse(Task16.isContainsOnlyOddDigits(2));
        assertFalse(Task16.isContainsOnlyOddDigits(147));
        assertFalse(Task16.isContainsOnlyOddDigits(234));
    }
}