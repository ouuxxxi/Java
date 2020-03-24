package com.java;

import java.util.ArrayList;
import java.util.Collections;

/*
     1、准备排
     2、洗牌
     3、发牌
     4、看牌
*/
public class DouDiZhu {
    public static void main(String[] args) {
         /*
            1、准备牌
          */
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>(54);
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //把大王小王存储到poker集合里
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number);
            }
        }

         /*
            2、洗牌
            使用集合的工具类Collections中的方法
            public static void shuffle(List<?> list)使用默认的随机源随机排列指定的列表。 所有排列都以大致相等的可能性发生。
          */
        Collections.shuffle(poker);
        System.out.println(poker);


        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        /*
         遍历poker集合，获取每一张牌
         使用poker集合下标%3 给3个玩家轮流发牌
         剩余3张牌作为底牌，但首先得判断 i>=51（不然牌会发完）


        */
        for (int i = 0; i <poker.size() ; i++) {
            String s = poker.get(i);//获取一张牌
            if(i>=51){
                dipai.add(s); //给底牌发牌
            }else if(i%3==0){
                player1.add(s);//给player1发牌
            }else if(i%3==1){
                player2.add(s);//给player2发牌
            }else if(i%3==2){
                player3.add(s);//给player3发牌
            }
        }


        /*
          4、看牌
        */
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player2);
        System.out.println("player3:"+player3);
        System.out.println("底牌:"+dipai);
    }
}
