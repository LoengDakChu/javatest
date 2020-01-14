package day08.homework.work4;

public class C extends B {
    private int numc=30;

    public C(int numc) {
        this.numc = numc;
    }

    public C() {
    }

    @Override
    public void showA() {
        System.out.println(numa);
    }

    @Override
    public void showB() {
        System.out.println(numb);
    }

    public void showC(){
        System.out.println(numc);
    }
}
