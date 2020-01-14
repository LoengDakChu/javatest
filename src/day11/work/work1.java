package day11.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) throws ParseException {
        /*
        * 1.1
        * 1.请说出基本数据类型对应的八个包装类是什么？
        *   byte            Byte
        *   short           Short
        *   int             Integer
        *   long            Long
        *   float           Float
        *   double          Double
        *   char            Character
        *   boolean         Boolean
        *
        * 2.请说出如何把字符串转换为对应的基本数据类型，有什么注意点？
        *   除了Character类之外，其他所有包装类都具有parseXxx静态方法
        *   可以将字符串参数转换为对应的基本类型：
        *   如：String str="123";
        *   int i=Integer.parseInt(str)
        *
        *   注意:如果字符串参数的内容无法正确转换为对应的基本类型，
        *   则会抛出 java.lang.NumberFormatException 异常。
        *
        * 2.1
        * 1.请说出你对自动装箱的理解
        *   Integer i=4;//自动装箱。相当于Integer.valueOf(4);
        * 2.请说出你对自动拆箱的理解
        *   i=i+5;//等号右边 将i对象转成基本数值(自动拆箱) i.intValue()+5
        *   加法运算完成后，再次装箱，把基本数值转成对象。
        * */

        //3.1
        //创建一个Date对象，获取当前的时间
        Date date=new Date();
        //创建一个DateFormat抽象类的一个子类SimpleDateFormat
        //构造方法参数 填入日期的格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用DateFormat的一个format方法，按照指定的格式
        //把Date日期，格式化为符合模式的字符串
        String format = sdf.format(date);
        System.out.println(format);

        System.out.println("=========================");


        //4.1
//        System.out.println("请输入你的生日日期 格式为1992-10-20");
//        String birthday = new Scanner(System.in).next();
//        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
//        Date date1 = sdf2.parse(birthday);
//        System.out.println(date1);

        System.out.println("=========================");

        //5.1
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE,500);
        Date time = c.getTime();
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日");
        String weiLai = sdf3.format(time);
        System.out.println("五百天后是："+weiLai);




    }
}
