package day06.test;

import day05.homework.Book;

import java.util.ArrayList;

public class arraylistforfor {
    public static void main(String[] args) {
        ArrayList<User> user1 = new ArrayList<>();
        User u1 = new User("小红", 18, 2500);
        User u2 = new User("小明", 20, 1500);
        User u3 = new User("小青", 19, 3400);
        User u4 = new User("小兰", 19, 2800);
        User u5 = new User("小绿", 19, 6000);
        user1.add(u1);
        user1.add(u2);
        user1.add(u3);
        user1.add(u4);
        user1.add(u5);

        //选择排序
//        for (int i = 0; i < user1.size(); i++) {
//            for (int j = i + 1; j < user1.size(); j++) {
//                if (user1.get(i).getSalary() < user1.get(j).getSalary()) {
//                    User temp = user1.get(j);
//                    user1.set(j, user1.get(i));
//                    user1.set(i, temp);
//                }
//            }
//
//        }
        //冒泡排序
//        for (int i = 0; i < user1.size(); i++) {
//            for (int j = 0; j < user1.size()-i-1; j++) {
//                if (user1.get(j).getSalary()<user1.get(j+1).getSalary()){
//                    User temp=user1.get(j);
//                    user1.set(j,user1.get(j+1));
//                    user1.set(j+1,temp);
//                }
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("姓名：" + user1.get(i).getName() + "," + user1.get(i).getAge() + "岁,工资：" + user1.get(i).getSalary());
//        }

        ArrayList<User> user2 = new ArrayList<>();
        User u21 = new User("小白", 35, 3500);
        User u22 = new User("大白", 40, 8000);
        User u23 = new User("中白", 38, 5500);
        user2.add(u21);
        user2.add(u22);
        user2.add(u23);

        ArrayList<ArrayList<User>> classs=new ArrayList<>();
        classs.add(user1);
        classs.add(user2);
        ArrayList<User> c3=new ArrayList<>();
        for (int i = 0; i < classs.size(); i++) {
            ArrayList<User> list = classs.get(i);
            for (int j = 0; j <list.size() ; j++) {
               c3.add(list.get(j));
            }
        }
        salaryDesc(c3,c3.size());//1参：传入一个User对象的数组进行倒序   2参：需要拿前几个人的工资。
    }
    public static void salaryDesc(ArrayList<User> arr,int n){
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j <arr.size()-i-1 ; j++) {
                if (arr.get(j).getSalary()<arr.get(j+1).getSalary()){
                    User temp=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("姓名："+arr.get(i).getName()+"，年龄"+arr.get(i).getAge()+"，工资："+arr.get(i).getSalary());
        }
    }
}
