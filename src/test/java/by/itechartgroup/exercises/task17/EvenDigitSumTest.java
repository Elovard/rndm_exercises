package by.itechartgroup.exercises.task17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, -10, -53})
    void WhenNumberIsNegative_ThenResultShouldBeFalse(int number) {
        int actualResult = EvenDigitSum.getEvenDigitSum(number);
        assertFalse(actualResult > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {66, 39, 88})
    void WhenNumberIsPositiveAndSumIsCalculable_ThenResultShouldBeTrue(int number) {
        int actualResult = EvenDigitSum.getEvenDigitSum(number);
        assertTrue(actualResult >= 0);
    }
}