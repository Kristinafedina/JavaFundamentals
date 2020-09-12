package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainTask {

    public static void main(String[] args) throws IOException {

        System.out.println(countSum( args));
        reversCommandLine(args);
        sayHello();
        printRandomInt();
        System.out.println('\n' + nameOfMonthByNumber());
        if(Reader.get()!=null) {
            Reader.get().close();
        }
    }

    /**
     * Return month name by number
     * @return String
     */
    public static String nameOfMonthByNumber() {
        System.out.println("Enter number of month:");
        String month;
        int numberOfMonth = Integer.valueOf(readFromConsol(Reader.get()));

        switch (numberOfMonth) {
            case 1 : month = Month.JANUARY.getNameOfMonth();
                break;
            case 2 : month = Month.FEBRYARY.getNameOfMonth();
                break;
            case 3 : month = Month.MARCH.getNameOfMonth();
                break;
            case 4 : month = Month.APRIL.getNameOfMonth();
                break;
            case 5 :  month = Month.MAY.getNameOfMonth();
                break;
            case 6 :  month = Month.JUNE.getNameOfMonth();
                break;
            case 7 :  month = Month.JULY.getNameOfMonth();
                break;
            case 8 :  month = Month.AUGUST.getNameOfMonth();
                break;
            case 9 :  month = Month.SEPTEMBER.getNameOfMonth();
                break;
            case 10 :  month = Month.OKROBER.getNameOfMonth();
                break;
            case 11 :  month = Month.NOVEMBER.getNameOfMonth();
                break;
            case 12 :  month = Month.DECEMBER.getNameOfMonth();
                break;
            default : throw  new IllegalArgumentException("Invalid number of month.");
        }
        return month;
    }

    /**
     * Print list from command line in reverse order
     * @param args
     */
    public  static void reversCommandLine(String [] args){
        (Arrays.asList(args)).stream()
                .sorted(Collections.reverseOrder())
                .map(e -> e + " ")
                .forEach(System.out::print);
    }

    /**
     * Count sum for command line arguments
     * @param args
     * @return int
     */
    public static int countSum(String[] args) {
        int sum = 0;
        for (String cur : args) {
            int current = Integer.valueOf(cur);
            sum += current;
        }
        return sum;
    }

    /**
     * Ask name & say "Hello" witn name
     */
    public static  void sayHello() {
        System.out.println("Enter Your name, please!");
        String userName = readFromConsol(Reader.get());
        if (!userName.isEmpty() || userName != null){
            System.out.println('\n' + "Hello, " + userName + "!");
        } else{
            throw new IllegalArgumentException("Invalid name.");
        }
    }

    /**
     * read from consol
     * @param br
     * @return string
     */
    private static String readFromConsol(BufferedReader br) {
        String srtFromConsole = null;
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            srtFromConsole = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return srtFromConsole;
    }

    /**
     * create array and print it in one row & and each value in row
     * @throws NumberFormatException
     */
    public static void printRandomInt() throws NumberFormatException {
        System.out.println("Type, how many numbers You need");
        int number = Integer.valueOf(readFromConsol(Reader.get()));
        if(number != 0 ) {
            int arrray[] = new int[number];
            Random r = new Random();
            for(int i = 0; i < arrray.length; i++) {
                arrray[i] = r.nextInt(100);
                System.out.println(arrray[i]);
            }
            for(int e : arrray) {
                System.out.print(e + " ");
            }
        } else {
            throw new IllegalArgumentException("Is not a number!");
        }

    }
}
