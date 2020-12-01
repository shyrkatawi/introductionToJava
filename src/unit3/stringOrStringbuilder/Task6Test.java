package unit3.stringOrStringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Task6Test {

    @Test
    void task2() {
        assertEquals("", Task6.addAfterEveryCharCopyOfChar(""));
        assertEquals("bb::aa", Task6.addAfterEveryCharCopyOfChar("b:a"));
        assertEquals("aa", Task6.addAfterEveryCharCopyOfChar("a"));
        assertEquals("1111112233", Task6.addAfterEveryCharCopyOfChar("11123"));
        assertEquals("AABBCC", Task6.addAfterEveryCharCopyOfChar("ABC"));
    }
}