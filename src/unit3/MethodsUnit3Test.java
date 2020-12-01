package unit3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsUnit3Test {

    @Test
    void toLowerCase_checkLetter() {
        assertEquals('a', MethodsUnit3.toLowerCase('A'));
        assertEquals('z', MethodsUnit3.toLowerCase('Z'));
    }

    @Test
    void toLowerCase_checkNotLetter() {
        assertEquals('1', MethodsUnit3.toLowerCase('1'));
        assertEquals(':', MethodsUnit3.toLowerCase(':'));
        assertEquals(' ', MethodsUnit3.toLowerCase(' '));
    }


    @Test
    void isDigit_checkDigit() {
        assertTrue(MethodsUnit3.isDigit('0'));
        assertTrue(MethodsUnit3.isDigit('9'));
    }

    @Test
    void isDigit_checkNotDigit() {
        assertFalse(MethodsUnit3.isDigit(' '));
        assertFalse(MethodsUnit3.isDigit('d'));
        assertFalse(MethodsUnit3.isDigit('D'));
        assertFalse(MethodsUnit3.isDigit('+'));
        assertFalse(MethodsUnit3.isDigit(':'));
    }

    @Test
    void toUpperCase_checkLetter() {
        assertEquals('A', MethodsUnit3.toUpperCase('a'));
        assertEquals('Z', MethodsUnit3.toUpperCase('z'));
    }

    @Test
    void toUpperCase_checkNotLetter() {
        assertEquals('2', MethodsUnit3.toUpperCase('2'));
        assertEquals(';', MethodsUnit3.toUpperCase(';'));
        assertEquals(' ', MethodsUnit3.toUpperCase(' '));
    }
}