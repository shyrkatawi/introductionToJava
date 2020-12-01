package unit3.stringOrStringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void deleteDuplicatesAndAllSpaces() {
        assertEquals("",Task7.deleteDuplicatesAndAllSpaces(""));
        assertEquals("",Task7.deleteDuplicatesAndAllSpaces(" "));
        assertEquals("a",Task7.deleteDuplicatesAndAllSpaces("a"));
        assertEquals("a",Task7.deleteDuplicatesAndAllSpaces("  a    "));
        assertEquals(";cab",Task7.deleteDuplicatesAndAllSpaces("  ;;cccc aaaa b baaa    "));
        assertEquals("abcdefABC123",Task7.deleteDuplicatesAndAllSpaces("abc cde defABccC112AA233"));
    }
}