package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class OptionalTask1 {

    private static MyArray inst;

    public static MyArray getMyArray() {
        return MyArray.get();
    }

    public static String[] shortestLongestNumber() {
        sotrByLengt();
        return new String[]{getMyArray().getArray()[0], getMyArray().getArray()[getMyArray().getArray().length -1]};
    }

    public static List<String> sotrByLengt() {
        return Arrays.stream((getMyArray().getArray())).sorted(new Comp()).collect(Collectors.toList());
    }

    public static List<String> sotrByLengtReverseOrder() {
        return Arrays.stream((getMyArray().getArray())).sorted(Collections.reverseOrder(new Comp())).collect(Collectors.toList());
    }

    private static double averageLength() {
        double length = 0.0;
        for (String cur : getMyArray().getArray()) {
            length += cur.length();
        }
        return length/getMyArray().getArray().length;
    }

    public static List<String> filterShorterLength() {
        return Arrays.stream((getMyArray().getArray()))
                .filter(e -> e.length() < averageLength())
                .collect(Collectors.toList());
    }

    public static List<String> filterBidderLenth() {
        return Arrays.stream((getMyArray().getArray()))
                .filter(e -> e.length() > averageLength())
                .collect(Collectors.toList());
    }

    public static void printNumbersAndItLength(List<String> list) {
        for (String curr : list) {
            System.out.println(String.format("Number = %s,  lengs = %d", curr, curr.length()));
        }
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

    private static Map<String, Set<Integer>> createMap() {

        Map<String, Set<Integer>> map = new HashMap<>();

        for(String str : getMyArray().getArray()) {
            map.put(str, createSetOfInteger(str));
        }
        return map;
    }

    private static List<String> splitStringToCharacters(String str) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList(str.split(""));
        return list;
    }

    private static Set<Integer> createSetOfInteger(String str) {
        Set<String> setStr = new HashSet<>(splitStringToCharacters(str));
        Set<Integer> setInt = setStr.stream()
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toSet());
        return setInt;
    }

    static class Comp implements Comparator<String> {
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }
}
