package com.charlie.aoc.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalibrationLine {

    private static final String NUMBER_WORD_REGEX =
            "(?=(one|two|three|four|five|six|seven|eight|nine|\\d))";
    public int calculateLinePartOne(String input) {

        var integers = input.replaceAll("[^0-9]", "");
        var first = integers.charAt(0);
        var last = integers.charAt(integers.length() - 1);
        var combined = "" + first + last;
        return Integer.parseInt(combined);
    }

    public int calculateLinePartTwo(String input) {
        Matcher matcher = Pattern.compile(NUMBER_WORD_REGEX).matcher(input);
        var matches = new ArrayList<String>();
        while (matcher.find()) {
            matches.add(matcher.group(1));
        }
        var first = normaliseNumbersToStringIntegers(matches.get(0));
        var last = normaliseNumbersToStringIntegers(matches.get(matches.size() -1));
        var combined = first + last;
        return Integer.parseInt(combined);
    }

    private String normaliseNumbersToStringIntegers(String input) {
        try {
            Integer.parseInt(input);
            return input;
        } catch (NumberFormatException ignored) {
        }

        var numberMap = new HashMap<String, String>();
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");

        return numberMap.get(input);
    }
}
