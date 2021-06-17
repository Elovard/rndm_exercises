package by.itechartgroup.exercises.task43;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseArrayTest {

    @ParameterizedTest
    @MethodSource
    void whenCapacityOfArrayIsPositive_ThenReverseShouldBeDoneCorrectly(int[] array, String expected) {
        String actualResult = ReverseArray.reverse(array);
        assertEquals(expected, actualResult);
    }

    private static Stream<Arguments> whenCapacityOfArrayIsPositive_ThenReverseShouldBeDoneCorrectly() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, "[5, 4, 3, 2, 1]"),
                Arguments.of(new int[]{10, 15, 20, 25, 30}, "[30, 25, 20, 15, 10]"),
                Arguments.of(new int[]{96, 97, 98, 99, 100}, "[100, 99, 98, 97, 96]")
        );
    }
}