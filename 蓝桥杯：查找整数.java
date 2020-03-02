package com.java.lanqiaobei;

import java.util.Scanner;

//查找整数:给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }

        int a = input.nextInt();
        int t=0;
        for ( int j = 0; j <arr.length; j++) {
            if(arr[j]==a){
                t=j+1;
                break;
            }else{
                t=-1;
            }
        }
        System.out.println(t);
    }
}
