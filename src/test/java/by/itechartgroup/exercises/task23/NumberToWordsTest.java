package by.itechartgroup.exercises.task23;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

    @ParameterizedTest
    @ValueSource(ints = {-99, -1, -13})
    void WhenNumberIsNegativeInDigitCount_ThenResultShouldBeFalse(int num) {
        int actualResult = NumberToWords.getDigitCount(num);
        assertFalse(actualResult > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 23})
    void WhenNumberIsPositiveInDigitCount_ThenResultShouldBeTrue(int num) {
        int actualResult = NumberToWords.getDigitCount(num);
        assertTrue(actualResult > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {35, 67, 89})
    void WhenNumberIsReversedCorrect_ThenResultShouldBeTrue(int num) {
        int actualResult = NumberToWords.reverse(num);
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(num));
        assertEquals(sb.reverse().toString(), String.valueOf(actualResult));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -15, -99})
    void WhenNumberInNumberToWordsMethodIsNegative_ThenResultShouldBeFalse(int num){
        String actualResult = NumberToWords.numberToWords(num);
        String expectedResult = "Invalid value";
        assertEquals(expectedResult, actualResult);
    }

    // TODO: 6/11/21 Ask the master about the error below (Expected in console - "Six", but provided with "Six Seven" in test)

    @ParameterizedTest
    @MethodSource
    void WhenNumberIsAboveZero_ThenResultShouldBeTrue(int num, String expectedResult){
        String actualResult = NumberToWords.numberToWords(num);
        assertEquals(actualResult, expectedResult);
    }

    private static Stream<Arguments> WhenNumberIsAboveZero_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(67, "Six Seven "),
                Arguments.of(95, "Nine Five "),
                Arguments.of(43, "Four Three ")
        );
    }
}