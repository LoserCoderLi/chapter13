package com.ljh.stringbuffer_;

/**
 * @author 李家豪
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //1. StringBuffer 的直接父类，AbstractStringBuilder
        //2. StringBuffer 实现了Serializable，即StringBuffer的对象可以串行化
        //3. 在父类中 AbstractStringBuilder 有一个属性 char[] value，不是final
        //   在value 数组存放字符串内容，在堆中
        //4. StringBuffer 是一个final不能被继承
        //5. 因为 StringBuffer 字符内容是存放在char[] value中的，
        //   所以在变化（数组的增/删）时，不用每次都更新地址（即创建对象）
        //   效率高于 String

        StringBuffer stringBuffer = new StringBuffer();
    }
}
