package com.wangling.search.binarySearch;

/**
 * 判断一个有序数组中一个数是否存在
 * 时间复杂度O(logN)
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-20 19:59
 */
public class BinarySearchExist {

    private static boolean exist(int[] sortArr, int num) {
        if (sortArr == null || sortArr.length == 0) {
            return true;
        }

        int L = 0;
        int R = sortArr.length - 1;
        int mid = 0;

        while (L < R) {
            mid = L + (R - L) >> 1; //mid = (L + R) /2;
            if (sortArr[mid] == num) {
                return true;
            } else if (sortArr[mid] > num) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return sortArr[L] == num;
    }
}
