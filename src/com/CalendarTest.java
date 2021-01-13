package com;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
//        // 其日历字段已由当前日期和时间初始化：
//        Calendar rightNow = Calendar.getInstance(); // 子类对象
//
//        // 获取年
//        int year = rightNow.get(Calendar.YEAR);
//        // 获取月
//        int month = rightNow.get(Calendar.MONTH);
//        // 获取日
//        int date = rightNow.get(Calendar.DATE);
//
//        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
//

        Calendar c = Calendar.getInstance();

        // 获取年
        int year = c.get(Calendar.YEAR);
        // 获取月
        int month = c.get(Calendar.MONTH);
        // 获取日
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        System.out.println("============");


        // // 三年前的今天
        // c.add(Calendar.YEAR, -3);
        // // 获取年
        // year = c.get(Calendar.YEAR);
        // // 获取月
        // month = c.get(Calendar.MONTH);
        // // 获取日
        // date = c.get(Calendar.DATE);
        // System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        // 5年后的10天前
        c.add(Calendar.YEAR, 5);
        c.add(Calendar.DATE, -10);
        // 获取年
        year = c.get(Calendar.YEAR);
        // 获取月
        month = c.get(Calendar.MONTH);
        // 获取日
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        System.out.println("============");

        c.set(2019, 11, 11);
        // 获取年
        year = c.get(Calendar.YEAR);
        // 获取月
        month = c.get(Calendar.MONTH);
        // 获取日
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        judge();
    }

    private static void judge() {
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int date = c.get(Calendar.DATE);
        System.out.println("此年2月有" + date + "天");
    }


}
