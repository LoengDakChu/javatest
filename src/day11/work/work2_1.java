package day11.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class work2_1 {
    public static void main(String[] args) throws ParseException {
        //1
        System.out.println("请输入你的生日日期 格式为：yyyy-MM-dd");
        //从键盘输入一个生日日期字符串
        String birthday = new Scanner(System.in).next();
        //创建一个SimpleDataFormat对象，用来格式化生日日期字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //把生日日期字符串解析为Date对象
        Date birthDate = sdf.parse(birthday);
        //创建今天的日期对象
        Date date = new Date();

        long nowTime = date.getTime();
        long birthSecond = birthDate.getTime();
        System.out.println(nowTime);
        System.out.println(birthSecond);
        long sum = nowTime - birthSecond;

        if (sum<0){
            System.out.println("还没出世哦");
        }else {
            System.out.println("你已经活了"+sum/86400000+"天");
        }

    }
}
