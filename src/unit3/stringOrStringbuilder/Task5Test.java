package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void getNumberOfChar_a() {
        Assert.assertEquals(0, Task5.getNumberOfCharSelectedChar('a', ""));
        Assert.assertEquals(0, Task5.getNumberOfCharSelectedChar('a', "qwe"));
        Assert.assertEquals(1, Task5.getNumberOfCharSelectedChar('a', "a"));
        Assert.assertEquals(1, Task5.getNumberOfCharSelectedChar('a', "gAa"));
        Assert.assertEquals(3, Task5.getNumberOfCharSelectedChar('a', "gaaa"));
    }
}