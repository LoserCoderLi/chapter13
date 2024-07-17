package com.ljh.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李家豪
 * @version 1.0
 */
public class ArrayMethod01 {
    public static void main(String[] args) {
        Integer[] arr = {1, 21, 16, 5, 10, -4};
        // 显示输出
        System.out.println(Arrays.toString(arr));

        // sort 排序 默认从小到大
        // 可以传入一个接口 Comparator 实现定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
