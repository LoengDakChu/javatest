package day13.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
         coll.add("士大夫");
         coll.add("个");
        boolean t = coll.remove("个");
        System.out.println(coll);
        System.out.println(t);

        List<String> coll2=new ArrayList<>();
        coll2.add("犯得上");
        coll2.add("犯得xia");
        System.out.println(coll2);
        String remove = coll2.remove(1);
        System.out.println(remove);

    }
}
