package com.java.lanqiaobei;

import java.util.Scanner;

//阶乘计算
//使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。
//　　将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
//　　首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。
public class Main11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 1;
        for (int a = 1;a<=n;a++){
             int[] A = new int[4];
                for (int i = 1; i <= A.length; i++) {
                       sum=A[0]*n+10*A[1]*n+100*A[2]*n;
            }
        }
        System.out.println(sum);
    }
}
