package com.wangling.sort;

import com.alibaba.fastjson.JSON;

/**
 * 冒泡排序 时间复杂度O(n^2)
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-20 17:50
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 1, 9};
        bubbleSort(arr);
        System.out.println(JSON.toJSONString(arr));
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换arr的i和j的位置
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
