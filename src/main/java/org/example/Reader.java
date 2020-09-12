package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    private static volatile BufferedReader instance = null;

    private Reader() {
    }

    public static BufferedReader get() {
        if (instance == null) {
            synchronized (Reader.class) {
                if (instance == null) {
                    instance = new BufferedReader(new InputStreamReader(System.in));
                }
            }
        }
        return instance;
    }

    /**
     * read from consol
     * @param instance of bufferedreader
     * @return string
     */
    private String readFromConsol(BufferedReader instance) {
        String srtFromConsole = null;
        try {
            srtFromConsole = instance.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return srtFromConsole;
    }
}
