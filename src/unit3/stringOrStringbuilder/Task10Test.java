package unit3.stringOrStringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void getCountOfSentences() {
        assertEquals(0, Task10.getCountOfSentences(""));
        assertEquals(1, Task10.getCountOfSentences("2,a,d"));
        assertEquals(1, Task10.getCountOfSentences(",,,!!2ad"));
        assertEquals(3, Task10.getCountOfSentences("!!! a. aa!?   !   !! ads?"));
    }
}