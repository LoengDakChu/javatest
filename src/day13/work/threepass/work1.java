package day13.work.threepass;

import java.util.HashSet;
import java.util.Random;

public class work1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < 7) {
            if (hashSet.size() < 6) {
                hashSet.add(new Random().nextInt(33) + 1);
            } else {
                hashSet.add(new Random().nextInt(16) + 1);
            }
        }
        System.out.println(hashSet);
    }
}
