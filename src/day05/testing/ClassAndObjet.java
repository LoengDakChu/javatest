package day05.testing;

public class ClassAndObjet {
    public static void main(String[] args) {
        Phone p=new Phone();
        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);

        p.brand="耐克";
        p.price=20;
        p.color="红色";

        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);

        p.call("梁总");
        p.sendMessage();

    }
}

