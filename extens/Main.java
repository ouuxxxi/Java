package com.java.extens;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     Manager manager = new Manager("小鱼",100);//初始有100
     Memeber one = new Memeber("啵妹",0);//初始0
     Memeber two = new Memeber("赵赵",0);
     Memeber three = new Memeber("李李",0);

     manager.show();
     one.show();
     two.show();
     three.show();
     System.out.println("====================");

     //群主用100元 平均分成3个红包
        ArrayList<Integer> List = manager.send(100,3);

     //三个人收红包
        one.recieve(List);
        two.recieve(List);
        three.recieve(List);

        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
