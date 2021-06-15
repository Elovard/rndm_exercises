package by.itechartgroup.exercises.task7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MegaBytesConverterTest {

    @ParameterizedTest
    @MethodSource
    void WhenKiloBytesAreNegative_ThenResultShouldBeFalse(int kiloBytes){
        assertThrows(IllegalArgumentException.class, ()-> MegaBytesConverter.printMegaBytesAndKiloBytes(kiloBytes));
    }

    private static Stream<Arguments> WhenKiloBytesAreNegative_ThenResultShouldBeFalse(){
        return Stream.of(
                Arguments.of(-1),
                Arguments.of(-99),
                Arguments.of(-50)
        );
    }


}