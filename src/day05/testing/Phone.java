package day05.testing;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMessage(){
        System.out.println("各部门注意，八点半快到了");
    }
}
