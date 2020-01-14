package day10.work.work3;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(new User(i));
        }
        System.out.println("未分组");
        System.out.println(list);

        Receptionist r1 = new Receptionist();
        Receptionist r2 = new Receptionist();
        Receptionist r3 = new Receptionist();

        r1.setFilter(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= 10 && u.getId() <= 19) {
                    u.setType("V1");
                }
            }
        });

        r2.setFilter(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= 20 && u.getId() <= 29) {
                    u.setType("V2");
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            r1.jieDai(user);
            r2.jieDai(user);
            r3.jieDai(user);
        }
        System.out.println("已分组:");
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (i % 9 == 0) {
                System.out.println();
            }
            System.out.print(user + " ");
        }
    }
}
