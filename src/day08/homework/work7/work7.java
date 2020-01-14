package day08.homework.work7;

public class work7 {
    public static void main(String[] args) {
        Manager manager=new Manager("m110","老王",10000);
        Chef chef=new Chef("c110","小王",6000);
        manager.eat();
        manager.ManagerOther();
        chef.eat();
        chef.cooking();
    }
}
