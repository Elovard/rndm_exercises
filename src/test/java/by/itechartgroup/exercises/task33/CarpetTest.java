package by.itechartgroup.exercises.task33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarpetTest {

    public Carpet carpet;

    @BeforeEach
    public void setUp() {
        carpet = new Carpet(0);
    }

    @ParameterizedTest
    @MethodSource
    void whenCostIsNegative_ThenResultShouldBeZero(double cost, double expectedResult) {
        double actualResult = carpet.getCost();
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> whenCostIsNegative_ThenResultShouldBeZero() {
        return Stream.of(
                Arguments.of(-1.0d, 0),
                Arguments.of(-5.0d, 0),
                Arguments.of(-10.0d, 0)
        );
    }
}