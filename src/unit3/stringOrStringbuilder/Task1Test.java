package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void getMaxNumberOfConsecutiveSpaces() {
        Assert.assertEquals(0,Task1.getMaxNumberOfConsecutiveSpaces(""));
        Assert.assertEquals(0,Task1.getMaxNumberOfConsecutiveSpaces("a"));
        Assert.assertEquals(1,Task1.getMaxNumberOfConsecutiveSpaces("a "));
        Assert.assertEquals(2,Task1.getMaxNumberOfConsecutiveSpaces("  a a  "));
        Assert.assertEquals(3,Task1.getMaxNumberOfConsecutiveSpaces("  a   "));
    }
}