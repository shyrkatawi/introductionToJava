package unit3.stringAsArrayOfChars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void genNumberOfNumbersInString() {
        Assert.assertEquals(0,Task4.genNumberOfNumbersInString(""));
        Assert.assertEquals(0,Task4.genNumberOfNumbersInString("qwe"));
        Assert.assertEquals(1,Task4.genNumberOfNumbersInString("a1"));
        Assert.assertEquals(1,Task4.genNumberOfNumbersInString("132a"));
        Assert.assertEquals(1,Task4.genNumberOfNumbersInString("301"));
        Assert.assertEquals(4,Task4.genNumberOfNumbersInString("1 10 165a14"));
    }
}