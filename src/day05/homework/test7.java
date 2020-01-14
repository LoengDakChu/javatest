package day05.homework;

public class test7 {
    public static void main(String[] args) {
        Book book1=new Book(01,"java",888,28.8,"1999-02-03");
        Book book2=new Book(02,"c#",777,39.9,"1980-05-03");
        Book book3=new Book(03,"python",666,49.8,"2005-02-03");
        Book gui=book1;
        if (gui.getPrice()<book2.getPrice()){
            gui=book2;
        }
        if (gui.getPrice()<book3.getPrice()){
            gui=book3;
        }
        gui.showBook();
    }
}
