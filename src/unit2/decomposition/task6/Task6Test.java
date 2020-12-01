package unit2.decomposition.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @Test
    void areNumbersMutuallyPrime() {
        assertFalse(Task6.areNumbersMutuallyPrime(15,15,45));
        assertFalse(Task6.areNumbersMutuallyPrime(11,11,33));

        assertTrue(Task6.areNumbersMutuallyPrime(12,11,33));
        assertTrue(Task6.areNumbersMutuallyPrime(13,11,33));
    }

    @Test
    void nod() {
        assertEquals(3, Task6.nod(9, 12));
        assertEquals(3, Task6.nod(3, 3));
        assertEquals(5, Task6.nod(10, 5));
    }
}