package by.itechartgroup.exercises.task11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    @ParameterizedTest
    @CsvSource({"false, 15", "false, 0", "false, 24"})
    void WhenSummerIsFalseAndTemperatureIsOutOfRange_ThenResultShouldBeFalse(boolean arg1, int arg2) {
        boolean actualResult = PlayingCat.isCatPlaying(arg1, arg2);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"false, 26", "false, 30", "false, 35"})
    void WhenSummerIsFalseAndTemperatureIsInRange_ThenResultShouldBeTrue(boolean arg1, int arg2) {
        boolean actualResult = PlayingCat.isCatPlaying(arg1, arg2);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"true, 99", "true, 46", "true, 100"})
    void WhenSummerIsTrueAndTemperatureIsOutOfRange_ThenResultShouldBeFalse(boolean arg1, int arg2) {
        boolean actualResult = PlayingCat.isCatPlaying(arg1, arg2);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"true, 35", "true, 44", "true, 25"})
    void WhenSummerIsTrueAndTemperatureIsInRange_ThenResultShouldBeTrue(boolean arg1, int arg2) {
        boolean actualResult = PlayingCat.isCatPlaying(arg1, arg2);
        assertTrue(actualResult);
    }
}