package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args){
        String s = "山东大学软件学院";
//        String s1 = "[";
//        for (int i = 0; i < s.length(); i++){
//            if(i<s.length()) {
//                s1.concat(s.substring(i, i + 1));
//            }else {
//                s1.concat("]");
//            }
//        }
//        char[] chs = s.toCharArray();
////        for (int i = 0; i < chs.length; i++) {
////            System.out.println(chs[i]);
////        }
//        System.out.println(chs);
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        char[] chs = s.toCharArray();
        System.out.println(chs);


//        s.toCharArray();
//        System.out.println(chs);

    }
}
