package unit3.stringOrStringbuilder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void deleteDuplicatesAndAllSpaces() {
        Assert.assertEquals("",Task7.deleteDuplicatesAndAllSpaces(""));
        Assert.assertEquals("",Task7.deleteDuplicatesAndAllSpaces(" "));
        Assert.assertEquals("a",Task7.deleteDuplicatesAndAllSpaces("a"));
        Assert.assertEquals("a",Task7.deleteDuplicatesAndAllSpaces("  a    "));
        Assert.assertEquals(";cab",Task7.deleteDuplicatesAndAllSpaces("  ;;cccc aaaa b baaa    "));
        Assert.assertEquals("abcdefABC123",Task7.deleteDuplicatesAndAllSpaces("abc cde defABccC112AA233"));
    }
}