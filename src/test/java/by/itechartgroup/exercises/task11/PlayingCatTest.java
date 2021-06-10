package by.itechartgroup.exercises.task11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlayingCatTest {

    @ParameterizedTest
    @MethodSource
    void WhenSummerIsFalseAndTemperatureIsOutOfRange_ThenResultShouldBeFalse(boolean summer, int hourOfDay) {
        boolean actualResult = PlayingCat.isCatPlaying(summer, hourOfDay);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @MethodSource
    void WhenSummerIsFalseAndTemperatureIsInRange_ThenResultShouldBeTrue(boolean summer, int hourOfDay) {
        boolean actualResult = PlayingCat.isCatPlaying(summer, hourOfDay);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenSummerIsFalseAndTemperatureIsOutOfRange_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(false, 15),
                Arguments.of(false, 0),
                Arguments.of(false, 24)
        );
    }

    private static Stream<Arguments> WhenSummerIsFalseAndTemperatureIsInRange_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(false, 25),
                Arguments.of(false, 30),
                Arguments.of(false, 31)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenSummerIsTrueAndTemperatureIsOutOfRange_ThenResultShouldBeFalse(boolean summer, int hourOfDay) {
        boolean actualResult = PlayingCat.isCatPlaying(summer, hourOfDay);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @MethodSource
    void WhenSummerIsTrueAndTemperatureIsInRange_ThenResultShouldBeTrue(boolean summer, int hourOfDay) {
        boolean actualResult = PlayingCat.isCatPlaying(summer, hourOfDay);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenSummerIsTrueAndTemperatureIsOutOfRange_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(true, 99),
                Arguments.of(true, 46),
                Arguments.of(true, 100)
        );
    }

    private static Stream<Arguments> WhenSummerIsTrueAndTemperatureIsInRange_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(true, 26),
                Arguments.of(true, 31),
                Arguments.of(true, 42)
        );
    }
}