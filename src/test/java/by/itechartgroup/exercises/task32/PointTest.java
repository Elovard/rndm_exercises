package by.itechartgroup.exercises.task32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    public Point point;

    @BeforeEach
    public void setUp() {
        point = new Point();
    }

    @ParameterizedTest
    @MethodSource
    void whenBothXAndYAreGiven_ThenDistanceShouldBeCalculated(int x, int y, double expectedResult) {
        point.setX(x);
        point.setY(y);
        double actualResult = point.distance();
        assertEquals(expectedResult, actualResult);

    }

    private static Stream<Arguments> whenBothXAndYAreGiven_ThenDistanceShouldBeCalculated() {
        return Stream.of(
                Arguments.of(6, 5, 7.416198487095663),
                Arguments.of(10, 2, 4.898979485566356),
                Arguments.of(3, 2, 3.1622776601683795)

        );
    }

    @ParameterizedTest
    @MethodSource
    void whenWeHaveAnotherPoint_ThenDistanceBetweenThemShouldBeCalculated(int x,
                                                                          int y,
                                                                          int secondX,
                                                                          int secondY,
                                                                          double expectedResult) {
        point.setY(y);
        point.setX(x);
        Point anotherPoint = new Point();
        anotherPoint.setX(secondX);
        anotherPoint.setY(secondY);
        double actualResult = point.distance(anotherPoint);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenWeHaveAnotherPoint_ThenDistanceBetweenThemShouldBeCalculated() {
        return Stream.of(
                Arguments.of(6, 7, 3, 2, 5.830951894845301),
                Arguments.of(5, 8, 2, 5, 4.242640687119285),
                Arguments.of(8, 8, 1, 1, 9.899494936611665)

        );
    }

}