package by.itechartgroup.exercises.task28;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PaintJobTest {

    @ParameterizedTest // TODO: 6/14/21 ASK: about these tests
    @MethodSource
    void WhenOneOfParametersIsNegativeOrZeroInFourParameters_ThenResultShouldBeFalse(double width, double height,
                                                                                     double areaPerBucket, int extraBuckets) {
        int actualResult = PaintJob.getBucketCount(width, height, areaPerBucket, extraBuckets);
        assertFalse(actualResult > 0);
    }

    @ParameterizedTest
    @MethodSource
    void WhenOneOfParametersIsNegativeOrZeroInThreeParameters_ThenResultShouldBeFalse(double width, double height,
                                                                                      double areaPerBucket) {
        int actualResult = PaintJob.getBucketCount(width, height, areaPerBucket);
        assertFalse(actualResult > 0);
    }

    @ParameterizedTest
    @MethodSource
    void WhenOneOfParametersIsNegativeOrZeroInTwoParameters_ThenResultShouldBeFalse(double area, double areaPerBucket) {
        int actualResult = PaintJob.getBucketCount(area, areaPerBucket);
        assertFalse(actualResult > 0);
    }


    private static Stream<Arguments> WhenOneOfParametersIsNegativeOrZeroInFourParameters_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(0, 0, 0, 0),
                Arguments.of(1, 2, 3, -1),
                Arguments.of(-1, 2, 3, 4),
                Arguments.of(1, -2, 3, 4)
        );
    }

    private static Stream<Arguments> WhenOneOfParametersIsNegativeOrZeroInThreeParameters_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(1, -1, -10),
                Arguments.of(-2, -3, -4),
                Arguments.of(1, 15, -3)
        );
    }

    private static Stream<Arguments> WhenOneOfParametersIsNegativeOrZeroInTwoParameters_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(-1, 2),
                Arguments.of(5, -10),
                Arguments.of(-1, 3)
        );
    }
}