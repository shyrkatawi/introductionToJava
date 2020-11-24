package unit3.da;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void splitStringToParagraphs() {
        Assert.assertArrayEquals(new String[]{}, Task1.splitStringToParagraphs("\n"));
        Assert.assertArrayEquals(new String[]{}, Task1.splitStringToParagraphs("\n\n\n\n"));
        Assert.assertArrayEquals(new String[]{""}, Task1.splitStringToParagraphs(""));
        Assert.assertArrayEquals(new String[]{"asd"}, Task1.splitStringToParagraphs("asd"));
        Assert.assertArrayEquals(new String[]{"1", "\t1"}, Task1.splitStringToParagraphs("1\n\t1"));
        Assert.assertArrayEquals(new String[]{"G", "", "", "G"}, Task1.splitStringToParagraphs("G\n\n\nG"));
    }

    @Test
    void sortParagraphsByNumberOfSentences() {
        Assert.assertEquals("", Task1.sortParagraphsByNumberOfSentences(""));
        Assert.assertEquals("a\nb", Task1.sortParagraphsByNumberOfSentences("a\nb"));
        Assert.assertEquals("b!?\nc...\na!aa!",
                Task1.sortParagraphsByNumberOfSentences("a!aa!\nb!?\nc..."));
        Assert.assertEquals("c\na!aa!\nb...bb!?bbb?\nd.d.d.d.",
                Task1.sortParagraphsByNumberOfSentences("d.d.d.d.\na!aa!\nb...bb!?bbb?\nc"));

    }

    @Test
    void countWordLength() {
        Assert.assertEquals(0, Task1.calculateWordLength(""));
        Assert.assertEquals(0, Task1.calculateWordLength(", , ,"));
        Assert.assertEquals(1, Task1.calculateWordLength("a"));
        Assert.assertEquals(6, Task1.calculateWordLength("abc123,"));
    }

    @Test
    void sortWordsByLength() {
        Assert.assertEquals("", Task1.sortWordsByLength(""));
        Assert.assertEquals("a1 b2b", Task1.sortWordsByLength("b2b a1"));
        Assert.assertEquals("a, bb", Task1.sortWordsByLength("bb a,"));
        Assert.assertEquals("a c!!! bb,", Task1.sortWordsByLength("bb, a c!!!"));
    }
}