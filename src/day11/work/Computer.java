package day11.work;

import java.util.ArrayList;
import java.util.Scanner;

public class Computer extends Goods{
    public void show(){
        System.out.println("请输入你要进行的操作");
        System.out.println("1：购买商品     2：结算并打印小票    3：退出系统");
    }
    public ArrayList<String> buyGoods(){
        Goods g1=new Goods("001","少林核桃",15.5,"斤");
        Goods g2=new Goods("002","尚康饼干",14.5,"包");
        Goods g3=new Goods("003","移动硬盘",345.0,"个");
        Goods g4=new Goods("004","高清无码",199.0,"G");
        ArrayList<Goods> goods=new ArrayList<>();
        goods.add(g1);
        goods.add(g2);
        goods.add(g3);
        goods.add(g4);
        for (int i = 0; i < goods.size(); i++) {
            System.out.println(goods.get(i).getId()+"     "+goods.get(i).getName()+"     "+goods.get(i).getPrice()+"     "+goods.get(i).getType());
        }
        System.out.println("-------------------------------------");

        System.out.println("请输入您要购买的商品项(输入格式:商品id-购买次数)，输入end表示购买结束");

        ArrayList<String> list=new ArrayList<>();
        while (true){
            String buy = new Scanner(System.in).next();
            if ("end".equals(buy)){
                System.out.println("购买结束");
                break;
            }else if (buy.contains("-")){
                String[] split = buy.split("-");
                boolean flag=true;
                for (int i = 0; i < goods.size(); i++) {
                    if (!split[0].equals(goods.get(i))){
                        flag=false;
                    }else {
                        flag=true;
                    }
                }
                if (flag==false){
                    System.out.println("你输入的商品id不存在，请重新输入");
                }
            }else if (!buy.contains("-")){
                System.out.println("你输入的购买姿势不对，请换个姿势再来一次(格式：id-购买数量)");
            }
        }
        return list;
    }


}
