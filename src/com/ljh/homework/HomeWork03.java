package com.ljh.homework;

import java.util.Scanner;

/**
 * @author 李家豪
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {

//        System.out.println("请输入你的名字");
//        Scanner scanner = new Scanner(System.in);
        String str = "li jia hao";
        System.out.println(nameFormat(str));
    }

    public static String nameFormat(String str){
        String[] strNew = str.split(" ");
//        System.out.println(strNew.length);
        for (String s:strNew){
            System.out.println(s);
        }
        if (strNew.length == 3){
            return strNew[0] + "," + strNew[2] + "." + strNew[1].toUpperCase().charAt(0);
        }
        else {
            throw new RuntimeException("名字的要求是：之含两个空格");
        }

    }
}
