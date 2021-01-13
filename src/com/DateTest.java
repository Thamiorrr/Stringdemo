package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);//显示当前时间


        String str = "2020-1-13 12:12:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);

        mydays();

    }

    private static void mydays() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期：");
        String bith = sc.next();
        //转化格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(bith);
        //当前毫秒
        long now = System.currentTimeMillis();
        //出生毫秒
        long birhdays = d.getTime();
        long result = now-birhdays;
        System.out.println("你活了" + result/1000/60/60/24 + "天");
    }
}
