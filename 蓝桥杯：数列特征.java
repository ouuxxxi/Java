package com.java.lanqiaobei;

import java.util.Scanner;

//数列特征:给出n个数，找出这n个数的最大值，最小值，和。
public class Main8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int max =Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum =0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

            sum+=arr[i];

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
