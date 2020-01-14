package day07.test;

import java.util.ArrayList;
import java.util.Random;

public class hongBao {
    public static void main(String[] args) {
        int num = 5;
        int mony = 100;
        ArrayList<Integer> list = new ArrayList<>();
        //第一个人抢不能超过40  24 14 9 13
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            int bao = r.nextInt(mony / num * 2) + 1;
            mony = mony - bao;
            list.add(bao);
        }
        list.add(mony);
        int all=0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            all+=list.get(i);
        }
        System.out.println("一共："+all);


    }
}
