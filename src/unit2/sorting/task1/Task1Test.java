package unit2.sorting.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void task1() {
        assertArrayEquals(new int[]{2,3,1,4}, Task1.task1(new int[]{1,4},new int[]{2,3},1));
        assertArrayEquals(new int[]{1,2,3,4}, Task1.task1(new int[]{1,4},new int[]{2,3},2));
        assertArrayEquals(new int[]{1,4,2,3}, Task1.task1(new int[]{1,4},new int[]{2,3},3));
    }
}