package com.java.extens;
import java.util.ArrayList;
//群主
public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send (int totalyMoney,int count){
       //需要一个集合 存储totalyMoney被分之后的钱（一共有cout份）
        ArrayList<Integer> List = new ArrayList<>();

        //原本有多少钱
        int leftMoney = super.getMoney();
        if(totalyMoney > leftMoney){
            System.out.println("余额不足");
            return List;
        }

        //修改原本钱的金额
        super.setMoney(leftMoney-totalyMoney);

        //均分成count份 不一定除尽 可能还有零头
        int avg = totalyMoney/count;
        int mod = totalyMoney%count;

        for (int i = 0; i <count-1 ; i++) { //count-1：让最后一个红包加上零头
            List.add(avg);
        }

         int last = avg + mod;
         List.add(last);

         return List;
    }
}
