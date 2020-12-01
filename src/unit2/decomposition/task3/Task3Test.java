package unit2.decomposition.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    void whenExceptionThrown_areaOfRegularHexagon() {
        assertThrows(IllegalArgumentException.class, () -> {
            Task3.areaOfRegularHexagon(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Task3.areaOfRegularHexagon(-12);
        });
    }

    @Test
    void areaOfRegularHexagon() {
        assertEquals(41.569, Task3.areaOfRegularHexagon(4));
        assertEquals(314.367, Task3.areaOfRegularHexagon(11));
    }
}