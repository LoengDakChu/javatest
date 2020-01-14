package day03;

public class TwoFor {
    public static void main(String[] args) {
//        for (int x=1;x<=5;x++){
//            for (int y=1;y<=8;y++){
//                System.out.print("☆");
//            }
//            System.out.println();
//        }
//        for (int x=1;x<=5;x++){
//            for (int k=5;k>=x;k--){
//                System.out.print(" ");
//            }
//            for (int y=1;y<=x;y++){
//                System.out.print("☆");
//            }
//            System.out.println();
//        }

        for (int x=1;x<=5;x++){
            for (int y=1;y<=5;y++){
                if (x==y || y==5-x+1){
                    System.out.print("★");
                }
                else {
                    System.out.print("☆");
                }

            }
            System.out.println("");
        }


    }
}
