package by.itechartgroup.exercises.task19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {
    }

    @ParameterizedTest
    @MethodSource
    void WhenNumbersAreOutOfRange_ThenResultShouldBeFalse(int num1, int num2, int num3) {
        boolean actualResult = LastDigitChecker.hasSameLastDigit(num1, num2, num3);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenNumbersAreOutOfRange_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(1, 50, 90),
                Arguments.of(32, 9999, 43),
                Arguments.of(51, 89, -1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenNumbersAreInRangeAndHaveSameLastDigit_ThenResultShouldBeTrue(int num1, int num2, int num3) {
        boolean actualResult = LastDigitChecker.hasSameLastDigit(num1, num2, num3);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenNumbersAreInRangeAndHaveSameLastDigit_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(1, 51, 91),
                Arguments.of(32, 42, 43),
                Arguments.of(28, 88, 98)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {1, -1, 5, 1111})
    void WhenNumberIsOutOfRange_ThenResultShouldBeFalse(int number) {
        boolean actualResult = LastDigitChecker.isValid(number);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 99, 531, 72})
    void WhenNumberIsInRange_ThenResultShouldBeTrue(int number) {
        boolean actualResult = LastDigitChecker.isValid(number);
        assertTrue(actualResult);
    }
}