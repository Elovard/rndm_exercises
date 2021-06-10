package by.itechartgroup.exercises.task4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EqualityPrinterTest {

    @ParameterizedTest
    @CsvSource({"-1, -2, -3", "-50, -30, -12", "-15, -16, -17"})
    void WhenNumbersAreNegative_ThenMessageShouldBeInvalidValue(int arg1, int arg2, int arg3) {

    }
}