package day11.work;

import java.util.ArrayList;
import java.util.Scanner;

public class work3_2 {
    public static void main(String[] args) {
        System.out.println("         欢迎使用超市购物系统");
        ArrayList<Goods> list = new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(new Goods("001", "少林核桃", 15.5, "斤"));
        goods.add(new Goods("002", "尚康饼干", 14.5, "包"));
        goods.add(new Goods("003", "移动硬盘", 345.0, "个"));
        goods.add(new Goods("004", "高清无码", 199.0, "G"));

        System.out.println("-------------------------------------");
        while (true) {
            System.out.println("请输入你要进行的操作");
            System.out.println("1：购买商品     2：结算并打印小票    3：退出系统");
            Scanner s = new Scanner(System.in);
            int in = s.nextInt();

            if (in == 3) {
                System.out.println("感谢你使用超市购物系统，欢迎下次光临，拜拜");
                break;
            }
            else if (in == 1) {
                System.out.println("        商品列表");
                System.out.println("商品id     名称     单价     计价单位");
                for (int i = 0; i < goods.size(); i++) {
                    System.out.println(goods.get(i).getId() + "     " + goods.get(i).getName() + "     " + goods.get(i).getPrice() + "     " + goods.get(i).getType());
                }
                System.out.println("-------------------------------------");
                System.out.println("请输入您要购买的商品项(输入格式:商品id-购买次数)，输入end表示购买结束");
                while (true) {
                    String buy = new Scanner(System.in).next();
                    if ("end".equals(buy)) {
                        System.out.println("购买结束");
                        break;
                    }
                    if (buy.contains("-")) {
                        String[] split = buy.split("-");

                        boolean flag = false;
                        for (int i = 0; i < goods.size(); i++) {
                            if (split[0].equals(goods.get(i).getId())) {
                                list.add(goods.get(i));
                                try {
                                    int parseInt = Integer.parseInt(split[1]);
                                    num.add(parseInt);
                                }catch (Exception e){
                                    System.out.println("你输入的购买姿势不对，请换个姿势再来一次(格式：id-购买数量)");
                                }
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("你输入的商品id不存在，请重新输入");
                        }
                    } else {
                        System.out.println("你输入的购买姿势不对，请换个姿势再来一次(格式：id-购买数量)");
                    }


                }

            }else if (in==2){
                System.out.println("-------------------------------------");
                System.out.println("            欢迎光临");
                System.out.println("名称       售价     数量    金额");
                System.out.println("-------------------------------------");
                int total=0;
                double money=0;
                for (int i = 0; i < list.size(); i++) {
                    total+=num.get(i);
                    money+=list.get(i).getPrice()*num.get(i);
                    System.out.println(list.get(i).getName()+"    "+list.get(i).getPrice()+"    "+num.get(i)+"      "+list.get(i).getPrice()*num.get(i));
                }
                System.out.println("-------------------------------------");
                System.out.println(list.size()+"项商品");
                System.out.println("共计"+total+"件");
                System.out.println("共："+money+"元");
                System.out.println("-------------------------------------");

            }
            else {
                System.out.println("输入数字无效");
            }

        }

    }
}
