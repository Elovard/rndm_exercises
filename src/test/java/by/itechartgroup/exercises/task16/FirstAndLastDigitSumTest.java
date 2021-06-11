package by.itechartgroup.exercises.task16;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitSumTest {

    @Test
    void sumFirstAndLastDigit() {
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -99, -10})
    void WhenNumberIsNegative_ThenResultShouldBeTrue(int number) {
        int actualResult = FirstAndLastDigitSum.sumFirstAndLastDigit(number);
        assertTrue(actualResult == -1);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 101, 53})
    void WhenNumberIsPositiveAndSumOfItsFirstAndLastDigitIsCorrect_ThenResultShouldBeTrue(int number) {
        int actualResult = FirstAndLastDigitSum.sumFirstAndLastDigit(number);
        assertTrue(actualResult > 0);
    }
}