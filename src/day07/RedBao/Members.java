package day07.RedBao;

import java.util.ArrayList;
import java.util.Random;

public class Members extends User {
    public Members() {
    }

    @Override
    public void show() {
        System.out.println("成员："+getName()+",余额："+getMoney());
    }

    public Members(String name, Double money) {
        super(name, money);
    }

    public void receive(ArrayList<Double> list) {
        //从多个红包当中随便抽取一个给我自己。
        //随机获取一个集合当中的索引编号。
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        Double delta = list.remove(index);
        //当前成员本来有多少钱
        Double money = super.getMoney();
        //抢完红包后，有多少钱  余额
        super.setMoney(delta + money);
    }
}
