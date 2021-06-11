package by.itechartgroup.exercises.task21;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AllFactorsTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, -10})
    void WhenNumberIsNegative_ThenResultShouldBeTrue(int number) {
        String actualResult = AllFactors.printFactors(number);
        String expectedResult = "Invalid value";
        assertEquals(expectedResult, actualResult);
    }
}