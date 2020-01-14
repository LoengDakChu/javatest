package day07.RedBao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager("哆啦A梦",100);

        Members one=new Members("小葵",0.0);
        Members two=new Members("小新",0.0);
        Members three=new Members("胖虎",0.0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==============================");

        ArrayList<Double> redList=manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
