package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        method();
        //method2();
        //method3();
        method4();
    }

    private static void method4() {
        // 创建集合对象
        List list = new ArrayList();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        // void add(int index,Object element):在指定位置添加元素
        list.add(1, "android");//没有问题
        System.out.println(list);
        // IndexOutOfBoundsException
        //list.add(11, "javaee");//有问题
        System.out.println(list);

        list.add(3, "javaee"); //没有问题
        System.out.println(list);

         list.add(4, "javaee"); //有问题
        System.out.println(list);


        // Object get(int index):获取指定位置的元素
        System.out.println("get:" + list.get(1));
        // IndexOutOfBoundsException
        // System.out.println("get:" + list.get(11));

        // Object remove(int index)：根据索引删除元素,返回被删除的元素
        System.out.println("remove:" + list.remove(1));
        // IndexOutOfBoundsException
        // System.out.println("remove:" + list.remove(11));

        // Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
        System.out.println("set:" + list.set(1, "javaee"));

        System.out.println("list:" + list);
    }

    private static void method3() {
        // 创建集合对象
        List list = new ArrayList();
        Student s1 = new Student("李梓萌", 27);
        Student s2 = new Student("李思思", 30);
        Student s3 = new Student("康辉", 33);
        Student s4 = new Student("海霞", 25);
        Student s5 = new Student("小尼", 22);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        // 把集合转成数组
        Object[] objs = list.toArray();
        // 遍历数组
        for (int x = 0; x < objs.length; x++) {
            // System.out.println(objs[x]);

            Student s = (Student) objs[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }

    private static void method2() {
        // 创建集合对象
        List list = new ArrayList();

        // 创建字符串并添加字符串
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        list.add("world");
        list.add("java");
//有序 重复

        System.out.println(list);



    }

    private static void method() {
        // 创建集合对象
        List list = new ArrayList();

        // 创建字符串并添加字符串
        list.add("hello");
        list.add("world");
        list.add("java");


        // 遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

    }

}
