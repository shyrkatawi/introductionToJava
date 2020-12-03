package unit3.stringAsArrayOfChars.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void removeExtraSpacesInString() {
        assertEquals("q q", Task5.removeExtraSpacesInString("q q"));
        assertEquals("q q", Task5.removeExtraSpacesInString("q   q"));
        assertEquals("q q", Task5.removeExtraSpacesInString("q     q  "));
        assertEquals("q q", Task5.removeExtraSpacesInString("  q    q"));
        assertEquals("q q", Task5.removeExtraSpacesInString("   q    q  "));
        assertEquals("", Task5.removeExtraSpacesInString(""));
        assertEquals("", Task5.removeExtraSpacesInString(" "));
        assertEquals("", Task5.removeExtraSpacesInString("      "));
    }
}