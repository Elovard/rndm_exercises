package by.itechartgroup.exercises.task24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;

class FlourPackProblemTest {

    @Test
    void canPack() {
    }

    @ParameterizedTest
    @MethodSource
    void WhenOneOfValuesIsNegative_ThenResultShouldBeFalse(int bigCount, int smallCount, int goal) {
        boolean actualResult = FlourPackProblem.canPack(bigCount, smallCount, goal);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenOneOfValuesIsNegative_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(1, 1, -1),
                Arguments.of(0, -1, -99),
                Arguments.of(5, -2, 1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenGoalIsMoreThanCounts_ThenResultShouldBeFalse(int bigCount, int smallCount, int goal) {
        boolean actualResult = FlourPackProblem.canPack(bigCount, smallCount, goal);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenGoalIsMoreThanCounts_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(1, 0, 4),
                Arguments.of(1, 2, 15),
                Arguments.of(2, 2, 20)
        );
    }
}