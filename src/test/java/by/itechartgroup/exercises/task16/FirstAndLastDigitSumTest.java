package by.itechartgroup.exercises.task16;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstAndLastDigitSumTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, -99, -10})
    void WhenNumberIsNegative_ThenExceptionShouldBeThrown(int number) {
        assertThrows(IllegalArgumentException.class, () ->
                FirstAndLastDigitSum.sumFirstAndLastDigit(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 101, 53})
    void WhenNumberIsPositiveAndSumOfItsFirstAndLastDigitIsCorrect_ThenResultShouldBeTrue(int number) {
        int actualResult = FirstAndLastDigitSum.sumFirstAndLastDigit(number);
        assertTrue(actualResult > 0);
    }
}