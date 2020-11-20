package unit3.stringAsArrayOfChars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void getNumberOfDigitsInString() {
        Assert.assertEquals(0, Task3.getNumberOfDigitsInString(""));
        Assert.assertEquals(0, Task3.getNumberOfDigitsInString("A"));
        Assert.assertEquals(3, Task3.getNumberOfDigitsInString("A123"));
        Assert.assertEquals(1, Task3.getNumberOfDigitsInString("1"));
    }
}