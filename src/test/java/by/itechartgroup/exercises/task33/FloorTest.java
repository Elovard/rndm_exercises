package by.itechartgroup.exercises.task33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {

    public Floor floor;

    @BeforeEach
    public void setUp() {
        floor = new Floor(0, 0);
    }

    @ParameterizedTest
    @MethodSource
    void whenWidthAndLengthAreNegative_ThenResultShouldBeZero(double width, double length, double expectedResult) {
        double actualResult = floor.getArea();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenWidthAndLengthAreNegative_ThenResultShouldBeZero() {
        return Stream.of(
                Arguments.of(-1, -1, 0),
                Arguments.of(-5, -3, 0),
                Arguments.of(-10, -3, 0)
        );
    }

}