package by.itechartgroup.exercises.task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EqualSumCheckerTest {

    @ParameterizedTest
    @MethodSource
    void WhenSumOfTwoNumbersIsEqualToThirdNumber_ThenResultShouldBeTrue(int arg1, int arg2, int arg3) {
        boolean actualResult = EqualSumChecker.hasEqualSum(arg1, arg2, arg3);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenSumOfTwoNumbersIsEqualToThirdNumber_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(1,1,2),
                Arguments.of(5,5,10),
                Arguments.of(2,2,4),
                Arguments.of(3,6,9)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenSumOfTwoNumbersIsNotEqualToThirdNumber_ThenResultShouldBeTrue(int arg1, int arg2, int arg3) {
        boolean actualResult = EqualSumChecker.hasEqualSum(arg1, arg2, arg3);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenSumOfTwoNumbersIsNotEqualToThirdNumber_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(1,1,3),
                Arguments.of(5,53,10),
                Arguments.of(21,2,4),
                Arguments.of(33,6,9)
        );
    }
}