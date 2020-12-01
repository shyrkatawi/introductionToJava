package unit2.arrays.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    @Test
    void task7() {
        assertEquals(3, Task7.task7(new double[]{1, 2}), 0);
        assertEquals(8, Task7.task7(new double[]{1, 2, 3, 7}), 0);
        assertEquals(11, Task7.task7(new double[]{1, 2, 2, 4, 5, 3, 7, 8, 3, 5}), 0);
    }
}