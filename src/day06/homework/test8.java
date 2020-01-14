package day06.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.println("请录入第"+i+"本书的名称");
            String name = scanner.next();
            System.out.println("请录入第"+i+"本书的价格");
            double price = scanner.nextDouble();
            list.add(new Book(name,price));
        }
        System.out.println("------------------------------");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).getTitle()+"，"+list.get(i).getPrice());
        }
        System.out.println("------------------------------");
        Book max=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.getPrice()<list.get(i).getPrice()){
                max=list.get(i);
            }
        }
        System.out.println("最贵的书是："+max.getTitle()+"，价格是："+max.getPrice());
        System.out.println("------------------------------");
        Book up=list.get(0);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <list.size() ; j++) {
                if (up.getPrice()<list.get(j).getPrice()){
                    Book temp=up;
                    up=list.get(j);
                    list.set(j,temp);
                }
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).getTitle()+list.get(i).getPrice());
        }
    }
}
