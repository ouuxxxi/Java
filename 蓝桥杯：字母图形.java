package com.java.lanqiaobei;

import java.util.Scanner;

//字母图形
public class Main9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b ; j++) {
                char c = (char)(Math.abs(i-j)+'A');
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
