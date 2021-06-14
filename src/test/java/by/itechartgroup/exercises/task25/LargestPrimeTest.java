package by.itechartgroup.exercises.task25;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeTest {

    @Test
    void getLargestPrime() {
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, -15, -33})
    void WhenNumberIsNegativeOrZero_ThenResultShouldBeFalse(int number) {
        int actualResult = LargestPrime.getLargestPrime(number);
        assertFalse(actualResult > 0);
    }

    @ParameterizedTest
    @MethodSource
    void WhenPrimeNumberIsFoundCorrectly_ThenResultShouldBeTrue(int number, int primeAnswer) {
        int actualResult = LargestPrime.getLargestPrime(number);
        assertTrue(actualResult > -1);
    }

    private static Stream<Arguments> WhenPrimeNumberIsFoundCorrectly_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(21, 7),
                Arguments.of(217, 31),
                Arguments.of(45, 5)
        );
    }
}