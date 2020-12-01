package unit3.da;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @Test
    void splitStringToParagraphs() {
        assertArrayEquals(new String[]{}, Task1.splitStringToParagraphs("\n"));
        assertArrayEquals(new String[]{}, Task1.splitStringToParagraphs("\n\n\n\n"));
        assertArrayEquals(new String[]{""}, Task1.splitStringToParagraphs(""));
        assertArrayEquals(new String[]{"asd"}, Task1.splitStringToParagraphs("asd"));
        assertArrayEquals(new String[]{"1", "\t1"}, Task1.splitStringToParagraphs("1\n\t1"));
        assertArrayEquals(new String[]{"G", "", "", "G"}, Task1.splitStringToParagraphs("G\n\n\nG"));
    }

    @Test
    void sortParagraphsByNumberOfSentences() {
        assertEquals("", Task1.sortParagraphsByNumberOfSentences(""));
        assertEquals("a\nb", Task1.sortParagraphsByNumberOfSentences("a\nb"));
        assertEquals("b!?\nc...\na!aa!",
                Task1.sortParagraphsByNumberOfSentences("a!aa!\nb!?\nc..."));
        assertEquals("c\na!aa!\nb...bb!?bbb?\nd.d.d.d.",
                Task1.sortParagraphsByNumberOfSentences("d.d.d.d.\na!aa!\nb...bb!?bbb?\nc"));

    }

    @Test
    void countWordLength() {
        assertEquals(0, Task1.calculateWordLength(""));
        assertEquals(0, Task1.calculateWordLength(", , ,"));
        assertEquals(1, Task1.calculateWordLength("a"));
        assertEquals(6, Task1.calculateWordLength("abc123,"));
    }

    @Test
    void sortWordsByLength() {
        assertEquals("", Task1.sortWordsByLength(""));
        assertEquals("a1 b2b", Task1.sortWordsByLength("b2b a1"));
        assertEquals("a, bb", Task1.sortWordsByLength("bb a,"));
        assertEquals("a c!!! bb,", Task1.sortWordsByLength("bb, a c!!!"));
    }
}