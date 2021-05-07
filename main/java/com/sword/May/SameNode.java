package main.java.com.sword.May;

import main.java.com.sword.April.PrintListNode;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/7
 */
public class SameNode {
    /**
     * 输入俩个链表节点,返回它们的第一个公共节点
     * 没有则返回null
     */
    public static void main(String[] args) {
        PrintListNode.ListNode l1 = new PrintListNode.ListNode(1);
        PrintListNode.ListNode l2 = new PrintListNode.ListNode(10);
        PrintListNode.ListNode l3 = new PrintListNode.ListNode(8);
        PrintListNode.ListNode l4 = new PrintListNode.ListNode(4);
        PrintListNode.ListNode l5 = new PrintListNode.ListNode(5);
        PrintListNode.ListNode l6 = new PrintListNode.ListNode(78);
        PrintListNode.ListNode l7 = new PrintListNode.ListNode(7);
        PrintListNode.ListNode l8 = new PrintListNode.ListNode(20);
        PrintListNode.ListNode l9 = new PrintListNode.ListNode(67);
        PrintListNode.ListNode l10 = new PrintListNode.ListNode(16);
        PrintListNode.ListNode l11 = new PrintListNode.ListNode(8);
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
        l1 = sameNode(l1, l7);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    /**
     * 双迭代
     * l1与l2每个val进行比较 如果一样则返回该节点
     * 每次l2 = l2.next 遍历完还没有找到则l1遍历下一个next
     * 都没有则返回空
     * @param l1 链表1
     * @param l2 链表2
     * @return 相同节点链表
     */
    private static PrintListNode.ListNode sameNode(PrintListNode.ListNode l1, PrintListNode.ListNode l2) {
        if (l1 == null || l2 == null) return null;
        PrintListNode.ListNode dummyNode1 = new PrintListNode.ListNode(-1);
        PrintListNode.ListNode dummyNode2 = new PrintListNode.ListNode(-1);
        dummyNode2.next = l2;
        int skipL1 = 0;
        int skipL2 = 0;
        while (l1 != null) {
            if (dummyNode2.next == null) dummyNode2.next = l2;
            skipL2 = 0;
            while (dummyNode2.next != null) {
                if (l1.val == dummyNode2.next.val) {
                    dummyNode1.next = dummyNode2.next;
                    dummyNode1.next.next = null;
                    System.out.println("skipL2:" + skipL2);
                    return dummyNode1.next;
                } else {
                    skipL2++;
                    dummyNode2.next = dummyNode2.next.next;
                }
            }
            if (dummyNode1.next != null) {
                return dummyNode1.next;
            } else {
                skipL1++;
                System.out.println("skipL1:" + skipL1);
                l1 = l1.next;
            }
        }
        return dummyNode1.next;
    }
}
