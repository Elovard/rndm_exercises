package by.itechartgroup.exercises.task22;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -15})
    void WhenNumberIsNegativeOrZero_ThenResultShouldBeFalse(int number) {
        boolean actualResult = PerfectNumber.isPerfectNumber(number);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @MethodSource
    void WhenNumberIsAboveZeroAndIsPerfect_ThenResultShouldBeTrue(int number) {
        boolean actualResult = PerfectNumber.isPerfectNumber(number);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenNumberIsAboveZeroAndIsPerfect_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(6),
                Arguments.of(28)
        );
    }

}