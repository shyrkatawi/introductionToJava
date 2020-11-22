package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void getLongestWord() {
        Assert.assertEquals("",Task8.getLongestWord(""));
        Assert.assertEquals("",Task8.getLongestWord("   "));
        Assert.assertEquals("aa",Task8.getLongestWord("aa c bb "));
        Assert.assertEquals("a234a",Task8.getLongestWord("   a aa a234a "));
    }
}