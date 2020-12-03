package unit3.stringOrStringbuilder.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void getLongestWord() {
        assertEquals("",Task8.getLongestWord(""));
        assertEquals("",Task8.getLongestWord("   "));
        assertEquals("aa",Task8.getLongestWord("aa c bb "));
        assertEquals("a234a",Task8.getLongestWord("   a aa a234a "));
    }
}