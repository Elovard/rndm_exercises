package by.itechartgroup.exercises.task26;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalStarTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, -1, 0})
    void WhenNumberIsLessThanFive_ThenResultShouldBeTrue(int number) {
        String actualResult = DiagonalStar.printSquareStar(number);
        assertEquals("Invalid value", actualResult);
    }
}