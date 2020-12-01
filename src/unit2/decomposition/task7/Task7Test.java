package unit2.decomposition.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    @Test
    void sumOfFactorialsInRange_withOdd() {
        assertEquals(368047,Task7.sumOfFactorialsInRange(1,9,true));
        assertEquals(127,Task7.sumOfFactorialsInRange(1,6,true));
    }

    @Test
    void sumOfFactorialsInRange_withEven() {
        assertEquals(26,Task7.sumOfFactorialsInRange(1,4,false));
        assertEquals(746,Task7.sumOfFactorialsInRange(2,7,false));
    }

    @Test
    void getFactorial() {
        assertEquals(120, Task7.getFactorial(5));
        assertEquals(39916800, Task7.getFactorial(11));
        assertEquals(479001600, Task7.getFactorial(12));
    }
}