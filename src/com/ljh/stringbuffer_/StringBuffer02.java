package com.ljh.stringbuffer_;

/**
 * @author 李家豪
 * @version 1.0
 */
public class StringBuffer02 {

    public static void main(String[] args) {
        // 无参构造器，创建一个大小为16的char[]数组
        StringBuffer stringBuffer = new StringBuffer();

        // 通过构造器指定char[]大小
        StringBuffer stringBuffer1 = new StringBuffer(20);

        // 给一个“nihao”的字符串，char[]大小为 "nihao".length + 16
        StringBuffer stringBuffer2 = new StringBuffer("nihao");

    }
}
