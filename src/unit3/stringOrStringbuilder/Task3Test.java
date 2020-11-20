package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void isPalindrome() {
        Assert.assertTrue(Task3.isPalindrome("aa"));
        Assert.assertTrue(Task3.isPalindrome("Aa"));
        Assert.assertTrue(Task3.isPalindrome("aA"));
        Assert.assertTrue(Task3.isPalindrome("cabbBBaC"));
        Assert.assertTrue(Task3.isPalindrome("aaAaa"));
        Assert.assertTrue(Task3.isPalindrome("abccba"));

        Assert.assertFalse(Task3.isPalindrome("aB"));
        Assert.assertFalse(Task3.isPalindrome("ba"));
        Assert.assertFalse(Task3.isPalindrome("a"));
        Assert.assertFalse(Task3.isPalindrome(""));


    }
}