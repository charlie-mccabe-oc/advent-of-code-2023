package com.charlie.aoc.day1;

import com.charlie.aoc.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class Calibrator {

    //<editor-fold desc="Part 1">
    public int partOne(String path) {
        var inputs = FileUtils.readFileToLines(path);

        var extractedIntegers = parseInputs(inputs);

        return sumListOfInts(extractedIntegers);
    }

    private List<Integer> parseInputs(List<String> inputs) {
        var result = new ArrayList<Integer>();

        inputs.forEach(s -> result.add(new CalibrationLine().calculateLinePartOne(s)));

        return result;
    }
    //</editor-fold>

    //<editor-fold desc="Part 2">
    public int partTwo(String path) {
        var inputs = FileUtils.readFileToLines(path);

        var extractedIntegers = getIntegersAsStringFromInputs(inputs);

        return sumListOfInts(extractedIntegers);
    }

    private List<Integer> getIntegersAsStringFromInputs(List<String> inputs) {
        var result = new ArrayList<Integer>();

        inputs.forEach(input -> result.add(new CalibrationLine().calculateLinePartTwo(input)));

        return result;
    }

    //</editor-fold>

    //<editor-fold desc="Helpers">
    private int sumListOfInts(List<Integer> input) {
        var result =  input.stream().mapToInt(Integer::valueOf).sum();

        System.out.println("Total Integers: " + input.stream().filter(i -> !i.equals(0)).toList().size());
        System.out.println("Combined Total: " + result);

        return result;
    }
    //</editor-fold>
}
