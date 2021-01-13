package com;

public class CharacterTest {
    public static void main(String[] args) {
        // 创建对象
        Character ch = new Character('a');
        System.out.println("ch: " + ch);




        //isUpperCase(char ch):判断给定的字符是否是大写字符
        System.out.println("isUpperCase:" + Character.isUpperCase('A'));//true
        System.out.println("isUpperCase:" + Character.isUpperCase('a'));//false
        System.out.println("isUpperCase:" + Character.isUpperCase('0'));//false
        System.out.println("==================================");
        //判断给定的字符是否是小写字符
        System.out.println("isLowerCase:" + Character.isLowerCase('A'));//false
        System.out.println("isLowerCase:" + Character.isLowerCase('a'));//true
        System.out.println("isLowerCase:" + Character.isLowerCase('0'));//false
        System.out.println("==================================");
        //判断给定的字符是否是数字字符
        System.out.println("isDigit:" + Character.isDigit('A'));//false
        System.out.println("isDigit:" + Character.isDigit('a'));//false
        System.out.println("isDigit:" + Character.isDigit('0'));//true
        System.out.println("==================================");
        //把给定的字符转换为大写字符
        System.out.println("toUpperCase:" + Character.toUpperCase('A'));
        System.out.println("toUpperCase:" + Character.toUpperCase('a'));
        System.out.println("==================================");
        //把给定的字符转换为小写字符
        System.out.println("toLowerCase:" + Character.toLowerCase('A'));
        System.out.println("toLowerCase:" + Character.toLowerCase('a'));
        System.out.println("==================================");

    }
}
