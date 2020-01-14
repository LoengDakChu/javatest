package day05.testing;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone two=getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone(){
        Phone one=new Phone();
        one.brand="苹果";
        one.price=8388.0;
        one.color="黑色";
        return one;
    }
}
