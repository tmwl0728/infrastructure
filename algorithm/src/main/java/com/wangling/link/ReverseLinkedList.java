package com.wangling.link;

/**
 * @author lingwang
 * @since 1.0.0
 * Created on 2022-03-21 23:53
 */
public class ReverseLinkedList {

    /**
     * 反转单向链表
     * @param head
     * @return
     */
    public static Node reverseLinkedList(Node head) {
        Node pre = null;
        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    /**
     * 反转双向链表
     * @param head
     * @return
     */
    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }

        return pre;
    }

    /**
     * 删掉链表中所有值为value的节点
     * @param head
     * @param value
     * @return
     */
    public static Node removeValue(Node head, int value) {
        //head的值可能为value,先找到从头部开始第一个不为3的节点
        while (head != null) {
            if (head.value != value) {
                break;
            }

            head = head.next;
        }

        //head 来到第一个不需要删的位置
        Node pre = head;
        Node cur = head;

        while (cur != null) {
            if (cur.value == value) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }

            cur = cur.next;
        }

        return head;
    }
}
