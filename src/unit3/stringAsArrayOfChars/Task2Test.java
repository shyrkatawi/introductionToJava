package unit3.stringAsArrayOfChars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    void task2() {
        Assert.assertEquals("dedushkadedushka", Task2.stringReplace("babushkababushka","bab","ded"));
        Assert.assertEquals("", Task2.stringReplace("","word","letter"));
        Assert.assertEquals("b", Task2.stringReplace("a","a","b"));
        Assert.assertEquals("letter", Task2.stringReplace("word","word","letter"));
        Assert.assertEquals("1letter2", Task2.stringReplace("1word2","word","letter"));
        Assert.assertEquals("letterletter", Task2.stringReplace("wordword","word","letter"));
        Assert.assertEquals("WordletterBB", Task2.stringReplace("WordwordBB","word","letter"));
        Assert.assertEquals("aletterAAAlettera", Task2.stringReplace("awordAAAworda","word","letter"));
    }
}