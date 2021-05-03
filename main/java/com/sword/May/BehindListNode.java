package main.java.com.sword.May;

import main.java.com.sword.April.PrintListNode;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/3
 */
public class BehindListNode {
    /**
     * 给定一个链表,返回倒数第k个节点
     * 1,2,3,4,5 k:2  return 4,5
     */

    public static void main(String[] args) {
        PrintListNode.ListNode l1 = new PrintListNode.ListNode(1);
        PrintListNode.ListNode l2 = new PrintListNode.ListNode(2);
        PrintListNode.ListNode l3 = new PrintListNode.ListNode(3);
        PrintListNode.ListNode l4 = new PrintListNode.ListNode(4);
        PrintListNode.ListNode l5 = new PrintListNode.ListNode(5);
        PrintListNode.ListNode l6 = new PrintListNode.ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l1 = behindListNode(l1,6);
        while (l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    private static PrintListNode.ListNode behindListNode(PrintListNode.ListNode listNode, int target) {
        PrintListNode.ListNode dummyHead2 = new PrintListNode.ListNode(0);
        dummyHead2.next = listNode;
        //获取链表的长度
        int count = 1;
        while (listNode.next != null){
            count++;
            listNode = listNode.next;
        }
        //根据获取长度-目标长度就是要遍历的长度
        for (int i = 1; i <= count - target; i++) {
            dummyHead2.next = dummyHead2.next.next;
        }
        return dummyHead2.next;
    }
}
