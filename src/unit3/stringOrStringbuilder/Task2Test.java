package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    void task2() {
        Assert.assertEquals("", Task2.addAfterEveryChar_a_Char_b(""));
        Assert.assertEquals("b:ab", Task2.addAfterEveryChar_a_Char_b("b:a"));
        Assert.assertEquals("b", Task2.addAfterEveryChar_a_Char_b("b"));
        Assert.assertEquals("ab", Task2.addAfterEveryChar_a_Char_b("a"));
        Assert.assertEquals("A", Task2.addAfterEveryChar_a_Char_b("A"));
        Assert.assertEquals("abcabcab", Task2.addAfterEveryChar_a_Char_b("acaca"));
    }
}