package com.java.string;
//按照指定格式{1，2，3}拼接成字符串[word1#word2#word3#]
public class Stringpractices1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        String str1=getString(arr);
        System.out.println(str1);
    }
    public static String getString(int[] arr){
        String str="[";
        //要判断是不是最后一个字符
        for (int i = 0; i < arr.length; i++) {
           if(i==arr.length-1){
               str+= "word"+ arr[i] + "]";
           }else {
               str+= "word"+ arr[i] + "#";//拼接
           }

        }
        return str;
    }
}
