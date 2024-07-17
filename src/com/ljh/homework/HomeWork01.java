package com.ljh.homework;

/**
 * @author 李家豪
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

        String str = "asdfghj";
        try {
            System.out.println(StringMethod01.reverse(str, 1, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("运行结束");
        }
    }

}

class StringMethod01 {
    public static String reverse(String str, int start, int end) {
        char temp;
        char[] chars = str.toCharArray();

        if(end<start){
//            System.out.println("end的值应大于start的值");
//            return str;
            throw new RuntimeException("end的值应大于start的值");
        }

        if (end>=str.length()){
//            System.out.println("end的值应小于数组的长度");

            throw new RuntimeException("end的值应小于数组的长度");
        }

        for (int i = start; i <= (end + start) / 2; i++) {
            temp = chars[i];
            chars[i] = chars[end + start - i];
            chars[end + start - i] = temp;

        }

        return String.copyValueOf(chars);
    }
}
