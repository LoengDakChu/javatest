package day03;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("------第一题------");
        int score = 30;
        if (score <= 100 && score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("一般");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score < 60 && score >= 0) {
            System.out.println("废物");
        }

        System.out.println("------第二题------");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1到100的奇数和等于" + sum);

        System.out.println("------第三题------");
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum1+=i;
            }
        }
        System.out.println("1到100里面同时是3和5的倍数的总和："+sum1);

        System.out.println("------第四题------");
        int i=1;
        while (i<=10){
            System.out.println("i:"+i);
            i++;
        }

        System.out.println("------第五题------");
        for (int j=1;j<=15;j++){
            if (j%3==0){
                continue;
            }
            System.out.println(j);
        }

        System.out.println("------第六题------");
        for (int j=100;j<=999;j++){
            int b=j/100;
            int s=j/10%10;
            int g=j%10;
            if (b*b*b+s*s*s+g*g*g==j){
                System.out.println(j);
            }
        }

        System.out.println("------第七题------");
        for (int x=1;x<=60;x++){
            if (x%2==0){
                System.out.print(x+" ");
                if (x%5==0){
                    System.out.println();
                }
            }
        }
        System.out.println("------第八题------");
        for (int x=1;x<=12;x++){
            switch (x){
                case 1:
                    System.out.println(x+":"+"水瓶");
                    break;
                case 2:
                    System.out.println(x+":"+"双鱼");
                    break;
                case 3:
                    System.out.println(x+":"+"白羊");
                    break;
                case 4:
                    System.out.println(x+":"+"金牛");
                    break;
                case 5:
                    System.out.println(x+":"+"双子");
                    break;
                case 6:
                    System.out.println(x+":"+"巨蟹");
                    break;
                case 7:
                    System.out.println(x+":"+"狮子");
                    break;
                case 8:
                    System.out.println(x+":"+"处女");
                    break;
                case 9:
                    System.out.println(x+":"+"天秤");
                    break;
                case 10:
                    System.out.println(x+":"+"天蝎");
                    break;
                case 11:
                    System.out.println(x+":"+"射手");
                    break;
                case 12:
                    System.out.println(x+":"+"摩羯");
                    break;
            }
        }
        System.out.println("------第九题------");
        for (int j = 1; j <=8 ; j++) {
            for (int k = 1; k <=8 ; k++) {
                if (k==j || k==8-j+1){
                    System.out.print("O");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
