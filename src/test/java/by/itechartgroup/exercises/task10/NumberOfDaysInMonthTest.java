package by.itechartgroup.exercises.task10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 10000, -1})
    void WhenProvidedYearIsInvalid_ThenResultShouldBeFalse(int arg1) {
        boolean actualResult = NumberOfDaysInMonth.isLeapYear(arg1);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"-1, 10000", "13, -5", "-5, -1"})
    void WhenProvidedYearAndMonthAreNotValid_ThenResultShouldBeTrue(int arg1, int arg2) {
        int actualResult = NumberOfDaysInMonth.getDaysInMonth(arg1, arg2);
        assertEquals(-1, actualResult);
    }
}