package by.itechartgroup.exercises.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, -10.0, -5.0})
    void WhenRadiusIsNegative_ThenResultShouldBeNegative(double arg) {
        double actualResult = AreaCalculator.area(arg);
        assertEquals(-1, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"-1, -1", "-5, -10", "-3, -9"})
    void WhenArgumentsAreNegative_ThenResultShouldBeTrue(double arg1, double arg2) {
        assertTrue(arg1 < 0);
        assertTrue(arg2 < 0);
    }
}