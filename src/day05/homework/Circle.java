package day05.homework;

public class Circle {
    private double r;//半径

    public Circle(){//无参构造方法

    }
    public Circle(double r) {//有参构造方法
        this.r = r;
    }
    public void setR(double r){//set方法
        this.r=r;
    }
    public double getR(){//get方法
        return this.r;
    }
    public void showArea(){
        System.out.println("半径"+r+",圆的面积："+3.14*r*r);
    }
    public void shouPerimeter(){
        System.out.println("半径"+r+",圆的周长："+2*3.14*r);
    }
}
