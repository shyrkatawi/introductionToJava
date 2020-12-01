package unit2.decomposition.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void nod() {
        assertEquals(3, Task1.nod(9, 12));
        assertEquals(3, Task1.nod(3, 3));
        assertEquals(5, Task1.nod(10, 5));
    }

    @Test
    void nok() {
        assertEquals(36, Task1.nok(9, 12));
        assertEquals(20, Task1.nok(4, 10));
        assertEquals(33, Task1.nok(33, 11));
    }
}