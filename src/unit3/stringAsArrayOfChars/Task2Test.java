package unit3.stringAsArrayOfChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {

    @Test
    void task2() {
        assertEquals("dedushkadedushka", Task2.stringReplace("babushkababushka","bab","ded"));
        assertEquals("", Task2.stringReplace("","word","letter"));
        assertEquals("b", Task2.stringReplace("a","a","b"));
        assertEquals("letter", Task2.stringReplace("word","word","letter"));
        assertEquals("1letter2", Task2.stringReplace("1word2","word","letter"));
        assertEquals("letterletter", Task2.stringReplace("wordword","word","letter"));
        assertEquals("WordletterBB", Task2.stringReplace("WordwordBB","word","letter"));
        assertEquals("aletterAAAlettera", Task2.stringReplace("awordAAAworda","word","letter"));
    }
}