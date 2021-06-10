package by.itechartgroup.exercises.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

class BarkingDogTest {

    @ParameterizedTest
    @ValueSource(ints = {-10, 25, -1})
    void WhenBarkingIsTrueAndHourOfDayIsNotValid_ThenResultShouldBeFalse(int arg) {
        boolean barking = true;
        boolean actualResult = BarkingDog.shouldWakeUp(barking, arg);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 25, -1})
    void WhenBarkingIsFalseAndHourOfDayIsNotValid_ThenResultShouldBeFalse(int arg) {
        boolean barking = false;
        boolean actualResult = BarkingDog.shouldWakeUp(barking, arg);
        assertFalse(actualResult);
    }

}