package unit3.stringOrStringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @Test
    void getMaxNumberOfConsecutiveSpaces() {
        assertEquals(0,Task1.getMaxNumberOfConsecutiveSpaces(""));
        assertEquals(0,Task1.getMaxNumberOfConsecutiveSpaces("a"));
        assertEquals(1,Task1.getMaxNumberOfConsecutiveSpaces("a "));
        assertEquals(2,Task1.getMaxNumberOfConsecutiveSpaces("  a a  "));
        assertEquals(3,Task1.getMaxNumberOfConsecutiveSpaces("  a   "));
    }
}