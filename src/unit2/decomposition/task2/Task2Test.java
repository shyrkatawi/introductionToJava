package unit2.decomposition.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void task2() {
        assertEquals(6, Task2.task2(18, 48, 96, 222));
        assertEquals(1, Task2.task2(1, 8, 6, 2));
    }

    @Test
    void nod() {
        assertEquals(3, Task2.nod(9, 12));
        assertEquals(3, Task2.nod(3, 3));
        assertEquals(5, Task2.nod(10, 5));
    }
}