package by.itechartgroup.exercises.task20;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;

class GreatestCommonDivisorTest {

    @ParameterizedTest
    @MethodSource
    void WhenOneNumberIsBelowMinValue_ThenResultShouldBeFalse(int num1, int num2) {
        int actualResult = GreatestCommonDivisor.getGreatestCommonDivisor(num1, num2);
        assertFalse(actualResult > 0);
    }

    private static Stream<Arguments> WhenOneNumberIsBelowMinValue_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(9, 10),
                Arguments.of(-1, -2),
                Arguments.of(15, 2)
        );
    }
}