package com.wangling.sort;

import com.alibaba.fastjson.JSON;

/**
 * 插入排序 时间复杂度O(n^2)
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-20 18:10
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 1, 9};
        insertSort(arr);
        //comparator(arr);
        System.out.println(JSON.toJSONString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
