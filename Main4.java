package com.java.lanqiaobei;

import java.util.Scanner;

//特殊回文数
public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 10000; i <= 999999; i++) {
            if(i<100000){ //五位数
                int a = i/10000; // 万
                int b = (i/1000)%10;//千
                int c = (i/100)%10;//百
                int d = (i/10)%10;//十
                int e = i%10; //个位
                if(a==e&&b==d&&a+b+c+d+e==n){
                    System.out.println(i);
                }

            }else{
                int A = i/100000;  //十万 899998 => 8
                int B = (i/10000)%10;  // 万
                int C = (i/1000)%10;  //千
                int D = (i/100)%10; //百位
                int E = (i/10)%10; // 十位 89999%10 =>9
                int F = i%10; //个位
                if(A==F && B==E && C==D && A+B+C+D+E+F==n){
                    System.out.println(i);
                }
            }
        }
    }
}
