package by.itechartgroup.exercises.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearCalculatorTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 10000, -1})
    void WhenYearIsNotValid_ThenResultShouldBeFalse(int arg1) {
        boolean actualResult = LeapYearCalculator.isLeapYear(arg1);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2003, 2015, 1915})
    void WhenYearIsNotDividedByFour_ThenResultShouldBeFalse(int arg1) {
        boolean actualResult = LeapYearCalculator.isLeapYear(arg1);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2016, 1916, 2020})
    void WhenYearIsDividedByOneHundredAndByFourHundred_ThenResultShouldBeTrue(int arg1) {
        boolean actualResult = LeapYearCalculator.isLeapYear(arg1);
        assertTrue(actualResult);
    }
}