package day12.work.SecondPass;

import java.util.ArrayList;

public class work4 {
    public static void main(String[] args) {
        Integer[] ints={1,2,3,4};
        Swap(ints,1,2);
        String[] strings={"ab","ac","bc"};
        Swap(strings,0,1);
    }
    public static <E> void Swap(E[] list,int a,int b){
        System.out.println("交换位置前：");
        for (E e:list){
        System.out.println(e);
        }
        E e = list[a];
        list[a]=list[b];
        list[b]=e;
        System.out.println("交换位置后：");
        for (E e1:list){
            System.out.println(e1);
        }
    }
}
