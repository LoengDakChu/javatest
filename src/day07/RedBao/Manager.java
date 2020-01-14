package day07.RedBao;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, double money) {
        super(name, money);
    }

    @Override
    public void show() {
        System.out.println("群主："+getName()+",余额："+getMoney());
    }

    public ArrayList<Double> send(double totalMoney, int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Double> redList=new ArrayList<>();

        //判断发的红包是否为正数
        if (totalMoney<0){
            System.out.println("红包金额必须大于0");
            return redList;
        }

        //首先看一下群主自己的余额有多少钱
        double leftMoney=super.getMoney();
        //如果发的金额大于余额，则发不出
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }

        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney-totalMoney);

        //每个人平分多少钱
        double avg = totalMoney / count;

        //把除不尽的余数包在最后一个红包中
//        double mod=totalMoney%count;

        for (int i = 0; i <count ; i++) {
            redList.add(avg);
        }
//        double last=avg+mod;
//        redList.add(last);
        return redList;
    }
}
