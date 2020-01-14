package day13.work.twopass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class work6 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        HashSet<Integer> hashSet=new HashSet<>();
        while (hashSet.size()<10){
            hashSet.add(new Random().nextInt(20)+1);
        }

        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        long end = System.currentTimeMillis();
        long sum = end - start;
        System.out.println("共耗时："+sum+"毫秒");
    }
}
