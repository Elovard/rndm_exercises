package by.itechartgroup.exercises.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

class DecimalComparatorTest {

    @ParameterizedTest
    @CsvSource({"3.175, 3.176", "4.981, 6.393", "4.395, 9.819"})
    void WhenNumbersAreNotEqualByThreeDecimalPlaces_ThenResultShouldBeFalse(double arg1, double arg2) {
        boolean actualResult = DecimalComparator.areEqualByThreeDecimalPlaces(arg1, arg2);
        assertFalse(actualResult);
    }
}