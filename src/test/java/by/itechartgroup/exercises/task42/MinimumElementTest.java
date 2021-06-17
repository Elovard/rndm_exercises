package by.itechartgroup.exercises.task42;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinimumElementTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, -13, -10})
    void whenArrayCapacityIsNegative_ThenExceptionShouldBeThrown(int capacity) {
        assertThrows(NegativeArraySizeException.class, () -> MinimumElement.readIntegers(capacity));
    }

    @Test
    void whenArrayCapacityIsPositive_ThenMinValueShouldBeCalculatedCorrectly() {
        int[] array = {4, 5, 33, 15, 27};
        assertEquals(array[0], MinimumElement.findMin(array));
    }

}