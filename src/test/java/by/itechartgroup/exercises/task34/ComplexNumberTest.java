package by.itechartgroup.exercises.task34;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @ParameterizedTest
    @MethodSource
    void whenRealAndImaginaryNumbersArePresent_ThenCalculationsShouldBeCorrect(double real,
                                                                               double imaginary,
                                                                               double firstAddingNum,
                                                                               double secondAddingNum,
                                                                               double expectedRealResult,
                                                                               double expectedImaginaryResult) {
        ComplexNumber number = new ComplexNumber(real, imaginary);
        number.add(firstAddingNum, secondAddingNum);
        assertEquals(number.getImaginary(), expectedImaginaryResult);
        assertEquals(number.getReal(), expectedRealResult);

    }

    private static Stream<Arguments> whenRealAndImaginaryNumbersArePresent_ThenCalculationsShouldBeCorrect() {
        return Stream.of(
                Arguments.of(1.0d, 1.0d, 1.0d, 1.0d, 2.0d, 2.0d),
                Arguments.of(3.0d, 2.0d, 2.0d, 2.0d, 5.0d, 4.0d),
                Arguments.of(-1.0d, 5.0d, 3.0d, -2.0d, 2.0d, 3.0d)
        );
    }

}