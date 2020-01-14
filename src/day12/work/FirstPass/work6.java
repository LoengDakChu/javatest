package day12.work.FirstPass;

public class work6 {
    public static void main(String[] args) {
        function("abc");
        function(1);
    }
    public static <E> void function(E e){
        System.out.println(e);
    }
}
