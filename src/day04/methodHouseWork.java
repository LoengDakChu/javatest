package day04;

public class methodHouseWork {
    public static void main(String[] args) {
        printEven(20);//第一题

        int a = getSum(20);//第二题
        System.out.println("总和" + a);

        int zc = getPerimeter(20, 8);//第三题周长
        System.out.println("周长为" + zc);
        int mj = getArea(20, 8);
        System.out.println("面积为" + mj);

        char zf=getChar(65);//第四题
        System.out.println("字符："+zf);

        String color="blue";//第五题
        showColor(color);

        prinX();//第六题

        double d=10.3;//第七题
        int n=(int) round(d);
        System.out.println(d+"->"+n);

        double s1=30.0;//第八题
        double h1=scentig(s1);
        System.out.println("摄氏度为："+s1+"°"+"--"+"华氏度为："+h1+"°");
        double h2=86.0;
        double s2=hcentig(h2);
        System.out.println("华氏度为："+h2+"°"+"--"+"摄氏度为："+s2+"°");

        ninetonine();//第九题
    }

    public static void printEven(int n) {
        System.out.println("------第一题------");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getSum(int n) {
        System.out.println("------第二题------");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int getPerimeter(int length, int width) {
        System.out.println("------第三题------");
        return (length + width) * 2;
    }

    public static int getArea(int length, int width) {
        return length * width;
    }

    public static char getChar(int num) {
        System.out.println("------第四题------");
        if (num >= 48 && num <= 57) {
            return (char) num;
        } else if (num >= 65 && num <= 90) {
            return (char)num;
        }else if (num>=97&&num<=122){
            return (char)num;
        }else {
            return ' ';
        }
    }

    public static void showColor(String color){
        System.out.println("------第五题------");
        switch (color){
            case "red":
                System.out.println("红色");
                break;
            case "blue":
                System.out.println("蓝色");
                break;
            case "green":
                System.out.println("绿色");
                break;
        }
    }

    public static void prinX(){
        System.out.println("------第六题------");
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                if (j==i||j==10-i+1){
                    System.out.print("O");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static double round(double n){
        System.out.println("------第七题------");
        return n+0.5;
    }

    public static double  scentig(double c){
        System.out.println("------第八题------");
        return (9.0/5)*c+32;
    }
    public static double hcentig(double c){
        return (c-32)/(9.0/5);
    }

    public static void ninetonine(){
        System.out.println("------第九题------");
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j*i<10){
                    System.out.print(j+"X"+i+"="+j*i+"  ");
                }else {
                    System.out.print(j+"X"+i+"="+j*i+" ");
                }
            }
            System.out.println();
        }
    }
}
