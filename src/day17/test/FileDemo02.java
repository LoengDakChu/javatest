package day17.test;

import java.io.File;

public class FileDemo02 {
    public static void main(String[] args) {
        File file=new File("FileDemo01.java");
        System.out.println(file.getAbsolutePath());

    }
}
