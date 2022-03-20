package com.wangling.search.binarySearch;

/**
 * 在有序数组上找满足>=value的最左位置
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-20 21:53
 */
public class BSNearLeft {

    private static int nearestIndex(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        while (L <= R) {
            int mid = L + (R - L) >> 1;
            if (arr[mid] >= value) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return index;
    }
}
