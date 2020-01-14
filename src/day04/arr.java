package day04;

public class arr {
    public static void main(String[] args) {
        //第一种方法：数组存储的数据类型[] 数组名字=new 数组存储的数据类型[长度];
        // int[] arr=new int[3];

        //第二种方法：数组存储的数据类型[] 数组名字=new 数组存储的数据类型[]{元素1,元素2,元素3....};
        //int[] arr=new int[]{1,2,3}

        //第三种方法：数组存储的数据类型[] 数组名字={元素1，元素2，元素3}；
        int[] arr = {1, 2, 3};
        System.out.println(arr);
        // 直接输出数组
        // [I@75412c2f
        // [表示数组
        // I 表示int类型数组, D表示double类型数组
        // @没有什么用
        // 35851384,数组在内存中的地址.相当于家庭住址
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------");

        // 定义一个空数组,动态初始化创建的数组,Java会有默认值
        // int[]的默认值是0, double[]默认值是0.0, boolean[]的默认值是false
        int[] arr2 = new int[3];
        System.out.println(arr2[2]);//无论这里填索引0-2中的任意一个 结果都为0  因为int没有值 默认为0
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("================");

        //数组冒泡
        int[] arr3 = {2, 1, 3, 5, 4};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i+1; j < arr3.length; j++) {
                if (arr3[i]<arr3[j]){
                    int temp=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
