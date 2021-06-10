package by.itechartgroup.exercises.task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DecimalComparatorTest {

    @ParameterizedTest
    @MethodSource
    void WhenNumbersAreNotEqualByThreeDecimalPlaces_ThenResultShouldBeFalse(double arg1, double arg2) {
        boolean actualResult = DecimalComparator.areEqualByThreeDecimalPlaces(arg1, arg2);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenNumbersAreNotEqualByThreeDecimalPlaces_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(8.219D, 3.176D),
                Arguments.of(4.981D, 6.393D),
                Arguments.of(4.395D, 9.819D)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenNumbersAreEqualByThreeDecimalPlaces_ThenResultShouldBeTrue(double arg1, double arg2) {
        boolean actualResult = DecimalComparator.areEqualByThreeDecimalPlaces(arg1, arg2);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenNumbersAreEqualByThreeDecimalPlaces_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(3.123D, 3.123D),
                Arguments.of(3.1756D, 3.175D),
                Arguments.of(3.0D, 3.0D)
        );
    }
}