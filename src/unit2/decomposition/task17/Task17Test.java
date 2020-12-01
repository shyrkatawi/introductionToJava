package unit2.decomposition.task17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {
    @Test
    void task17() {
        assertEquals(1,Task17.task17(1));
        assertEquals(6,Task17.task17(11));
        assertEquals(2,Task17.task17(19));
    }

    @Test
    void getSumFromNumberDigits() {
        assertEquals(0,Task17.getSumFromNumberDigits(0));
        assertEquals(1,Task17.getSumFromNumberDigits(1));
        assertEquals(5,Task17.getSumFromNumberDigits(23));
        assertEquals(3,Task17.getSumFromNumberDigits(111));
    }
}