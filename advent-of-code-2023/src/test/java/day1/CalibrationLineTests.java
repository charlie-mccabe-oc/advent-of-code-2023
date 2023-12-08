package day1;

import com.charlie.aoc.day1.CalibrationLine;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalibrationLineTests {

    @ParameterizedTest
    @MethodSource("provideArgsPartOne")
    public void partOne_returnsCorrectInteger(String path, int expected) {
        var sut = new CalibrationLine();

        var result = sut.calculateLinePartOne(path);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgsPartOne() {
        return Stream.of(
                Arguments.of("1abc2", 12),
                Arguments.of("pqr3stu8vwx", 38),
                Arguments.of("a1b2c3d4e5f", 15),
                Arguments.of("treb7uchet", 77)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsPartTwo")
    public void partTwo_returnsCorrectInteger(String path, int expected) {
        var sut = new CalibrationLine();

        var result = sut.calculateLinePartTwo(path);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgsPartTwo() {
        return Stream.of(
                Arguments.of("two1nine", 29),
                Arguments.of("eightwothree", 83),
                Arguments.of("abcone2threexyz", 13),
                Arguments.of("xtwone3four", 24),
                Arguments.of("nineeightseven2", 92),
                Arguments.of("zoneight234", 14),
                Arguments.of("7pqrstsixteen", 76),
                Arguments.of("864two7ninejzmpzp", 89),
                Arguments.of("5bszzkpcdxqkvkf7tgcone2", 52),
                Arguments.of("1twoonefivenvvhjf", 15),
                Arguments.of("9cbphfncslbvn23dzcpz4pqzlgfjl8", 98),
                Arguments.of("glvctfourgmlrqbpsevenvksevensix9", 49),
                Arguments.of("mhbtwoneznkzfztm2twooneninethreextttcheightnine", 29),
                Arguments.of("seven33219", 79),
                Arguments.of("fivelpsstxjllxfive5sevenkbqmgbn", 57),
                Arguments.of("479", 49),
                Arguments.of("sixsix31", 61),
                Arguments.of("fourseven5seveneightsvtkcjdrfour", 44),
                Arguments.of("2536sevensevenmqtrkzlfqkgp", 27),
                Arguments.of("twone", 21)
        );
    }
}
