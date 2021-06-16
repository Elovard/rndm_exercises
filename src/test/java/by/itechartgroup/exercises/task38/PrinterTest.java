package by.itechartgroup.exercises.task38;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PrinterTest {

    @ParameterizedTest
    @MethodSource
    void whenTonerLevelIsOutOfRange_ThenExceptionShouldBeThrown(int tonerLevel, boolean duplex) throws Exception {
        assertThrows(Exception.class, () -> new Printer(tonerLevel, duplex));
    }

    private static Stream<Arguments> whenTonerLevelIsOutOfRange_ThenExceptionShouldBeThrown() {
        return Stream.of(
                Arguments.of(110, true),
                Arguments.of(-10, false),
                Arguments.of(999, true)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenWeAddIncorrectTonerAmount_ThenExceptionShouldBeThrown(int tonerLevel,
                                                                   boolean duplex,
                                                                   int tonerAmount) throws Exception {
        Printer printer = new Printer(tonerLevel, duplex);
        assertThrows(Exception.class, () -> printer.addToner(tonerAmount));
    }

    private static Stream<Arguments> whenWeAddIncorrectTonerAmount_ThenExceptionShouldBeThrown() {
        return Stream.of(
                Arguments.of(80, true, 999),
                Arguments.of(70, false, -1),
                Arguments.of(30, true, 111)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenWeAddTonerBelowTheMaxRange_ThenExceptionShouldBeThrown(int tonerLevel,
                                                                    boolean duplex,
                                                                    int tonerAmount) throws Exception {
        Printer printer = new Printer(tonerLevel, duplex);
        assertThrows(Exception.class, () -> printer.addToner(tonerAmount));
    }

    private static Stream<Arguments> whenWeAddTonerBelowTheMaxRange_ThenExceptionShouldBeThrown() {
        return Stream.of(
                Arguments.of(80, true, 22),
                Arguments.of(70, false, 40),
                Arguments.of(30, true, 85)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenDuplexIsTrue_ThenCalculationsShouldBeCorrect(int tonerLevel,
                                                          boolean duplex,
                                                          int pages,
                                                          int expectedResult) throws Exception {
        Printer printer = new Printer(tonerLevel, duplex);
        int actualResult = printer.printPages(pages);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenDuplexIsTrue_ThenCalculationsShouldBeCorrect() {
        return Stream.of(
                Arguments.of(80, true, 10, 5),
                Arguments.of(70, true, 12, 6),
                Arguments.of(50, true, 15, 8)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenDuplexIsFalse_ThenCalculationsShouldBeCorrect(int tonerLevel,
                                                           boolean duplex,
                                                           int pages,
                                                           int expectedResult) throws Exception {
        Printer printer = new Printer(tonerLevel, duplex);
        int actualResult = printer.printPages(pages);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenDuplexIsFalse_ThenCalculationsShouldBeCorrect() {
        return Stream.of(
                Arguments.of(80, false, 20, 20),
                Arguments.of(70, false, 35, 35),
                Arguments.of(50, false, 10, 10)
        );
    }
}