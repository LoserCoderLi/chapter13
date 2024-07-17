package com.ljh.stringbuffer_;

/**
 * @author 李家豪
 * @version 1.0
 */
public class StringBufferMethod {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        // append方法
        stringBuffer.append("huhuhu");
        stringBuffer.append("nihao");
        System.out.println("append方法" + stringBuffer.toString());

        // delete方法
        /*
         *删除 2~4字符，[2，4)
         */
        stringBuffer.delete(2,4);
        System.out.println("delete方法" + stringBuffer.toString());

        // replace
        stringBuffer.replace(0,2,"haha");
        System.out.println("replace方法" + stringBuffer.toString());

        // indexOf
        int indexDf = stringBuffer.indexOf("ha");
        System.out.println("indexOf方法" + indexDf);

        // insert
        /*
        下标为9的位置插入“insert”，其他内容向后放
       */
        stringBuffer.insert(5,"insert");
        System.out.println("insert方法" + stringBuffer);

    }
}
