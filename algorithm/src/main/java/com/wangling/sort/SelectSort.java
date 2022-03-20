package com.wangling.sort;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * 选择排序
 * 时间复杂度O(n^2)
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-20 17:17
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 1, 9};
        selectSort(arr);
        //comparator(arr);
        System.out.println(JSON.toJSONString(arr));
    }

    private static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //for test
    private static void comparator(int[] arr) {
        Arrays.sort(arr);
    }


}
