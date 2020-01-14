package day11.test;

import java.util.Calendar;

public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DATE,1);
        int i = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
    }
}
