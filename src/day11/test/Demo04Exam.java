package day11.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo04Exam {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入生日日期  格式为 yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        //获取生日时间
        String birthdayString = scanner.next();
        //创建一个SimpleDateFormat对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //将字符串时期转换成Date对象
        Date parse = sdf.parse(birthdayString);
        //获取今天的日期对象
        Date today=new Date();
        // 将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = parse.getTime();
        long todaySecond = today.getTime();
        long second = todaySecond-birthdaySecond;
        if (second<0){
            System.out.println("你还没出生呢");
        }else {
            System.out.println("你已经活了"+second/86400000+"天");
        }
    }
}
