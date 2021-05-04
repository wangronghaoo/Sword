package main.java.com.sword.May;

import main.java.com.sword.April.PrintListNode;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/4
 */
public class MergeListNode {
    /**
     * 给定俩个有序链表,分别将它们排序成一个链表
     * l1:[1,3,4] l2:[2,3,4]
     * return [1,2,3,3,4]
     */
    public static void main(String[] args) {
        PrintListNode.ListNode l1 = new PrintListNode.ListNode(1);
        PrintListNode.ListNode l2 = new PrintListNode.ListNode(2);
        PrintListNode.ListNode l3 = new PrintListNode.ListNode(3);
        PrintListNode.ListNode l4 = new PrintListNode.ListNode(4);
        PrintListNode.ListNode l5 = new PrintListNode.ListNode(5);
        PrintListNode.ListNode l6 = new PrintListNode.ListNode(8);
        PrintListNode.ListNode l7 = new PrintListNode.ListNode(4);
        PrintListNode.ListNode l8 = new PrintListNode.ListNode(5);
        PrintListNode.ListNode l9 = new PrintListNode.ListNode(6);
        PrintListNode.ListNode l10 = new PrintListNode.ListNode(7);
        PrintListNode.ListNode l11 = new PrintListNode.ListNode(9);
        PrintListNode.ListNode l12 = new PrintListNode.ListNode(10);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;
        l11.next = l12;
        l1 = mergeListNode(l1, l7);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    private static PrintListNode.ListNode mergeListNode(PrintListNode.ListNode l1, PrintListNode.ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        PrintListNode.ListNode dummyNode = new PrintListNode.ListNode(-1);
        PrintListNode.ListNode pre = dummyNode;
        while (l1 != null && l2 != null) {
            //l1 >= l2 将l2赋值给pre,并且将l2重新赋值与l1进行比较
            if (l1.val >= l2.val) {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            } else {
                //l1小于l2 将l1赋值给pre 使l1.next再与l2进行比较
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            }
        }
        //当l1最后一位还小于l2时就将l2赋值给pre.next(l2同理)
        if (l1 == null) {
            pre.next = l2;
        }
        if (l2 == null) {
            pre.next = l1;
        }
        return dummyNode.next;
    }
}
