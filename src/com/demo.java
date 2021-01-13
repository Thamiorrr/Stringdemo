package com;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] srgs) {
        //Stringtest();
        //Stringadd();
        //constructor();
        //judge();
        //login();
        //get();
        //count();
        //translate();
        //change();
        //turn();
        //number();
        //transfer();
        //array();
        //BigDecimalDemo();
        //integer();
        //date();
        //stringBuffer();
        Buffer();
    }

    private static void Buffer() {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        s1.append("hello");
        s2.append("world");
        changeb(s1,s2);
        System.out.println("change后 s1为：" + s1 +" s2为： " + s2);
    }

    private static void changeb(StringBuffer s1, StringBuffer s2) {
        s1 = s2;
//        s1.append("a");
//        System.out.println("change中 s1为：" + s1 +" s2为： " + s2);
        s2.append(s1);
        System.out.println("change中 s1为：" + s1 +" s2为： " + s2);

    }

    private static void stringBuffer() {
        StringBuffer sb = new StringBuffer();
        String str = "string";
        System.out.println(sb);
        sb.append(str);
        System.out.println(sb);
        //拼接
        StringBuffer sb2 = sb.append("hello");
        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);

        StringBuffer sb3 = sb2.append("3");
//
        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println("sb3:" + sb3);
//        System.out.println("sb2:" + sb2);
//        System.out.println(sb == sb2);
        //逐步拼接
        sb.append("hello");
        sb.append(true);
        sb.append(12);
        sb.append(34.56);
        System.out.println("sb:" + sb);
        sb.append("hello").append(true).append(12).append(34.56);
        System.out.println("sb:" + sb);
        //指定位置添加
        sb.insert(5, "world");
        System.out.println("sb:" + sb);
        //删除指定位置字符
        sb.deleteCharAt(0);
        System.out.println("sb:" + sb);
        sb.delete(5, 10);
        System.out.println("sb:" + sb);
        //替换
        sb.replace(5, 10, "节日快乐");
        System.out.println("sb:" + sb);
        //反转字符串
        //sb.reverse();
        //截取
        String s1 = sb.substring(5);
        System.out.println("s1:" + s1);
        String s2 = sb.substring(5, 10);
        System.out.println("s2:" + s2);
        String snew = new String(sb);
        String snew1 = sb.toString();
        System.out.println(snew);
        System.out.println(snew1);
        //数组拼接成字符串
        int[] arr = { 44, 33, 55, 11, 22 };
        String sarr = arrayToString(arr);
        StringBuffer sbarr = arrayToStringBuffer(arr);
        System.out.println(sbarr);
        System.out.println(sarr);

        //stringbuffer引用
        StringBuffer sbhello = new StringBuffer("hello");
        StringBuffer sbworld = new StringBuffer("world");
        changeBuffer(sbhello,sbworld);
        System.out.println(sbhello);
        System.out.println(sbworld);
        System.out.println(sbhello + "---" + sbworld);// hello---worldworld
    }

    private static void changeBuffer(StringBuffer sbhello, StringBuffer sbworld) {
        sbhello = sbworld;//改变的是sbhello的指向位置  没有改变hello这个字符串
        System.out.println("sbhello: " + sbhello);
        sbhello.append("aa");
        System.out.println("2接1之前的2" + sbworld);
        sbworld.append(sbhello);
        System.out.println("sbworld: " + sbworld);

    }

    private static StringBuffer arrayToStringBuffer(int[] arr) {
        StringBuffer sbarr = new StringBuffer();
        //遍历数组  拼接
        sbarr.append("[");
        for (int i = 0;i<arr.length; i++){
            sbarr.append(arr[i] + ", ");
        }
        sbarr.append("]");
        return sbarr;
    }

    private static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        //遍历数组 拼接
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    private static void date() {
        //Date():根据当前的默认毫秒值创建日期对象
        Date date = new Date();
        System.out.println(date);
        //System.currentTimeMillis();
//        long time = 2*1000 * 60 * 60;
        //当前时间一小时后
        long time = System.currentTimeMillis() + 3600*1000;
        Date d2 = new Date(time);
        System.out.println("d2:" + d2);

        Date setD = new Date();
        //getTime():获取时间，以毫秒为单位
        long time1 = setD.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());

        System.out.println("D:" + setD);
        setD.setTime(1000);
        System.out.println("D:" + setD);
    }

    private static void integer() {
        BigInteger bi1 = new BigInteger("2147483648");
        BigInteger bi2 = new BigInteger("2147483648");
        BigInteger bi3 = new BigInteger("205");
        BigInteger bi4 = new BigInteger("100");

        System.out.println("bi1:" + bi1);
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
        BigInteger a[] = bi3.divideAndRemainder(bi4);
        System.out.println(a[0]);
        System.out.println(a[1]);

    }


    private static void BigDecimalDemo() {
//        System.out.println("0.09 + 0.01: " + (0.09 + 0.01));
//        System.out.println("1.0 - 0.32: " + (1.0 - 0.32));
//        System.out.println("1.015 * 100: " + (1.015 * 100));
//        System.out.println("1.301 / 100: " + (1.301 / 100));
//        System.out.println("1.0 - 0.12: " + (1.0 - 0.12));

        BigDecimal num1 = new BigDecimal("0.09");
        BigDecimal num2 = new BigDecimal("0.01");
        BigDecimal num3 = new BigDecimal("1.0");
        BigDecimal num4 = new BigDecimal("0.32");
        BigDecimal num5 = new BigDecimal("1.015");
        BigDecimal num6 = new BigDecimal("100");
        BigDecimal num7 = new BigDecimal("1.301");
        BigDecimal num8 = new BigDecimal("0.1");
//
        System.out.println("0.09 + 0.01: " + num1.add(num2));
        System.out.println("1.0 - 0.32: " + num3.subtract(num4));
        System.out.println("1.015 * 100: " + num5.multiply(num6));
        System.out.println("1.301 / 100: " + num7.divide(num6));
        System.out.println("1.0 - 0.12: " + num3.subtract(num8));
        System.out.println(num1);
    }

    private static void array() {
        int[] arr = {1,2,3};
        for(int i = 0; i<arr.length; i++){
            System.out.println("增加前第" + i +"个元素是" + arr[i]);
        }
        add(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println("增加后第" + i +"个元素是" + arr[i]);
        }
    }

    private static void add(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            arr[i] += 10;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println("增加时第" + i +"个元素是" + arr[i]);
        }
    }

    private static void transfer() {
        int num1 = 100;
        int num2 = 90;
        exchange(num1,num2);
        System.out.println("交换后num1：" + num1 + " num2：" + num2);//100 90
    }

    private static void exchange(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("交换中num1：" + num1 + " num2：" + num2);//90 100
    }

    private static void number() {
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";

        int count = 0;
        int i = 0;
//        maxString.indexOf("java",i) == -1
        while(true){
            i = maxString.indexOf("java",i+1);
            System.out.println(i);

            if (i == -1){
                break;
            }else {count++;}
        }
        System.out.println(count);

    }

    private static void turn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        String turn = "";
        char[] chs = s.toCharArray();

        for(int i = s.length()-1; i>=0; i--){
            turn += chs[i];
        }
        System.out.println(turn);

        String test = "";
        for(int i = s.length()-1; i>=0; i--){
            test += s.charAt(i);
        }
        System.out.println(test);
    }

    private static void change() {
        String s1 = "helloworld";
        String s2 = s1.replace('l', 'A');
        String s3 = s1.replace("owo", "XXX");
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("s3:" + s3);
        System.out.println("================");

        // 去除字符串两空格
        String s4 = " hello world  ";
        String s5 = s4.trim();
        System.out.println("s4:" + s4 + "---");
        System.out.println("s5:" + s5 + "---");

        // 按字典顺序比较两个字符串
        String s6 = "hello";
        String s7 = "hello";
        String s8 = "abc";
        String s9 = "abd";
        System.out.println(s6.compareTo(s7));// 0
        System.out.println(s6.compareTo(s8));// 7
        System.out.println(s6.compareTo(s9));// 7
        System.out.println(s8.compareTo(s9));// -1

        //按要求输出字符串
        int[] arr = {1,2,3};
        String result = "[";
        for (int i=0; i < arr.length; i++){
            result = result.concat(String.valueOf(arr[i]) + ", ");
            System.out.println(String.valueOf(arr[i]));
        }
        result = result.concat("]");
        System.out.println(result);
    }

    private static void translate() {
        String s = "helloworld";
        byte[] bys = s.getBytes();// char[] toCharArray():把字符串转换为字符数组。
        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }
        System.out.println("================");
        char[] chs = s.toCharArray();//把字符数组转成字符串。
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        System.out.println("================");
        //字符数组合成字符串
        String s1 = String.valueOf(chs);
        System.out.println(s1);
        System.out.println("================");

        //把int类型的数据转成字符串。
        int i = 100;
        String s2 = String.valueOf(i);
        System.out.println(s2);
        System.out.println("================");

        // 把字符串转成大写。
        System.out.println("toUpperCase:" + s.toUpperCase());
        System.out.println("s:" + s);
        System.out.println("================");

        //把字符串转成小写。
        System.out.println("toLowerCase:" + s.toLowerCase());
        System.out.println("s:" + s);
        System.out.println("================");


        // String concat(String str):把字符串拼接。
        String s3 = "hello";
        String s4 = "world";
        String s5 = s3 + s4;
        String s6 = s3.concat(s4);
        System.out.println("s5:"+s5);
        System.out.println("s6:"+s6);

        String schange = "helloWORLD";
        System.out.println("result" + s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase()));
    }

    private static void count() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;
        int signcount = 0;
        System.out.println("请输入");
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                numbercount++;
            }else if(ch>='a' && ch<='z'){
                smallcount++;
            }else if(ch>='A' && ch<='Z'){
                bigcount++;
            }else{
                signcount++;
            }
        }
        System.out.println("大写字母" + bigcount + "个");
        System.out.println("小写字母" + smallcount + "个");
        System.out.println("数字" + numbercount + "个");
        if(signcount != 0){
            System.out.println("特殊字符" + signcount + "个");
        }
    }

    private static void get() {
        String s = "helloworld";
        //获取长度
        System.out.println("lenth" + s.length());//10
        //获取指定位置字符
        System.out.println("chartAt" + s.charAt(2));//l
        //返回指定字符在此字符串中第一次出现处的索引。
        System.out.println("indexOf" + s.indexOf("l"));//2
        //返回指定字符串在此字符串中第一次出现处的索引。
        System.out.println("indexOf" + s.indexOf("el"));//1
        //返回指定字符在此字符串中从指定位置后第一次出现处的索引。
        System.out.println("indexOf" + s.indexOf("l",2));//2
        System.out.println("indexOf" + s.indexOf("l",3));//3
        System.out.println("indexOf" + s.indexOf("A",2));//-1
        System.out.println("indexOf" + s.indexOf("l",10));//-1
        String s1 = "helloworldhelloworld";
        System.out.println("indexOf" + s1.indexOf("ll",6));//-1

        // String substring(int start):从指定位置开始截取字符串,默认到末尾。包含start这个索引
        System.out.println("substring" + s.substring(2));//lloworld
        System.out.println("substring" + s.substring(2,4));//ll
        System.out.println("substring" + s.substring(0,s.length()));//全选


    }

    private static void login() {
        String username = "admin";
        String password = "admin";
        for(int i = 0;i < 3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String password_input = sc.nextLine();

            if(username.equals(name)&&password.equals(password_input)){
                System.out.println("登录成功");
                break;
            }else {
                if(i!=2) {
                    System.out.println("登录失败，剩余尝试次数" + (2 - i));
                }else {
                    System.out.println("登录失败三次，账户锁定");
                }
            }
        }
    }

    private static void Stringadd() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println("s3 == s1+s2" + (s3 == s1+s2));//false
        System.out.println("s3.equals(s1+s2)" + s3.equals(s1+s2));//true

        System.out.println("s3 == \"hello\" + \"world\""+ (s3 == "hello" + "world"));//true
        System.out.println("s3.equals(\"hello\"+\"world\")" + s3.equals("hello"+"world"));//true

        System.out.println("s3 == \"helloworld\"" + (s3 == "helloworld"));//true
        System.out.println("s3.equals(\"helloworld\")" + s3.equals("helloworld"));//true
    }

    public static void Stringtest(){
        String s = "hello";
        s += "world";
        System.out.println("s:" + s);

        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println("AAAAA"+ (s1 == s2));//fa
        System.out.println("s1.equals(s2)" + s1.equals(s2));//true

        String s_1 = new String("hello");
        String s_2 = new String("hello");
        System.out.println("s_1 == s_2:" + (s_1 == s_2));//false
        System.out.println("s_1.equals(s_2)" + s_1.equals(s_2));//true

        String s_3 = new String("hello");
        String s_4 = "hello";
        System.out.println("s_3 == s_4:" + (s_3 == s_4));//false
        System.out.println("s_3.equals(s_4)" + s_3.equals(s_4));//true

        String s_5 = "hello";
        String s_6 = "hello";
        System.out.println("s_5 == s_6:" + (s_5 == s_6));//false
        System.out.println("s_5.equals(s_6)" + s_5.equals(s_6));// true

    }
    public static void constructor(){
        String s1 = new String();
        System.out.println("s1:" + s1);
        System.out.println("s1:" + s1.length());
        System.out.println("=============================");

        byte[] bytes = {97, 98, 99, 100, 101};
        String s2 = new String(bytes);
        System.out.println("s2" + s2);
        System.out.println("s2" + s2.length());
        System.out.println("=============================");

        String s3 = new String(bytes, 1, 3);
        System.out.println("s3" + s3);
        System.out.println("s3" + s3.length());
        System.out.println("=============================");

        char[] chs = {'a', 'b', 'c', 'd', 'e', '李', '梓', '萌'};
        String s4 = new String(chs);
        System.out.println("s4" + s4);
        System.out.println("s4" + s4.length());
        System.out.println("=============================");

        String s5 = new String(chs, 2, 5);
        System.out.println("s5" + s5);
        System.out.println("s5" + s5.length());
        System.out.println("=============================");

        String s6 = new String("abcde");
        System.out.println("s6" + s6);
        System.out.println("s6" + s6.length());
        System.out.println("=============================");

        String s7 = "abcde";
        System.out.println("s7" + s7);
        System.out.println("s7" + s7.length());
        System.out.println("=============================");
    }
    public static void judge(){
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "HelloWorld";

        // boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
        System.out.println("s1.equals(s2):" + s1.equals(s2));//true
        System.out.println("s1.equals(s3):" + s1.equals(s3));//false
        System.out.println("=============================");

        // boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println("s1.equalsIgnoreCase(s2):" + s1.equalsIgnoreCase(s2));//true
        System.out.println("s1.equalsIgnoreCase(s3):" + s1.equalsIgnoreCase(s3));//true
        System.out.println("=============================");

        // boolean contains(String str):判断大字符串中是否包含小字符串
        System.out.println("s1.contains(\"hello\"):" + s1.contains("hello"));//true
        System.out.println("s1.contains(\"AAAA\"):" + s1.contains("AAAA"));//fa
        System.out.println("=============================");

        // boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
        System.out.println("s1.startsWith(\"h\"):" + s1.startsWith("h"));//true
        System.out.println("s1.startsWith(\"hello\"):" + s1.startsWith("hello"));//true
        System.out.println("s1.startsWith(\"world\"):" + s1.startsWith("world"));//true
        System.out.println("=============================");

        System.out.println("s1.endsWith(\"d\")" + s1.endsWith("d"));//true
        System.out.println("s1.endsWith(\"world\")" + s1.endsWith("world"));//false
        System.out.println("s1.endsWith(\"AA\")" + s1.endsWith("AA"));//false

        System.out.println("s1.isEmpty()" + s1.isEmpty());//false
        String s4 = "";
        System.out.println("s4.isEmpty()" + s4.isEmpty());//false
    }
}
