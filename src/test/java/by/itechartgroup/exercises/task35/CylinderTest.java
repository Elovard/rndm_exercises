package by.itechartgroup.exercises.task35;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @ParameterizedTest
    @MethodSource
    void whenHeightOfCylinderIsNegative_ThenResultShouldBeZero(double radius, double height) {
        Cylinder cylinder = new Cylinder(radius, height);
        double actualResult = cylinder.getHeight();
        assertEquals(0, actualResult);
    }

    private static Stream<Arguments> whenHeightOfCylinderIsNegative_ThenResultShouldBeZero() {
        return Stream.of(
                Arguments.of(1.0d, -1.0d),
                Arguments.of(5.0d, -10.0d),
                Arguments.of(3.0d, -3.0d)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenHeightAndRadiusArePositive_ThenVolumeShouldBeCalculated(double radius, double height, double expectedResult) {
        Cylinder cylinder = new Cylinder(radius, height);
        double actualResult = cylinder.getVolume();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenHeightAndRadiusArePositive_ThenVolumeShouldBeCalculated() {
        return Stream.of(
                Arguments.of(2.0d, 3.0d, ((2.0d * 2.0d) * Math.PI) * 3.0d),
                Arguments.of(5.0d, 2.0d, ((5.0d * 5.0d) * Math.PI) * 2.0d),
                Arguments.of(3.0d, 3.0d, ((3.0d * 3.0d) * Math.PI) * 3.0d)
        );
    }

}