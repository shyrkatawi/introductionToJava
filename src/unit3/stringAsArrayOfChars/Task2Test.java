package unit3.stringAsArrayOfChars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void task2() {
        Assert.assertEquals("", Task2.task2(""));
        Assert.assertEquals("letter", Task2.task2("word"));
        Assert.assertEquals("1letter2", Task2.task2("1word2"));
        Assert.assertEquals("letterletter", Task2.task2("wordword"));
        Assert.assertEquals("WordletterBB", Task2.task2("WordwordBB"));
        Assert.assertEquals("aletterAAAlettera", Task2.task2("awordAAAworda"));
    }
}