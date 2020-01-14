package day13.work.twopass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class work5 {
    public static void main(String[] args) {
         String[] arr={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList<String> list=new ArrayList<>();
        HashSet<String> hashSet=new HashSet<>();
        for (String s:arr){
            hashSet.add(s);
        }
        for (String s:hashSet){
            list.add(s);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
