package unit3.stringAsArrayOfChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void getNumberOfDigitsInString() {
        assertEquals(0, Task3.getNumberOfDigitsInString(""));
        assertEquals(0, Task3.getNumberOfDigitsInString("A"));
        assertEquals(3, Task3.getNumberOfDigitsInString("A123"));
        assertEquals(1, Task3.getNumberOfDigitsInString("1"));
    }
}