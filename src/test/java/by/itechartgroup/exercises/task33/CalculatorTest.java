package by.itechartgroup.exercises.task33;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @ParameterizedTest
    @MethodSource
    void whenCostOfCarpetAndFloorAreaArePositive_ThenCalculationShouldBeCorrect(double cost,
                                                                                double width,
                                                                                double length,
                                                                                double expectedResult) {
        Carpet carpet = new Carpet(cost);
        Floor floor = new Floor(width, length);
        Calculator calculator = new Calculator(floor, carpet);
        double actualResult = calculator.getTotalCost();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenCostOfCarpetAndFloorAreaArePositive_ThenCalculationShouldBeCorrect() {
        return Stream.of(
                Arguments.of(5.0d, 2.0d, 3.0d, 30.0d),
                Arguments.of(2.0d, 3.0d, 7.0d, 42.0d),
                Arguments.of(1.0d, 4.0d, 3.0d, 12.0d)
        );
    }

}