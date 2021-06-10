package by.itechartgroup.exercises.task10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NumberOfDaysInMonthTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 10000, -1})
    void WhenProvidedYearIsInvalid_ThenResultShouldBeFalse(int arg1) {
        boolean actualResult = NumberOfDaysInMonth.isLeapYear(arg1);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @MethodSource
    void WhenProvidedYearAndMonthAreNotValid_ThenResultShouldBeTrue(int month, int year) {
        int actualResult = NumberOfDaysInMonth.getDaysInMonth(month, year);
        assertEquals(-1, actualResult);
    }

    private static Stream<Arguments> WhenProvidedYearAndMonthAreNotValid_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(-1, 10000),
                Arguments.of(13, -1),
                Arguments.of(15, -30)
        );
    }

}