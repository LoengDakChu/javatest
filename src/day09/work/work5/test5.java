package day09.work.work5;

public class test5 {
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.eat();
        Animal a2=new Cat();
        a2.eat();
        if (a1 instanceof Dog){
            Dog dog=(Dog)a1;
            dog.lookHome();
        }
        if (a2 instanceof Cat){
            Cat cat=(Cat)a2;
            cat.catchMouse();
        }
    }
}
