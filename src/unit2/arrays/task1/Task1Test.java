package unit2.arrays.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void sumOfElementsThatAreMultiplesOf_k() {
        assertEquals(55, Task1.sumOfElementsThatAreMultiplesOf_k(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
        assertEquals(30, Task1.sumOfElementsThatAreMultiplesOf_k(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2));
        assertEquals(15, Task1.sumOfElementsThatAreMultiplesOf_k(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
        assertEquals(7, Task1.sumOfElementsThatAreMultiplesOf_k(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7));
    }
}