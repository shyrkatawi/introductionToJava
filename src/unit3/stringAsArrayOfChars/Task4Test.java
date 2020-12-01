package unit3.stringAsArrayOfChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void genNumberOfNumbersInString() {
        assertEquals(0, Task4.genNumberOfNumbersInString(""));
        assertEquals(0, Task4.genNumberOfNumbersInString("qwe"));
        assertEquals(1, Task4.genNumberOfNumbersInString("a1"));
        assertEquals(1, Task4.genNumberOfNumbersInString("132a"));
        assertEquals(1, Task4.genNumberOfNumbersInString("301"));
        assertEquals(4, Task4.genNumberOfNumbersInString("1 10 165a14"));
    }
}