package day06.homework;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random=new Random();
        int n=10;
        for (int i = 0; i <5 ; i++) {
            int num = random.nextInt(n)+1;
            System.out.println(num);
        }
    }
}
