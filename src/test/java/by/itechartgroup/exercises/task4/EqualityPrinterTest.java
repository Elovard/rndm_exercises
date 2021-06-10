package by.itechartgroup.exercises.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EqualityPrinterTest {


    // TODO: 6/10/21 add tests


    @ParameterizedTest
    @MethodSource
    void WhenNumbersAreNegative_ThenResultShouldBeFalse(int arg1, int arg2, int arg3) {
        String expectedResult = "Invalid value";
        String actualResult = EqualityPrinter.printEqual(arg1, arg2, arg3);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> WhenNumbersAreNegative_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(-1, -3, -5),
                Arguments.of(-10, -12, -15),
                Arguments.of(-99, -98, -97)
        );
    }
}