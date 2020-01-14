package day11.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01SimpleDateFormat {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        String format1 = format.format(date);
        System.out.println(format1);
    }
}
