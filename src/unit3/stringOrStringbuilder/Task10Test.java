package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void getCountOfSentences() {
        Assert.assertEquals(0, Task10.getCountOfSentences(""));
        Assert.assertEquals(0, Task10.getCountOfSentences("2ad"));
        Assert.assertEquals(3, Task10.getCountOfSentences("a. aa!?!!! ads?"));
    }
}