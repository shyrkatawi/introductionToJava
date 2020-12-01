package unit2.decomposition.task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void isPrime() {
        assertTrue(Task13.isPrime(2));
        assertTrue(Task13.isPrime(3));
        assertTrue(Task13.isPrime(5));
        assertTrue(Task13.isPrime(13));
        assertTrue(Task13.isPrime(137));

        assertFalse(Task13.isPrime(1));
        assertFalse(Task13.isPrime(4));
        assertFalse(Task13.isPrime(100));
        assertFalse(Task13.isPrime(133));
    }
}