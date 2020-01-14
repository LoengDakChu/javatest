package day12.work.ThreePass;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        String[] hua = {"♦", "♣", "♥", "♠"};
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        ArrayList<String> cardList = new ArrayList<>();

        for (int i = 0; i < hua.length; i++) {
            for (int j = 0; j < num.length; j++) {
                String s = hua[i] + num[j];
                cardList.add(s);
            }
        }

        //添加大王小王
        cardList.add("大王");
        cardList.add("小王");

        //洗牌
        Collections.shuffle(cardList);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < cardList.size(); i++) {
            if (i < cardList.size() - 3) {
                if (i % 3 == 0) {
                    player1.add(cardList.get(i));
                } else if (i % 3 == 1) {
                    player2.add(cardList.get(i));
                } else if (i % 3 == 2) {
                    player3.add(cardList.get(i));
                }
            } else {
                diPai.add(cardList.get(i));
            }
        }

        if (player1.contains("大王")) {
            for (String s : diPai) {
                player1.add(s);
            }
        } else if (player2.contains("大王")) {
            for (String s : diPai) {
                player2.add(s);
            }
        }else if (player3.contains("大王")){
            for (String s:diPai){
                player3.add(s);
            }
        }


        System.out.println("玩家一：" + player1);
        System.out.println("玩家二：" + player2);
        System.out.println("玩家三：" + player3);
        System.out.println("底牌：" + diPai);
    }
}
