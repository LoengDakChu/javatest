package day11.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class work3_1 {
    public static void main(String[] args) throws ParseException {
        String str="2016-12-18";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(str);
        sdf.applyPattern("yyyy年MM月dd日");
        String format1 = sdf.format(parse);
        System.out.println(format1);
    }
}
