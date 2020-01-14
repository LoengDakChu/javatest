package day09.work.work8;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();


    public void addGoods(Goods goods) {
        list.add(goods);
        System.out.println("加入  " + goods.goodsName + "  成功");
    }

    public void ShowGoods() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).id + "," + list.get(i).goodsName + "," + list.get(i).price);
        }
    }

    public void total() {
        double num = 0;
        double yh = 0;
        for (int i = 0; i < list.size(); i++) {
            num+=list.get(i).price;
            if (list.get(i) instanceof EGoods) {
                 list.get(i).price*=0.88;
            }
            yh+=list.get(i).price;
        }
        System.out.println("原  价为:" + num);
        System.out.println("折后价为：" + yh);
    }

}
