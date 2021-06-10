package by.itechartgroup.exercises.task8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToYearsAndDaysCalculatorTest {

    @ParameterizedTest
    @ValueSource(longs = {0, -1L, -5L})
    void WhenMinutesAreLessOrEqualToZero_ThenResultShouldBeTrue(long minutes) {
        String actualResult = MinutesToYearsAndDaysCalculator.printYearsAndDays(minutes);
        assertTrue(actualResult.equals("Invalid value"));
    }

    @ParameterizedTest
    @ValueSource(longs = {1L, 15L, 100L, 1000L, 25550L})
    void WhenMinutesAreAboveZero_ThenResultShouldBeFalse(long minutes){
        String actualResult = MinutesToYearsAndDaysCalculator.printYearsAndDays(minutes);
        assertFalse(actualResult.equals("Invalid value"));
    }
}