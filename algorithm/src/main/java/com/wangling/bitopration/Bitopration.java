package com.wangling.bitopration;

/**
 *  一个数组中两种数出现了奇数次，其他数多出现了偶数次，怎么找到并打印这两种数
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-20 23:17
 */
public class Bitopration {

    private static void printOddTimesNum(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }

        /**
         * eor = a ^b
         * eor != 0
         * eor 必然有一个位置上是1
         *
         */
        int rightMostOne = eor & (~eor + 1);//提取出eor中最右侧的1
        int onlyOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightMostOne) != 0) {
                onlyOne ^= arr[i];
            }
        }

        System.out.println(onlyOne);
        System.out.println(onlyOne ^ eor);
    }

    // 整数N中1的个数
    private static int bit1counts(int N) {
        int count = 0;
        while (N != 0) {
            //N 最右边的1
            int rightMostOne = N & ((~N) + 1);
            count++;
            N ^= rightMostOne;
        }

        return count;

    }
}
