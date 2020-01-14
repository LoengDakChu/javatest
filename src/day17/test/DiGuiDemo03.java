package day17.test;

import java.io.File;
import java.util.Scanner;

public class DiGuiDemo03 {
    public static void main(String[] args) {
        String path = new Scanner(System.in).next();
        File f = new File("D:\\LoengDakchu\\Java\\javatest");
        printDir(f);
    }

    private static void printDir(File f) {
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    System.out.println(file.getAbsolutePath());
                }
            } else {
                printDir(file);
            }
        }
    }
}
