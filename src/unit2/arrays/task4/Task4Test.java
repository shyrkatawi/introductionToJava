package unit2.arrays.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    void getArrayWithSwappedMinMaxElements() {
        assertArrayEquals(new double[]{0}, Task4.getArrayWithSwappedMinMaxElements(new double[]{0}), 0);
        assertArrayEquals(new double[]{1.0, 2.0}, Task4.getArrayWithSwappedMinMaxElements(new double[]{2, 1}), 0);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, -3.0, 0.0, -1.0, -2.0, 4.0}, Task4.getArrayWithSwappedMinMaxElements(new double[]{1, 2, 3, 4, 0, 0, -1, -2, -3}), 0);
    }
}