package by.itechartgroup.exercises.task15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @ParameterizedTest
    @ValueSource(ints = {11, 55, 33, -11})
    void WhenNumberIsPalindrome_ThenResultShouldBeTrue(int number) {
        boolean actualResult = NumberPalindrome.isPalindrome(number);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 15, 65})
    void WhenNumberIsNotPalindrome_ThenResultShouldBeFalse(int number) {
        boolean actualResult = NumberPalindrome.isPalindrome(number);
        assertFalse(actualResult);
    }
}