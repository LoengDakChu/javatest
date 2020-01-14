package day09.work.work8;

import day09.work.work6.Person;

import java.util.ArrayList;

public class test8 {
    public static void main(String[] args) {
        GouWuChe gouWuChe=new GouWuChe();
        Laptop laptop=new Laptop("笔记本","g10000",10000);
        Phone phone=new Phone("手机","g10001",5000);
        Fruit fruit=new Fruit("苹果","g20000",50);
        System.out.println("==========添加商品==========");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        System.out.println("==========打印商品==========");
        System.out.println("您选购的商品为：");
        gouWuChe.ShowGoods();
        System.out.println("==========价钱==========");
        gouWuChe.total();
    }
}
