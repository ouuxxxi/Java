package com.java.lanqiaobei;
import java.util.Scanner;
//杨辉三角：
public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] =1;
            arr[i][i]= 1;
            for (int j = 1; j <i; j++) { //j<i
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {  //记住：这里是j<=i
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
