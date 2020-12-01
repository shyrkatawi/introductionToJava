package unit2.decomposition.task14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {
    @Test
    void task14() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), Task14.task14(10));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371), Task14.task14(400));
    }

    @Test
    void getAmountOfDigits() {
        assertEquals(1, Task14.getAmountOfDigits(5));
        assertEquals(3, Task14.getAmountOfDigits(566));
    }
}