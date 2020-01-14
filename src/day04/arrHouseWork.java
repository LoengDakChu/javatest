package day04;

public class arrHouseWork {
    public static void main(String[] args) {
        System.out.println("------第一题------");
        int[] arr = {12, 33, 25, 6, 16};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值为" + min);

        System.out.println("------第二题------");
        int[] arr1 = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("------第三题------");
        int[] nums = {5, 10, 15};
        int[] newnums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            newnums[i] = nums[i] * 2;
        }
        System.out.println("nums数组：" + nums[0] + " " + nums[1] + " " + nums[2]);
        System.out.println("newnums新数组：" + newnums[0] + " " + newnums[1] + " " + newnums[2]);

        System.out.println("------第四题------");
        System.out.println("你的双色球号码为：");
        int[] array = {1, 8, 10, 12, 18, 28, 12};
        printBall(array);

        System.out.println("------第五题------");
        int[] arr2 = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int avg = getAvg(arr2);
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > avg) {
                count++;
            }
        }
        System.out.println("高于平均分：" + avg + "的个数有" + count + "个");

        System.out.println("------第六题------");
        int[] arr3 = {1, 2, 3, 4, 3, 2, 1};
        boolean flag = false;
        for (int star = 0, end = arr3.length - 1; star < end; star++, end--) {
            if (arr3[star] == arr3[end]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println("是否对称：" + flag);

        System.out.println("------第七题------");
        boolean y = equals();
        System.out.println("是否一致：" + y);

        System.out.println("------第八题------");
        char[] score={'A','D','B','C','D'};
        char[] ming={'D','C','B','A','D'};
        char[] hong={'A','D','B','C','D'};
        char[] huang={'A','D','B','C','A'};
        char[] qiang={'A','B','C','D','D'};
        int mf=0;
        int hof=0;
        int hf=0;
        int qf=0;
        for (int i = 0; i <score.length ; i++) {
            if (score[i]==ming[i]){
                mf+=2;
            }if (score[i]==hong[i]){
                hof+=2;
            }if (score[i]==huang[i]){
                hf+=2;
            }if (score[i]==qiang[i]){
                qf+=2;
            }
        }
        System.out.println("满分10分,"+"小明得分："+mf+"分");
        System.out.println("满分10分,"+"小红得分："+hof+"分");
        System.out.println("满分10分,"+"小黄得分："+hf+"分");
        System.out.println("满分10分,"+"小强得分："+qf+"分");

        System.out.println("------第九题------");
        String[] word={"黑桃","红桃","梅花","方块"};
        String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i <word.length ; i++) {
            for (int j = 0; j <num.length; j++) {
                System.out.println(word[i]+num[j]);
            }
        }

        System.out.println("------第十题------");
        int[] arr5={99,100,98,97,96};
        int max1=arr5[0];
        int min1=arr5[0];
        int sum=0;
        for (int i = 0; i <arr5.length ; i++) {
            sum=sum+arr5[i];
            if (arr5[i]>max1){
                max1=arr5[i];
            }else if (arr5[i]<min1) {
                min1 = arr5[i];
            }

        }
        int vag=(sum-max1-min1)/3;
        System.out.println(max1);
        System.out.println(min1);
        System.out.println(sum);
        System.out.println(vag);
    }

    //第四题
    public static void printBall(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //第五题
    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }

    //第七题
    public static boolean equals() {
        int[] arr4 = {1, 2, 3, 4, 3, 2, 1};
        int[] newarr = {1, 2, 3, 4, 3, 2, 1};
        boolean flag1 = false;
        for (int i = 0; i< arr4.length; i++) {
            if (arr4.length == newarr.length) {
                if (arr4[i] == newarr[i]) {
                    flag1 = true;
                }
                else {
                    flag1=false;
                    break;
                }
            } else {
                flag1 = false;
                break;
            }
        }
        return flag1;
    }
}
