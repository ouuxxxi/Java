package com.java.lanqiaobei;
//特殊的数字：153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
public class Main5 {
    public static void main(String[] args) {
        for (int n =100;n<1000;n++){
            int a = (int)Math.pow(n/100,3);
            int b = (int)Math.pow(n/10%10,3);
            int c = (int)Math.pow(n%10,3);
            if(a+b+c==n){
                System.out.println(n);
            }
        }
    }

}
