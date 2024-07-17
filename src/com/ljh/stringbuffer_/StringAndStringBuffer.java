package com.ljh.stringbuffer_;

/**
 * @author 李家豪
 * @version 1.0
 */
public class StringAndStringBuffer {

    public static void main(String[] args) {
        // String -> StringBuffer
        String str = "hello,word";
        // 方法一：使用构造器 对str没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        // 方法二：append
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        // StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("你好");
        // 方法一：toString转化
        String str01 = stringBuffer2.toString();
        // 方法二：使用构造器来指定
        String s = new String(stringBuffer2);

    }
}
