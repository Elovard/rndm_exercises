package by.itechartgroup.exercises.task29;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SimpleCalculatorTest {

    private SimpleCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new SimpleCalculator();
    }

    @ParameterizedTest
    @MethodSource
    void whenInDivisionSecondNumberIsZero_ThenResultShouldBeFalse(double firstNum, double secondNum) {
        double actualResult = calc.getDivisionResult();
        assertFalse(actualResult > 0);
    }

    private static Stream<Arguments> whenInDivisionSecondNumberIsZero_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(10.0d, 0),
                Arguments.of(15.0d, -1.0d),
                Arguments.of(35.0d, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenBothNumbersArePositiveAndMethodIsMultiplying_ThenResultShouldBeMultiplied(double firstNum,
                                                                                       double secondNum,
                                                                                       double expectedResult) {
        calc.setFirstNum(firstNum);
        calc.setSecondNum(secondNum);
        double actualResult = calc.getMultiplicationResult();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenBothNumbersArePositiveAndMethodIsMultiplying_ThenResultShouldBeMultiplied() {
        return Stream.of(
                Arguments.of(2.0d, 2.0d, 4.0d),
                Arguments.of(5.0d, 5.0d, 25.0d),
                Arguments.of(5.0d, 3.0d, 15.0d)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenBothNumbersArePositiveAndMethodIsSubtraction_ThenCalculationsShouldBeCorrect(double firstNum,
                                                                                          double secondNum,
                                                                                          double expectedResult) {
        calc.setFirstNum(firstNum);
        calc.setSecondNum(secondNum);
        double actualResult = calc.getSubtractionResult();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenBothNumbersArePositiveAndMethodIsSubtraction_ThenCalculationsShouldBeCorrect() {
        return Stream.of(
                Arguments.of(10.0d, 3.0d, 7.0d),
                Arguments.of(10.0d, 5.0d, 5.0d),
                Arguments.of(35.0d, 25.0d, 10.0d)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenBothNumbersArePositiveAndMethodIsAddition_ThenSumShouldBeCorrect(double firstNum,
                                                                              double secondNum,
                                                                              double expectedResult) {
        calc.setFirstNum(firstNum);
        calc.setSecondNum(secondNum);
        double actualResult = calc.getAdditionResult();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenBothNumbersArePositiveAndMethodIsAddition_ThenSumShouldBeCorrect() {
        return Stream.of(
                Arguments.of(10.0d, 3.0d, 13.0d),
                Arguments.of(10.0d, 5.0d, 15.0d),
                Arguments.of(35.0d, 25.0d, 60.0d)
        );
    }
}