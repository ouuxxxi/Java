package com.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//计算一个人出生了多少天
public class Birthday {
  public static void main(String[] args) throws ParseException {
      //1.使用Scanner类中的方法next,获取出生日期
      System.out.println("请输入生日，格式为yyy年MM月dd日：");
      Scanner input = new Scanner(System.in);
      String str = input.next();


      //2.使用DateFormat类中的方法parse,把字符串的出生日期解析为Date格式
      SimpleDateFormat s = new SimpleDateFormat("yyy年MM月dd日");
      Date birthady =  s.parse(str);

      //3.把Date格式的出生日期转换为毫秒值
      long birthdayTime = birthady.getTime();

      //4.获取当前的日期，转换为毫秒值
      long dayTime = new Date().getTime();

      //5.使用当前日期的毫秒值-生日期的毫秒值
      long time = dayTime - birthdayTime;

      //6.把毫秒值的差值转换为天(s/1000/60/60/24)
      System.out.println(time/1000/60/60/24);
  }

}
