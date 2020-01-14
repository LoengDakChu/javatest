package day02;

public class DataChange {
    public static void main(String[] args) {
//        自动转换：将 取值范围小的类型 自动提升为 取值范围大的类型 。
        int a = 1;
        byte b = 2;
        // byte x = b + a; // 报错
        // int类型和byte类型运算，结果是int类型
        int j = b + a; System.out.println(j);

//        同样道理，当一个 int 类型变量和一个 double 变量运算时， int 类型将会自动提升为 double 类型进行运算。
        int i = 1;
        double d = 2.5; //int类型和double类型运算，结果是double类型
        // int类型会提升为double类型
        double e = d+i; System.out.println(e);

//        转换规则
//        范围小的类型向范围大的类型提升， byte 、 short 、 char 运算时直接提升为 int 。
//        byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double

//        强制转换
//        数据类型 变量名 = （数据类型）被转数据值；
        //short类型变量,内存中存储两个字节
         short s = 1; int  p= 1;
        /*出现编译错误 出现编译失败 s和i做运算的时候，i是int类型，s会被提升为int类型 s+i后的结果是int类型，将结果在赋值会short类型时发生错误 short内存2个字节，int类型4个字节 必须将int强制转成short才能完成赋值 */
        // s = s + i; //编译失败
         s = (short) (s + p); //编译成功
    }
}
