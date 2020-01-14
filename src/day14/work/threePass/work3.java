package day14.work.threePass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class work3 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        while (hashSet.size()<4){
            StringBuilder str=new StringBuilder();
            for (int i=0;i<8;i++){
                int anInt = new Random().nextInt(10);
                str.append(anInt);
            }
            String s = str.toString();
            hashSet.add(s);
        }



        HashMap<String,String> map=new HashMap<>();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (!map.containsKey("西瓜")){
                map.put("西瓜",s);
            }
        }

    }
}
