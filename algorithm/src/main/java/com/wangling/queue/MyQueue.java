package com.wangling.queue;

/**
 * 用数组实现队列和栈
 * 栈比较容易
 * 用数组实现队列相对麻烦，这里是数组实现队列的例子
 *
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-04-10 21:31
 */
public class MyQueue {
    private int[] arr;
    private int pushi;
    private int polli;
    private int size;
    private final int limit;

    public MyQueue(int limit) {
        arr = new int[limit];
        pushi = 0;
        polli = 0;
        size = 0;
        this.limit = limit;
    }

    public void push(int value) {
        if (size == limit) {
            throw new RuntimeException("队列满了，不能在加了");
        }

        size++;
        arr[pushi] = value;
        pushi = nextIndex(pushi);
    }

    public int pop() {
        if (size == 0) {
            throw new RuntimeException("队列满了，不能在加了");
        }
        size--;
        int ans = arr[polli];
        pushi = nextIndex(pushi);
        return ans;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int nextIndex(int i) {
        return i < limit - 1 ? i + 1 : 0;
    }
}