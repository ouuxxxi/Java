package com.java.extens;

import java.util.ArrayList;
import java.util.Random;

//成员
public class Memeber extends User{
    public Memeber() {
    }

    public Memeber(String name, int money) {
        super(name, money);
    }

    public void recieve(ArrayList<Integer> List){
        //从多个红包中抽取一个 随机获取一个索引号（集合中的下标值）
        int i = new Random().nextInt(List.size());//下标值小于集合总长度

        int receiveMoney=List.remove(i);//拿到了红包（从集合中删除这个元素）

        int nowMoney= super.getMoney();

        super.setMoney(receiveMoney+nowMoney);//现在拿到的钱
    }
}
