package day14.work.twoPass;

import java.util.HashMap;

public class work10 {
    public static void main(String[] args) {
        String[] sheng={"黑龙江省","浙江省","江西省","广东省","福建省",};
        String[] city={"哈尔滨","杭州","南昌","广州","福州",};
        HashMap<String,String> map=new HashMap<>();
        for (int i = 0; i < sheng.length; i++) {
            map.put(sheng[i],city[i]);
        }
        System.out.println(map);
    }
}
