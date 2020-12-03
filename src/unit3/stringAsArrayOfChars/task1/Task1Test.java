package unit3.stringAsArrayOfChars.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @Test
    void fromCamelToSnakeCase_strLengthIsZero() {
        assertEquals("", Task1.fromCamelToSnakeCase(""));
    }

    @Test
    void fromCamelToSnakeCase_strLengthIsOne() {
        assertEquals("a", Task1.fromCamelToSnakeCase("a"));
        assertEquals("Z", Task1.fromCamelToSnakeCase("Z"));
        assertEquals("1", Task1.fromCamelToSnakeCase("1"));
    }

    @Test
    void fromCamelToSnakeCase() {
        assertEquals("camel_case", Task1.fromCamelToSnakeCase("camelCase"));
        assertEquals("camel_c_c", Task1.fromCamelToSnakeCase("camelCC"));
        assertEquals("a_a", Task1.fromCamelToSnakeCase("aA"));
    }

    @Test
    void task1() {
        assertArrayEquals(
                new String[]{"camel_case", "da", "one_two_three"},
                Task1.task1(new String[]{"camelCase", "da", "oneTwoThree"}));
    }
}