package by.itechartgroup.exercises.task13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @ParameterizedTest
    @CsvSource({"21, 1, 99", "20, 45, 30", "43, 23, 53"})
    void WhenAgesAreUnder13AndBelow19_ThenResultShouldBeFalse(int arg1, int arg2, int arg3) {
        boolean actualResult = TeenNumberChecker.hasTeen(arg1, arg2, arg3);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"15, 16,17", "13, 18, 16", "14, 15, 18"})
    void WhenAgesAreWithin13And19_ThenResultShouldBeTrue(int arg1, int arg2, int arg3) {
        boolean actualResult = TeenNumberChecker.hasTeen(arg1, arg2, arg3);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 22, 54})
    void WhenAgeIsUnder13AndBelow19_ThenResultShouldBeFalse(int arg1) {
        boolean actualResult = TeenNumberChecker.isTeen(arg1);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 17, 15})
    void WhenAgeIsWithin13And19_ThenResultShouldBeTrue(int arg1) {
        boolean actualResult = TeenNumberChecker.isTeen(arg1);
        assertTrue(actualResult);
    }
}