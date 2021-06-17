package by.itechartgroup.exercises.task41;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SortedArrayTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, -10, -99})
    void whenArrayCapacityIsNegative_ThenExceptionShouldBeThrown(int capacity) {
        assertThrows(NegativeArraySizeException.class, () -> SortedArray.getIntegers(capacity));
    }

    @Test
    void whenArraysAreSortedCorrectly_ThenResultShouldBeTrue() {
        int[] originalArray = {21, 19, 23, 1, 10};
        int[] sortedArray = SortedArray.sortIntegers(originalArray);
        SortedArray.printArray(sortedArray);
        assertEquals(originalArray[2], sortedArray[0]);
    }

}