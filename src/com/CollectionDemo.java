package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //method();
        //mathod1();
        //mathod2();
        //studen1();
        //studen2();
        student3();
        
    }

    private static void student3() {
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建学生对象
        Student s1 = new Student("李梓萌", 27);
        Student s2 = new Student("李思思", 30);
        Student s3 = new Student("康辉", 33);
        Student s4 = new Student("海霞", 25);
        Student s5 = new Student("小尼", 22);
        //添加学生到集合里
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

        Iterator it = c.iterator();
        while (it.hasNext()) {
            // System.out.println(it.next());
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }

    private static void studen2() {
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建并添加元素
        // String s = "hello";
        // c.add(s);
        c.add("hello");
        c.add("world");
        c.add("java");

        // Iterator iterator():迭代器，集合的专用遍历方式
        Iterator it = c.iterator(); // 实际返回的肯定是子类对象，是多态

        // 最终版代码
        while (it.hasNext()) {
            // System.out.println(it.next());
            String s = (String) it.next();
            System.out.println(s);
        }
    }
    private static void studen1() {
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建学生对象
        Student s1 = new Student("李梓萌", 27);
        Student s2 = new Student("李思思", 30);
        Student s3 = new Student("康辉", 33);
        Student s4 = new Student("海霞", 25);
        Student s5 = new Student("小尼", 22);

        // 把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);


        // 把集合转成数组
        Object[] objs = c.toArray();
        // 遍历数组
        for (int x = 0; x < objs.length; x++) {
            // System.out.println(objs[x]);

            Student s = (Student) objs[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }

    private static void mathod2() {
        // 创建集合对象
        Collection c = new ArrayList();

        // 添加元素
        c.add("hello"); // Object obj = "hello"; 向上转型
        c.add("world");
        c.add("java");

        // 遍历
        // Object[] toArray():把集合转成数组，可以实现集合的遍历
        Object[] objs = c.toArray();
        for (int x = 0; x < objs.length; x++) {
            // System.out.println(objs[x]);
            // System.out.println(objs[x] + "---" + objs[x].length());
            // 上面的实现不了，原因是Object中没有length()方法
            // 我们要想使用字符串的方法，就必须把元素还原成字符串
            // 向下转型
            String s = (String) objs[x];
            System.out.println(s + "---" + s.length());
        }
    }
        private static void mathod1 () {
            // 创建集合1
            Collection c1 = new ArrayList();
            c1.add("abc1");
            c1.add("abc2");
            c1.add("abc3");
            c1.add("abc4");

            // 创建集合2
            Collection c2 = new ArrayList();
//		c2.add("abc1");
//		c2.add("abc2");
//		c2.add("abc3");
//		c2.add("abc4");
            c2.add("abc5");
            c2.add("abc6");
            c2.add("abc7");

            // boolean addAll(Collection c):添加一个集合的元素
            System.out.println("addAll:" + c1.addAll(c2));
            System.out.println("添加" + c1);
            //boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
            //只要有一个元素被移除了，就返回true。
            System.out.println("removeAll:" + c1.removeAll(c2));
            System.out.println("删除" + c1);
            c1.addAll(c2);
            System.out.println("c1: " + c1);
            System.out.println("c2: " + c2);
            //boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
            //只有包含所有的元素，才叫包含
            System.out.println("containsAll:" + c1.containsAll(c2));

            //boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
            //假设有两个集合A，B。
            //A对B做交集，最终的结果保存在A中，B不变。
            //返回值表示的是A是否发生过改变。
            System.out.println("retainAll:" + c1.retainAll(c2));

            System.out.println("c1:" + c1);
            System.out.println("c2:" + c2);
        }

        private static void method(){
            // 测试不带All的方法

            // 创建集合对象
            // Collection c = new Collection(); //错误，因为接口不能实例化
            Collection c = new ArrayList();

            // boolean add(Object obj):添加一个元素
            System.out.println("add:" + c.add("hello"));
            c.add("hello");
            c.add("world");
            c.add("java");
            System.out.println("c:" + c);
            //c.add("hello");

            // void clear():移除所有元素
            // c.clear();

            //boolean remove(Object o):移除一个元素
            System.out.println("remove:" + c.remove("hello"));
            // System.out.println("remove:" + c.remove("javaee"));

            // boolean contains(Object o)：判断集合中是否包含指定的元素
            System.out.println("contains:" + c.contains("hello"));//TRUE
            System.out.println("contains:" + c.contains("AAAAA"));//FALSE

            // boolean isEmpty()：判断集合是否为空
            // System.out.println("isEmpty:"+c.isEmpty());

            //int size():元素的个数
            System.out.println("size:" + c.size());
            System.out.println("c:" + c);
        }

}
