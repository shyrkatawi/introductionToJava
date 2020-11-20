package unit3.stringAsArrayOfChars;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void removeExtraSpacesInString() {
        Assert.assertEquals("q q", Task5.removeExtraSpacesInString("q q"));
        Assert.assertEquals("q q", Task5.removeExtraSpacesInString("q   q"));
        Assert.assertEquals("q q", Task5.removeExtraSpacesInString("q     q  "));
        Assert.assertEquals("q q", Task5.removeExtraSpacesInString("  q    q"));
        Assert.assertEquals("q q", Task5.removeExtraSpacesInString("   q    q  "));
        Assert.assertEquals("", Task5.removeExtraSpacesInString(""));
        Assert.assertEquals("", Task5.removeExtraSpacesInString(" "));
        Assert.assertEquals("", Task5.removeExtraSpacesInString("      "));
    }
}