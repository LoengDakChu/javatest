package day09.work.work3;

public interface AA {
    public abstract void showA();

//    private default void show10(String str){
//
//    }

    public default void showB10(String str){
        for (int i = 0; i <10 ; i++) {
            System.out.print(str+" ");
        }
    }

    public default void showC10(String str){
        for (int i = 0; i <10 ; i++) {
            if (i==9){
                System.out.println(str);
            }else {
                System.out.print(str+" ");
            }
        }
    }
}
