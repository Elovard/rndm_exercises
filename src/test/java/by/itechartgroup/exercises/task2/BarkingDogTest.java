package by.itechartgroup.exercises.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarkingDogTest {

    @ParameterizedTest
    @MethodSource
    void WhenHourOfDayIsInvalidValue_ThenResultShouldBeFalse(int hourOfDay, boolean barking, boolean expectedResult) {
        boolean actualResult = BarkingDog.shouldWakeUp(barking, hourOfDay);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> WhenHourOfDayIsInvalidValue_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(-10, true, false),
                Arguments.of(-25, true, false),
                Arguments.of(-1, true, false),
                Arguments.of(-10, false, false),
                Arguments.of(-25, false, false),
                Arguments.of(-1, false, false)
                // TODO: 6/10/21 add positive tests
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenHourOfDayIsWithin1And23_ThenResultShouldBeTrue(int hourOfDay, boolean barking, boolean expectedResult) {
        boolean actualResult = BarkingDog.shouldWakeUp(barking, hourOfDay);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> WhenHourOfDayIsWithin1And23_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(2, true, true),
                Arguments.of(4, true, true),
                Arguments.of(22, true, true),
                Arguments.of(5, true, true)
        );
    }
}