package com.java.string;
//统计个数
import java.util.Scanner;

public class Stringpractices2 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符：");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] arr = str.toCharArray();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count1++;
            } else if (ch >= 'a' && ch <= 'z') {
                count2++;
            } else if (ch >= '0' && ch <= '9') {
                count3++;
            } else {
                count4++;
            }
        }
        System.out.println("大写字母个数："+count1);
        System.out.println("小写字母个数："+count2);
        System.out.println("数字个数："+count3);
        System.out.println("其他字符个数："+count4);
    }
}