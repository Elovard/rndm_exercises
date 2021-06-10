package by.itechartgroup.exercises.task5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @ParameterizedTest
    @CsvSource({"1,2,3", "5,5,10", "3,6,9"})
    void WhenSumOfTwoNumbersIsEqualToThirdNumber_ThenResultShouldBeTrue(int arg1, int arg2, int arg3) {
        boolean actualResult = EqualSumChecker.hasEqualSum(arg1, arg2, arg3);
        assertTrue(actualResult);
    }
}