package com.wangling.search.binarySearch;

/**
 * 二分不一定是要有序才能二分，只要能找到排他性的规律
 * <p>
 * 局部最小
 * 一个无序数组，这个数组中任意相邻位置的数都不相等，返回任意一个局部最小的数
 * [1,3,2] 这个数组中 1 是局部最小，1 左边没有数，右边的数3比2大
 * 2也是局部最小，3 比2大，2右边没有数
 * [1,4,5,6,3,7,8,9] 3也是局部最小，3比左右两边的数都小
 *
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-20 22:02
 */
public class LocalMinNum {

    private static int getLessIndx(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }

        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int left = 1;
        int right = arr.length - 2;
        int mid = 0;

        while (left < right) {
            mid = left + (right - left) >> 2;
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }
}
