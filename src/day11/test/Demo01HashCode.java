package day11.test;

public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1=new Person("Ma",50);
        Person p2=new Person("NB",50);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println();
        System.out.println(p1.equals(p2));
    }
}
