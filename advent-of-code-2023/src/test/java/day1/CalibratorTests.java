package day1;

import com.charlie.aoc.day1.Calibrator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalibratorTests {

    @ParameterizedTest
    @MethodSource("provideArgsPartOne")
    public void partOne_returnsInteger(String path, int expected) {
        var sut = new Calibrator();

        var result = sut.partOne(path);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgsPartOne() {
        return Stream.of(
                Arguments.of("src/main/resources/day1/input-example.txt", 142),
                Arguments.of("src/main/resources/day1/input.txt", 55477)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsPartTwo")
    public void partTwo_returnsInteger(String path, int expected) {
        var sut = new Calibrator();

        var result = sut.partTwo(path);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgsPartTwo() {
        return Stream.of(
                Arguments.of("src/main/resources/day1/input-example-2.txt", 281),
                Arguments.of("src/main/resources/day1/input.txt", 54431)
        );
    }
}
