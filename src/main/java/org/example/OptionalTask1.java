package org.example;

import java.util.Arrays;
import java.util.Comparator;


public class OptionalTask1 {

    private static MyArray inst;

    public static MyArray getMyArray() {
        return MyArray.get();
    }

    public static String[] shortestLongestNumber() {
        Arrays.sort(getMyArray().getArray(), new Comp());
        return new String[]{getMyArray().getArray()[0], getMyArray().getArray()[getMyArray().getArray().length -1]};

    }

    public void printNumbersAndItLength() {

    }

    private static String[] convertStringToArray(String string) {
        String[] parts;
        if (string.contains(" ")) {
            parts = string.split("( )");
        } else {
            throw new IllegalArgumentException("String " + string + " does not contain \" \"");
        }
        return parts;
    }

    static class Comp implements Comparator<String> {
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }
}
