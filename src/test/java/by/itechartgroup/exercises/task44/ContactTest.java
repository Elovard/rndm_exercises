package by.itechartgroup.exercises.task44;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ContactTest {

    @ParameterizedTest
    @MethodSource
    void whenNameOrPhoneIsNull_ThenExceptionShouldBeThrown(String name, String phone) {
        assertThrows(Exception.class, () -> Contact.createContact(name, phone));
    }

    private static Stream<Arguments> whenNameOrPhoneIsNull_ThenExceptionShouldBeThrown() {
        return Stream.of(
                Arguments.of(null, "test"),
                Arguments.of("test", null),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest  // TODO: 6/18/21  check this test
    @MethodSource
    void whenNameAndNumberAreValid_ThenContactShouldBeCreated(String name, String phone) throws Exception {
        Contact.createContact(name, phone);
    }

    private static Stream<Arguments> whenNameAndNumberAreValid_ThenContactShouldBeCreated() {
        return Stream.of(
                Arguments.of("testName", "test"),
                Arguments.of("testName", "test"),
                Arguments.of("testName", "testPhone")
        );
    }

}