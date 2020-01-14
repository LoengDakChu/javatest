package day05.homework;

public class test5 {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setName("James");
        manager.setNum(9527);
        manager.setSalary(15000);
        manager.setBonus(3000);
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("==============");
        Coder coder=new Coder("小梁",9889,10000);
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
