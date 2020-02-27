package com.java.lanqiaobei;

import java.util.Scanner;

//十进制转十六进制
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a==0){
            System.out.println(0);
        }
        StringBuffer s = new StringBuffer();
        char[] arr ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (a!=0){
            int i = a%16;
            s=s.append(arr[i]);
            a/=16;
        }
        System.out.println(s.reverse().toString());

    }
}

/*
* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        char[] S = new char[100];
        if(number == 0){
            System.out.print(0);
        }
        else{
            while(number!=0)
            {
                int t=number%16;
                if(t >=0 && t<10)
                {
                    S[i] = (char)(t+'0');
                    i++;
                }
                else
                {
                    S[i] = (char)(t+'A'-10);
                    i++;
                }
                number=number/16;
            }

            for (int j=i-1;j>=0;j--)
            {
                System.out.print(S[j]);
            }
        }
    }
}*/