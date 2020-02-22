package com.java.math;
//计算-10.8-5.9之间，绝对值大于6 小于2的整数个数
public class Problem {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count=0;
        for ( double i=Math.ceil(min);i<max;i++){  //也可以直接强转 int i =(int)min
            double num=Math.abs(i);;
            if(num>6 || num<2.1){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("整数的个数:"+count);
    }
}
