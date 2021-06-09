package by.itechartgroup.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void shouldWakeUp() {
        int hourOfDay = -12;
        assertFalse(hourOfDay > 0);
    }
}