package by.itechartgroup.exercises.task18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SharedDigitTest {

    @Test
    void hasSharedDigit() {
    }

    @ParameterizedTest
    @MethodSource
    void WhenNumbersAreOutOfRange_ThenResultShouldBeFalse(int x, int y) {
        boolean actualResult = SharedDigit.hasSharedDigit(x, y);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenNumbersAreOutOfRange_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(-1, 9),
                Arguments.of(10, 100),
                Arguments.of(9, 53)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenNumbersDontHaveSharedDigit_ThenResultShouldBeFalse(int x, int y) {
        boolean actualResult = SharedDigit.hasSharedDigit(x, y);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenNumbersDontHaveSharedDigit_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(10, 22),
                Arguments.of(75, 43),
                Arguments.of(65, 12)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenNumbersHaveSharedDigit_ThenResultShouldBeTrue(int x, int y) {
        boolean actualResult = SharedDigit.hasSharedDigit(x, y);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenNumbersHaveSharedDigit_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(11, 21),
                Arguments.of(18, 81),
                Arguments.of(99, 19)
        );
    }
}