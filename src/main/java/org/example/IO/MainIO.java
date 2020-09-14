package org.example.IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainIO {

    public static void main(String [] args) throws IOException {

        File file = new File("D:\\Projects\\epam1\\JavaTasks\\data\\data.txt") ;
        PrintStream stream = new PrintStream(new FileOutputStream(file));
        stream.println(printDirectoryTree(new File (args[0])));
    }


    public static String printDirectoryTree(File folder) {
        if (!folder.isDirectory()) {
                throw new IllegalArgumentException("folder is not a Directory");
        }
        int indent = 0;
        StringBuilder sb = new StringBuilder();
        printDirectoryTree(folder, indent, sb);
        return sb.toString();

    }

    private static void printDirectoryTree(File folder, int indent,
                                           StringBuilder sb) {
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(folder.getName());
        sb.append("/");
        sb.append("\n");
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                printDirectoryTree(file, indent + 1, sb);
            } else {
                printFile(file, indent + 1, sb);
            }
        }

    }

    private static void printFile(File file, int indent, StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("\n");
    }

    private static String getIndentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("|  ");
        }
        return sb.toString();
    }

}
