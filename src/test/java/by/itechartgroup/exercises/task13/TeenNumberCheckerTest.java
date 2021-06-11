package by.itechartgroup.exercises.task13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TeenNumberCheckerTest {

    @ParameterizedTest
    @MethodSource
    void WhenAgesAreUnder13AndBelow19_ThenResultShouldBeFalse(int age1, int age2, int age3) {
        boolean actualResult = TeenNumberChecker.hasTeen(age1, age2, age3);
        assertFalse(actualResult);
    }

    private static Stream<Arguments> WhenAgesAreUnder13AndBelow19_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(21, 1, 99),
                Arguments.of(99, 25, 53),
                Arguments.of(53, 54, 60)
        );
    }

    @ParameterizedTest
    @MethodSource
    void WhenAgesAreWithin13And19_ThenResultShouldBeTrue(int age1, int age2, int age3) {
        boolean actualResult = TeenNumberChecker.hasTeen(age1, age2, age3);
        assertTrue(actualResult);
    }

    private static Stream<Arguments> WhenAgesAreWithin13And19_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(15, 16, 17),
                Arguments.of(16, 14, 15),
                Arguments.of(17, 13, 14)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 22, 54})
    void WhenAgeIsUnder13AndBelow19_ThenResultShouldBeFalse(int age1) {
        boolean actualResult = TeenNumberChecker.isTeen(age1);
        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 17, 15})
    void WhenAgeIsWithin13And19_ThenResultShouldBeTrue(int age1) {
        boolean actualResult = TeenNumberChecker.isTeen(age1);
        assertTrue(actualResult);
    }
}