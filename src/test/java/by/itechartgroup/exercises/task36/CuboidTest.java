package by.itechartgroup.exercises.task36;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuboidTest {

    @ParameterizedTest
    @MethodSource
    void whenHeightOfCuboidIsNegative_ThenResultShouldBeZero(double width, double length, double height) {
        Cuboid cuboid = new Cuboid(width, length, height);
        double actualResult = cuboid.getHeight();
        assertEquals(0, actualResult);
    }

    private static Stream<Arguments> whenHeightOfCuboidIsNegative_ThenResultShouldBeZero() {
        return Stream.of(
                Arguments.of(1.0d, 2.0d, -1.0d),
                Arguments.of(5.0d, 3.0d, -10, 0d),
                Arguments.of(3.0d, 25.0d, -33.0d)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenWidthLengthAndHeightArePositive_ThenVolumeShouldBeCalculated(double width,
                                                                          double length,
                                                                          double height,
                                                                          double expectedResult) {
        Cuboid cuboid = new Cuboid(width, length, height);
        double actualResult = cuboid.getVolume();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenWidthLengthAndHeightArePositive_ThenVolumeShouldBeCalculated() {
        return Stream.of(
                Arguments.of(1.0d, 2.0d, 1.0d, ((1.0d * 2.0d) * 1.0d)),
                Arguments.of(5.0d, 6.0d, 12.0d, ((5.0d * 6.0d) * 12.0d)),
                Arguments.of(3.0d, 5.0d, 3.0d, ((3.0d * 5.0d) * 3.0d))
        );
    }
}