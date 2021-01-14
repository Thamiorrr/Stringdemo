package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//package com;
//
//public class ExceptionDemo {
//    public static void main(String[] args) {
//        //第一阶段
//        int a = 10;
//        // int b = 2;
//        int b = 0;
//        try {
//            System.out.println(a / b);
//        }catch (ArithmeticException ae){
//            System.out.println("除数不能为0");
//        }
//
//        //第二阶段
//        System.out.println("over");
//
//        method1();
//    }
//
//    private static void method1() {
//        int a = 10;
//        int b = 0;
//        int[] arr = { 1, 2, 3 };
//
//        try {
//            System.out.println(a / b);
//            System.out.println(arr[3]);
//            System.out.println("这里出现了一个异常");
//        } catch (ArithmeticException e) {
//            System.out.println("除数不能为0");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("访问了不该的访问的索引");
//        } catch (Exception e) {
//            System.out.println("出问题了");
//        }
//
//        System.out.println("over");
//    }
//}
//
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {//编译异常
//        method3();
//        method();
//        method2();
//        method4();
//        finall();
        getIntOut();
    }

    private static void getIntOut() {
        System.out.println(getInt());
    }

    private static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;//不执行
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /*
             * return a在程序执行到这一步时，不是return a而是return 30;返回路径形成
             * 但是后面还有finally，所以继续执行finally的内容，a=40
             * 再次回到以前的返回路径，继续走return 30;
             */
        } finally {
            a = 40;
            return a;//如果这样结果就是40
        }
        // return a;
    }

    private static void finall() {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = null;
        try {
            // System.out.println(10 / 0);
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            System.out.println("这里的代码是执行的..........");
        }

        System.out.println(d);
    }

    private static void method4() {
        try {
            method5();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method5() throws Exception {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new Exception();//除法出错抛异常
        } else {
            System.out.println(a / b);
        }
    }

    private static void method3() {
        System.out.println("今天天气很好");
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("但是不该有雾霾");
    }

    // 运行期异常的抛出
    public static void method2() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    // 编译期异常的抛出
    // 在方法声明上抛出，是为了告诉调用者，此处有问题。
    public static void method() throws ParseException {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}