package day05.homework;

public class Card {
    private String color;//花色
    private String num;//点数

    public Card(){//无参构造方法

    }
    public Card(String color,String num){//满参构造方法
        this.color=color;
        this.num=num;
    }

    public void ShowCard(){//成员方法
        System.out.println(color+num);
    }
}
