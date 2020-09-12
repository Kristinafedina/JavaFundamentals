package org.example;

public class MyArray {

    private String [] myArray;
    private static volatile MyArray instance = null;

    public MyArray() {
        myArray = convertStringToArray(fromConsole());
    }

    public static MyArray get() {
        if (instance == null) {
            synchronized (OptionalTask1.class) {
                if (instance == null) {
                    instance = new MyArray();
                }
            }
        }
        return instance;
    }
    public String [] getArray() {
        return myArray;
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

    public static String fromConsole() {
        System.out.println("Enter your numbers: ");
        String fromConsole = Reader.readFromConsol(Reader.get());
        return fromConsole;
    }
}
