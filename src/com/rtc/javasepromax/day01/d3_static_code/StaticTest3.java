package com.rtc.javasepromax.day01.d3_static_code;

import java.util.ArrayList;

public class StaticTest3 {

    /**
     *  1.定义一个静态的集合，这样这个集合只加载1个，因为当前房间只需要一副牌
     */
    public static ArrayList<String> cards = new ArrayList<>();

    /**
     * 2.在程序真正运行main方法前，把54张牌放进去，后续游戏可以直接使用
     */
    static {
        // 3.正式做牌，放到集合中去
        cards = getCards(cards);
    }


    public static void main(String[] args) {
        // 目标：模拟游戏启动前，初始化54张牌
        System.out.println("新牌：\n" + StaticTest3.cards);
    }

    /**
     * 生成扑克牌
     * @param cards 保存扑克牌的集合
     * @return
     */
    private static ArrayList<String> getCards(ArrayList<String> cards){
        cards.add("小🃏");
        cards.add("大🃏");
        String[] color = {"♥️", "♠️", "♣️", "♦️"};
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < color.length; j++) {
                cards.add(color[j]+sizes[i]);
            }
        }
        return cards;
    }

}
