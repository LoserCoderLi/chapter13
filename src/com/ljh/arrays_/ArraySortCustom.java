package com.ljh.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李家豪
 * @version 1.0
 */
public class ArraySortCustom {
    public static void main(String[] args) {
        int arr[] = {1, -1, 8, 0, 20};
        bubble01(arr);
        System.out.println(Arrays.toString(arr));

        bubble01(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });

        System.out.println(Arrays.toString(arr));


    }

    // 冒泡
    public static void bubble01(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 从小到大
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 冒泡加定制
    public static void bubble01(int[] arr, Comparator c) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (c == null) {
                    // 从小到大 默认
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                } else {
                    if (c.compare(arr[j], arr[j + 1]) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

            }
        }
    }


}
