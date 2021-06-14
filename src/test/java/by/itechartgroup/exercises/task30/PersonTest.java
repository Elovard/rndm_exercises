package by.itechartgroup.exercises.task30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person();
    }

    @ParameterizedTest
    @MethodSource
    void whenAgeIsWithin12And20_ThenResultShouldBeTrue(int age) {
        person.setAge(age);
        boolean actualResult = person.isTeen();
        assertTrue(actualResult);
    }

    private static Stream<Arguments> whenAgeIsWithin12And20_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(13),
                Arguments.of(15),
                Arguments.of(19)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenAgeIsUnder12AndAbove20_ThenResultShouldBeFalse(int age) {
        person.setAge(age);
        boolean actualResult = person.isTeen();
        assertFalse(actualResult);
    }

    private static Stream<Arguments> whenAgeIsUnder12AndAbove20_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(99),
                Arguments.of(22),
                Arguments.of(10)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -10, 120})
    void whenSetAgeIsBelowZeroOrOver100_ThenResultShouldBeZero(int age) {
        person.setAge(age);
        int actualResult = person.getAge();
        assertEquals(0, actualResult);
    }

    @ParameterizedTest
    @MethodSource
    void whenFirstnameAndLastnameAreEmpty_ThenResultShouldBeEmptyString(String lastName,
                                                                        String firstName,
                                                                        String expectedResult) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        String actualResult = person.getFullName();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenFirstnameAndLastnameAreEmpty_ThenResultShouldBeEmptyString() {
        return Stream.of(
                Arguments.of("", "", ""),
                Arguments.of("", "", "")
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenFirstnameAndLastnameAreCorrect_ThenTheyShouldBeDisplayed(String lastName,
                                                                      String firstName,
                                                                      String expectedResult) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        String actualResult = person.getFullName();
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> whenFirstnameAndLastnameAreCorrect_ThenTheyShouldBeDisplayed() {
        return Stream.of(
                Arguments.of("aaa", "bbb", "bbb aaa"),
                Arguments.of("test", "test", "test test"),
                Arguments.of("one", "two", "two one")
        );
    }
}