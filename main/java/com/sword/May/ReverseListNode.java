package main.java.com.sword.May;

import main.java.com.sword.April.PrintListNode;

import java.util.Stack;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/4
 */
public class ReverseListNode {
    /**
     * 反转链表
     * 1->2->3->4->5
     * return 5,4,3,2,1
     */
    public static void main(String[] args) {
        PrintListNode.ListNode l1= new PrintListNode.ListNode(1);
        PrintListNode.ListNode l2= new PrintListNode.ListNode(2);
        PrintListNode.ListNode l3= new PrintListNode.ListNode(3);
        PrintListNode.ListNode l4= new PrintListNode.ListNode(4);
        PrintListNode.ListNode l5= new PrintListNode.ListNode(5);
        PrintListNode.ListNode l6= new PrintListNode.ListNode(8);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l1 = reverseListNode(l1);
        while (l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    private static PrintListNode.ListNode reverseListNode(PrintListNode.ListNode head){
        if (head == null || head.next == null) return head;
        Stack<PrintListNode.ListNode> stack = new Stack<>();
        PrintListNode.ListNode dummyNode = new PrintListNode.ListNode(0);
        dummyNode.next = head;
        PrintListNode.ListNode pre = dummyNode;
        while (pre.next != null){
            stack.push(pre.next);
            pre.next = pre.next.next;
        }
        while (!stack.isEmpty()){
            pre.next = stack.pop();
            pre = pre.next;
        }
        pre.next = null;
        return dummyNode.next;
    }


}
