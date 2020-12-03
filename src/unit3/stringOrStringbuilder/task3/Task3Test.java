package unit3.stringOrStringbuilder.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void isPalindrome() {
        assertTrue(Task3.isPalindrome("aa"));
        assertTrue(Task3.isPalindrome("Aa"));
        assertTrue(Task3.isPalindrome("aA"));
        assertTrue(Task3.isPalindrome("cabbBBaC"));
        assertTrue(Task3.isPalindrome("aaAaa"));
        assertTrue(Task3.isPalindrome("abccba"));

        assertFalse(Task3.isPalindrome("aB"));
        assertFalse(Task3.isPalindrome("ba"));
        assertFalse(Task3.isPalindrome("a"));
        assertFalse(Task3.isPalindrome(""));

        assertFalse(Task3.isPalindrome("aaAw"));


    }
}