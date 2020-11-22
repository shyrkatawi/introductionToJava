package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void getNumberOfLowerAndUppercaseLetters() {
        Assert.assertArrayEquals(new int[2], Task9.getNumberOfLowerAndUppercaseLetters(""));
        Assert.assertArrayEquals(new int[2], Task9.getNumberOfLowerAndUppercaseLetters(",.123;"));
        Assert.assertArrayEquals(new int[]{1,1}, Task9.getNumberOfLowerAndUppercaseLetters("Aa"));
        Assert.assertArrayEquals(new int[]{2,4}, Task9.getNumberOfLowerAndUppercaseLetters("AA B B bb123"));
    }
}