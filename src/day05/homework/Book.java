package day05.homework;

public class Book {
    private int code;
    private String name;
    private int isbn;
    private double price;
    private String pubtime;

    public Book(){

    }
    public Book(int code, String name, int isbn, double price, String pubtime) {
        this.code = code;
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.pubtime = pubtime;
    }

    public void showBook(){
        System.out.println("最贵的书是："+code+"，"+name+"，isbn"+isbn+"，"+price+"，"+pubtime);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }
}
