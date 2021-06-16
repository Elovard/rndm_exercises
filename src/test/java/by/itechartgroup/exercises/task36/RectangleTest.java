package by.itechartgroup.exercises.task36;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @ParameterizedTest
    @MethodSource
    void whenWidthOfRectangleIsNegative_ThenResultShouldBeZero(double width, double length) {
        Rectangle rectangle = new Rectangle(width, length);
        double actualResult = rectangle.getWidth();
        assertEquals(0, actualResult);
    }

    private static Stream<Arguments> whenWidthOfRectangleIsNegative_ThenResultShouldBeZero() {
        return Stream.of(
                Arguments.of(-1.0d, 8.0d),
                Arguments.of(-3.0d, 7.0d),
                Arguments.of(-2.0d, 5.0d)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenLengthOfRectangleIsNegative_ThenResultShouldBeZero(double width, double length) {
        Rectangle rectangle = new Rectangle(width, length);
        double actualResult = rectangle.getLength();
        assertEquals(0, actualResult);
    }

    private static Stream<Arguments> whenLengthOfRectangleIsNegative_ThenResultShouldBeZero() {
        return Stream.of(
                Arguments.of(6.0d, -1.0d),
                Arguments.of(19.0d, -3.0d),
                Arguments.of(21.0d, -5.0d)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenLengthAndWidthOfRectangleArePositive_ThenAreaShouldBeCalculated(double width,
                                                                             double length,
                                                                             double expectedResult) {
        Rectangle rectangle = new Rectangle(width, length);
        double actualResult = rectangle.getArea();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenLengthAndWidthOfRectangleArePositive_ThenAreaShouldBeCalculated() {
        return Stream.of(
                Arguments.of(6.0d, 6.0d, 36.0d),
                Arguments.of(2.0d, 3.0d, 6.0d),
                Arguments.of(4.0d, 5.0d, 20.0d)
        );
    }
}