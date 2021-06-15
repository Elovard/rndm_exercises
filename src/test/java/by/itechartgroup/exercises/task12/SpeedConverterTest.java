package by.itechartgroup.exercises.task12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SpeedConverterTest {

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, -10.0, -99.0})
    void WhenKilometersPerHourAreNegative_ThenResultShouldBeTrue(double arg1) {
        assertThrows(IllegalArgumentException.class, () -> SpeedConverter.toMilesPerHour(arg1));
    }
}