package by.itechartgroup.exercises.task9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberInWordTest {

    @ParameterizedTest
    @ValueSource(ints = {11, 25, 99})
    void WhenTypedNumberIsNotFound_ThenResultShouldBeTrue(int arg1) {
        String actualResult = NumberInWord.printNumberInWord(arg1);
        assertEquals("Oops, something is wrong", actualResult);
    }
}