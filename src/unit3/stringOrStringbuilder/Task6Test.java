package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task6Test {

    @Test
    void task2() {
        Assert.assertEquals("", Task6.addAfterEveryCharCopyOfChar(""));
        Assert.assertEquals("bb::aa", Task6.addAfterEveryCharCopyOfChar("b:a"));
        Assert.assertEquals("aa", Task6.addAfterEveryCharCopyOfChar("a"));
        Assert.assertEquals("1111112233", Task6.addAfterEveryCharCopyOfChar("11123"));
        Assert.assertEquals("AABBCC", Task6.addAfterEveryCharCopyOfChar("ABC"));
    }
}