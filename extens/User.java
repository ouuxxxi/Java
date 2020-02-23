package com.java.extens;

//用户 （成员与群主共有的部分）
public class User {
    private String name;
    private  int money;

    public  User(){

    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //显示当前用户有多少钱
    public void show(){
        System.out.println("我是"+ name +" "+ "我有"+ money +"元");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
