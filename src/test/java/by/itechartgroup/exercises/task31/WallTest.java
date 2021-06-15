package by.itechartgroup.exercises.task31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WallTest {

    public Wall wall;

    @BeforeEach
    public void setUp() {
        wall = new Wall();
    }

    @ParameterizedTest
    @MethodSource
    void whenWidthOrHeightIsNegative_ThenResultShouldBeZero(double width, double height) {
        wall.setWidth(width);
        wall.setHeight(height);
        double actualResult = wall.getArea();
        assertEquals(0, actualResult);
    }

    private static Stream<Arguments> whenWidthOrHeightIsNegative_ThenResultShouldBeZero() {
        return Stream.of(
                Arguments.of(-1.0d, -1.0d),
                Arguments.of(-10.0d, 1.0d),
                Arguments.of(10.0d, -5.0d)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenWidthAndHeightArePositive_ThenResultShouldBeCalculated(double width, double height, double expectedResult) {
        wall.setHeight(height);
        wall.setWidth(width);
        double actualResult = wall.getArea();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenWidthAndHeightArePositive_ThenResultShouldBeCalculated() {
        return Stream.of(
                Arguments.of(5.0d, 4.0d, 20.0d),
                Arguments.of(10.0d, 2.0d, 20.0d),
                Arguments.of(5.0d, 3.0d, 15.0d)
        );
    }
}