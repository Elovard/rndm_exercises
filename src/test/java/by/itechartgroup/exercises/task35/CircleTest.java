package by.itechartgroup.exercises.task35;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @ParameterizedTest
    @ValueSource(doubles = {-1.0d, -10.0d, -99.0d})
    void whenCircleRadiusIsNegative_ThenResultShouldBeZero(double radius) {
        Circle circle = new Circle(radius);
        double actualResult = circle.getRadius();
        assertEquals(0, actualResult);
    }

    @ParameterizedTest
    @MethodSource
    void whenCircleRadiusIsPositive_ThenAreaShouldBeCalculated(double radius, double expectedResult) {
        Circle circle = new Circle(radius);
        double actualResult = circle.getArea();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenCircleRadiusIsPositive_ThenAreaShouldBeCalculated() {
        return Stream.of(
                Arguments.of(3.0d, ((3.0d * 3.0d) * Math.PI)),
                Arguments.of(5.0d, ((5.0d * 5.0d) * Math.PI)),
                Arguments.of(10.0d, ((10.0d * 10.0d) * Math.PI))
        );
    }

}