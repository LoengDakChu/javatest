package day13.work;

import java.util.HashSet;
import java.util.Set;

public class work6 {
    public static void main(String[] args) {
        /*
        * HashSet去除重复元素的原理
        * HashCode() 是将元素按照一定的公式变成一个HashCode码
        * 值相同，HashCode码一定相同；
        * HashCode码相同，值不一定相同，因为HashCode码有重复性
        * 重写equals()方法，一定要重写HashCode()方法。
        * 对于对象来说，equals比较的是对象的地址值(String 除外，因为它重写了equals方法)
        *
        * HashSet()方法的去重原理也是利用了HashCode()，重写了equals()和HashCode()
        * HashCode把每一个字符串中的字符按照公式计算出来 equals方法从判断对象间的HashCode码是否相同
        * 判断内容是否相同*/



    }
}
