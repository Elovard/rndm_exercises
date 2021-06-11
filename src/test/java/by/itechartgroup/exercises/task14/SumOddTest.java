package by.itechartgroup.exercises.task14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOddTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9})
    void WhenNumberIsAboveZero_ThenResultShouldBeTrue(int number) {
        boolean actualResult = SumOdd.isOdd(number);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, -99})
    void WhenNumberIsBelowZeroOrNegative_ThenResultShouldBeFalse(int number) {
        boolean actualResult = SumOdd.isOdd(number);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @MethodSource
    void WhenStartOrEndPointsAreBelowZero_ThenResultShouldBeFalse(int start, int end) {
        int actualResult = SumOdd.sumOdd(start, end);
        assertEquals(-1, actualResult);
    }

    private static Stream<Arguments> WhenStartOrEndPointsAreBelowZero_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(-1, 10),
                Arguments.of(0, -5),
                Arguments.of(-5, -5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenStartOrEndPointsAreInRange_ThenResultShouldBeTrue(int start, int end) {
        int actualResult = SumOdd.sumOdd(start, end);
        assertTrue(actualResult > -1);
    }

    private static Stream<Arguments> WhenStartOrEndPointsAreInRange_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(1, 10),
                Arguments.of(1, 5),
                Arguments.of(3, 5)
        );
    }
}