package day08.homework.work3;

public class Animal {
    private String name;
    private String color;
    private double price;

    public Animal() {
    }

    public Animal(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void eat(){
        System.out.println(this.name+"在吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
