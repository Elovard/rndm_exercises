package by.itechartgroup.exercises;

import by.itechartgroup.exercises.task2.BarkingDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class BarkingDogTest {

    // Given -> When -> Then
    // сущность -> условие -> ожидаемвый результат
    // WhenBarkingIsTrueAndHourOfDayIs25_ThenResultShouldBeFalse

    // ParametrizedTest

    @Test
    void WhenBarkingIsTrueAndHourOfDayIs25_ThenResultShouldBeFalse() {
        int hourOfDay = 25;
        boolean barking = true;
        boolean actualResult = BarkingDog.shouldWakeUp(barking, hourOfDay);
        assertFalse(actualResult);
    }

    @Test
    void WhenBarkingIsTrueAndHourOfDayIsNegativeNumber_ThenResultShouldBeFalse() {
        int hourOfDay = -12;
        boolean barking = true;
        boolean actualResult = BarkingDog.shouldWakeUp(barking, hourOfDay);
        assertFalse(actualResult);
    }

    @Test
    void WhenBarkingIsFalseAndHourOfDayIs25_ThenResultShouldBeFalse() {
        int hourOfDay = 25;
        boolean barking = false;
        boolean actualResult = BarkingDog.shouldWakeUp(barking, hourOfDay);
        assertFalse(actualResult);
    }

    @Test
    void WhenBarkingIsFalseAndHourOfDayIsNegativeNumber_ThenResultShouldBeFalse() {
        int hourOfDay = -12;
        boolean barking = false;
        boolean actualResult = BarkingDog.shouldWakeUp(barking, hourOfDay);
        assertFalse(actualResult);
    }
}