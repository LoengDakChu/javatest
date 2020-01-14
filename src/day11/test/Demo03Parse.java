package day11.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03Parse {
    public static void main(String[] args) throws ParseException {
        //format 方法  格式化日期
//        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//        String format = s.format(date);
//        System.out.println(format);

        //parse 方法 解析字符串转变成日期
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");
        String str="2020年1月4日 18点30分";
        Date parse = s1.parse(str);
        System.out.println(parse);

    }
}
