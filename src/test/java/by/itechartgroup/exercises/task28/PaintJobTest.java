package by.itechartgroup.exercises.task28;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PaintJobTest {

    @ParameterizedTest
    @MethodSource
    void whenOneOfParametersIsNegativeOrZeroInFourParameters_ThenExceptionShouldBeThrown(double width,
                                                                                         double height,
                                                                                         double areaPerBucket,
                                                                                         int extraBuckets) {
        assertThrows(IllegalArgumentException.class, () ->
                PaintJob.getBucketCount(width, height, areaPerBucket, extraBuckets));
    }

    private static Stream<Arguments> whenOneOfParametersIsNegativeOrZeroInFourParameters_ThenExceptionShouldBeThrown() {
        return Stream.of(
                Arguments.of(0, 0, 0, 0),
                Arguments.of(1, 2, 3, -1),
                Arguments.of(-1, 2, 3, 4),
                Arguments.of(1, -2, 3, 4)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenOneOfParametersIsNegativeOrZeroInThreeParameters_ThenExceptionShouldBeThrown(double width,
                                                                                          double height,
                                                                                          double areaPerBucket) {
        assertThrows(IllegalArgumentException.class, () -> PaintJob.getBucketCount(width, height, areaPerBucket));
    }

    private static Stream<Arguments> whenOneOfParametersIsNegativeOrZeroInThreeParameters_ThenExceptionShouldBeThrown() {
        return Stream.of(
                Arguments.of(1, -1, -10),
                Arguments.of(-2, -3, -4),
                Arguments.of(1, 15, -3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenOneOfParametersIsNegativeOrZeroInTwoParameters_ThenExceptionShouldBeThrown(double area, double areaPerBucket) {
        assertThrows(IllegalArgumentException.class, () -> PaintJob.getBucketCount(area, areaPerBucket));
    }

    private static Stream<Arguments> whenOneOfParametersIsNegativeOrZeroInTwoParameters_ThenExceptionShouldBeThrown() {
        return Stream.of(
                Arguments.of(-1, 2),
                Arguments.of(5, -10),
                Arguments.of(-1, 3)
        );
    }
}