package com.ljh.math_;

/**
 * @author 李家豪
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {

        // 常用方法
        // abs 绝对值
        System.out.println(Math.abs(-99));
        // pow 求幂
        System.out.println(Math.pow(2, 3));
        // ceil 向上取整 转double类型
        System.out.println(Math.ceil(-3.9));
        // floor 向下取整 转double类型
        System.out.println(Math.floor(-3.9));
        // round 四舍五入
        System.out.println(Math.round(4.45));
        // sqrt 开方
        System.out.println(Math.sqrt(9));

        // random 随机数 2~7
        // random 原函数返回 [0, 1]直接的小数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.round(Math.random() * (7 - 2 + 1) + 2));

        }
    }
}
