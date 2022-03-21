package com.wangling.link;

/**
 * 双向链表节点
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-21 21:37
 */
public class DoubleNode {

    public int value;

    public DoubleNode last;

    public DoubleNode next;

    public DoubleNode(int value) {
        this.value = value;
    }
}
