package unit3.stringAsArrayOfChars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void fromCamelToSnakeCase_strLengthIsZero() {
        Assert.assertEquals("", Task1.fromCamelToSnakeCase(""));
    }

    @Test
    void fromCamelToSnakeCase_strLengthIsOne() {
        Assert.assertEquals("a", Task1.fromCamelToSnakeCase("a"));
        Assert.assertEquals("Z", Task1.fromCamelToSnakeCase("Z"));
        Assert.assertEquals("1", Task1.fromCamelToSnakeCase("1"));
    }

    @Test
    void fromCamelToSnakeCase() {
        Assert.assertEquals("camel_case", Task1.fromCamelToSnakeCase("camelCase"));
        Assert.assertEquals("camel_c_c", Task1.fromCamelToSnakeCase("camelCC"));
        Assert.assertEquals("a_a", Task1.fromCamelToSnakeCase("aA"));
    }

    @Test
    void task1() {
        Assert.assertArrayEquals(
                new String[]{"camel_case", "da", "one_two_three"},
                Task1.task1(new String[]{"camelCase", "da", "oneTwoThree"}));
    }
}