package com;
//给定字符串一个字符串, 判断其是否全部由数字所组成.
//思路: 将字符串变为字符数组而后判断每一位字符是否是" 0 "~"'9'"之间的内容，如果是则为数字

public class TestDemon13 {
    public static void main(String[] args) {
        String str = "12ghjg";
        System.out.println(isNumber(str));
    }

    public static boolean isNumber(String str){
         char a[]=str.toCharArray();
         for (int i = 0; i <a.length ; i++) {
             if(a[i]<'0'||a[i]>'9'){
                 return false;
             }
         }
         return true;
        }

}
