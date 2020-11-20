package unit3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MethodsUnit3Test {

    @Test
    void toLowerCase_checkLetter() {
        Assert.assertEquals('a', MethodsUnit3.toLowerCase('A'));
        Assert.assertEquals('z', MethodsUnit3.toLowerCase('Z'));
    }

    @Test
    void toLowerCase_checkNotLetter() {
        Assert.assertEquals('1', MethodsUnit3.toLowerCase('1'));
        Assert.assertEquals(':', MethodsUnit3.toLowerCase(':'));
        Assert.assertEquals(' ', MethodsUnit3.toLowerCase(' '));
    }


    @Test
    void isDigit_checkDigit() {
        Assert.assertTrue(MethodsUnit3.isDigit('0'));
        Assert.assertTrue(MethodsUnit3.isDigit('9'));
    }

    @Test
    void isDigit_checkNotDigit() {
        Assert.assertFalse(MethodsUnit3.isDigit(' '));
        Assert.assertFalse(MethodsUnit3.isDigit('d'));
        Assert.assertFalse(MethodsUnit3.isDigit('D'));
        Assert.assertFalse(MethodsUnit3.isDigit('+'));
        Assert.assertFalse(MethodsUnit3.isDigit(':'));
    }

    @Test
    void toUpperCase_checkLetter() {
        Assert.assertEquals('A', MethodsUnit3.toUpperCase('a'));
        Assert.assertEquals('Z', MethodsUnit3.toUpperCase('z'));
    }

    @Test
    void toUpperCase_checkNotLetter() {
        Assert.assertEquals('2', MethodsUnit3.toUpperCase('2'));
        Assert.assertEquals(';', MethodsUnit3.toUpperCase(';'));
        Assert.assertEquals(' ', MethodsUnit3.toUpperCase(' '));
    }
}