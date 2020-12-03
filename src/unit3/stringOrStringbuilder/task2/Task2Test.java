package unit3.stringOrStringbuilder.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {

    @Test
    void task2() {
        assertEquals("", Task2.addAfterEveryChar_a_Char_b(""));
        assertEquals("b:ab", Task2.addAfterEveryChar_a_Char_b("b:a"));
        assertEquals("b", Task2.addAfterEveryChar_a_Char_b("b"));
        assertEquals("ab", Task2.addAfterEveryChar_a_Char_b("a"));
        assertEquals("A", Task2.addAfterEveryChar_a_Char_b("A"));
        assertEquals("abcabcab", Task2.addAfterEveryChar_a_Char_b("acaca"));
    }
}